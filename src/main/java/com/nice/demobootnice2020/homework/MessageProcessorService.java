package com.nice.demobootnice2020.homework;

/**
 * @author Evgeny Borisov
 */
public interface MessageProcessorService {

    void registerHandler(MessageHandler messageHandler, int code);

    String processMessage(Message message);
}
