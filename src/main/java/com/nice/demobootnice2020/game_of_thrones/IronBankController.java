package com.nice.demobootnice2020.game_of_thrones;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Evgeny Borisov
 */
@RestController
@RequestMapping("/bank")
public class IronBankController {
    @Autowired
    private BankService bankService;

    @GetMapping("/loan")
    public String loan(@RequestParam String name, @RequestParam int amount){
        return bankService.loan(name, amount);
    }



}
