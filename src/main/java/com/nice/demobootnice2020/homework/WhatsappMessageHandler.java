package com.nice.demobootnice2020.homework;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component("2")
public class WhatsappMessageHandler implements MessageHandler {
    @Override
    public String handle(Message message) {
        System.out.println("sending by whatsapp");
        return message.getText()+ "was sent by whatsapp";
    }
}
