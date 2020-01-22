package com.nice.demobootnice2020.game_of_thrones;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

/**
 * @author Evgeny Borisov
 */
@RepositoryRestResource
public interface BankDao extends JpaRepository<Bank,Integer> {


    List<Bank> findBanksByBalanceGreaterThan(int balance);


}
