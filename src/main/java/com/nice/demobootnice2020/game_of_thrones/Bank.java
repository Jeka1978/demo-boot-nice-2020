package com.nice.demobootnice2020.game_of_thrones;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Evgeny Borisov
 */
@Data
@Entity
public class Bank {

    @Id
    @GeneratedValue
    private int id;

    private int balance;
















}
