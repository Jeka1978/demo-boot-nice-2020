package com.nice.demobootnice2020.homework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * @author Evgeny Borisov
 */
@Service
public class MessageProcessorServiceImpl implements MessageProcessorService {

    private Map<Integer,MessageHandler> map = new HashMap<>();

    @Override
    public void registerHandler(MessageHandler messageHandler, int code) {
        if (map.containsKey(code)) {
            throw new IllegalStateException(code + " already exists");
        }
        map.put(code, messageHandler);
    }


    @Override
    public String processMessage(Message message) {
        int processingType = message.getProcessingType();
        MessageHandler messageHandler = map.get(processingType);
        if (messageHandler == null) {
            throw new UnsupportedOperationException(processingType + " not supported yet");
        }
       return messageHandler.handle(message);
    }
}




