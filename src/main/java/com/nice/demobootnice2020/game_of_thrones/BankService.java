package com.nice.demobootnice2020.game_of_thrones;

import com.nice.ironbankstarter2020.NotEnoughMoneyException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Evgeny Borisov
 */
@Service
@Transactional
public class BankService {
    @Autowired
    private BankDao bankDao;
    @Autowired
    private PredictionService predictionService;


    @EventListener(ContextRefreshedEvent.class)
    protected void initBank() {
        Bank bank = new Bank();
        bank.setBalance(100);
        bankDao.save(bank);
    }


    public String loan(String name, int amount) {
        Bank bank = bankDao.findAll().get(0);
        if (bank.getBalance() < amount) {
            throw new NotEnoughMoneyException("not enough money in bank");
        }
        if (predictionService.willSurvive(name)) {
            bank.setBalance(bank.getBalance() - amount);
            return "your loan is accepted";
        } else {
            return "rejected, you will die soon";
        }
    }


}
