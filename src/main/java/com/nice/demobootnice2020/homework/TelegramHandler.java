package com.nice.demobootnice2020.homework;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component("3")
public class TelegramHandler implements MessageHandler {
    @Override
    public String handle(Message message) {
        return message.getText() + "  was sent by telegram";
    }
}
