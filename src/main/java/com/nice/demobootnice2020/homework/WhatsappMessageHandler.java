package com.nice.demobootnice2020.homework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
public class WhatsappMessageHandler implements MessageHandler {
    @Override
    public String handle(Message message) {
        System.out.println("sending by whatsapp");
        return message.getText()+ "was sent by whatsapp";
    }

    @Override
    public int myType() {
        return 2;
    }



}

