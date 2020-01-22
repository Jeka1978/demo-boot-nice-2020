package com.nice.demobootnice2020.homework;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
public class TelegramHandler implements MessageHandler {
    @Override
    public String handle(Message message) {
        return message.getText() + "  was sent by telegram";
    }

    @Override
    public int myType() {
        return 3;
    }
}
