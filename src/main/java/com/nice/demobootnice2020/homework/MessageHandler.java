package com.nice.demobootnice2020.homework;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Evgeny Borisov
 */
public interface MessageHandler {
    String handle(Message message);

    int myType();


    @Autowired
    default void registerMyself(MessageProcessorService messageProcessorService) {
        messageProcessorService.registerHandler(this, myType());
    }
}
