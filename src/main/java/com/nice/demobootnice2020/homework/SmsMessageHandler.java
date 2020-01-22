package com.nice.demobootnice2020.homework;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component("1")
public class SmsMessageHandler implements MessageHandler {
    @Override
    public String handle(Message message) {
        System.out.println("sending by sms");
        return message.getText()+ "was sent by sms";
    }
}
