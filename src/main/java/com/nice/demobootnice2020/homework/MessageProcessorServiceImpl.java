package com.nice.demobootnice2020.homework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author Evgeny Borisov
 */
@Service
public class MessageProcessorServiceImpl implements MessageProcessorService {


    @Autowired
    private Map<Integer,MessageHandler> map;


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




