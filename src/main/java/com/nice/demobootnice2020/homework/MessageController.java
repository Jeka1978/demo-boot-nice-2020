package com.nice.demobootnice2020.homework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Evgeny Borisov
 */
@RestController
public class MessageController {

    @Autowired
    private MessageProcessorService service;

    @PostMapping("/message")
    public String handleMessage(@RequestBody Message message) {
        return service.processMessage(message);
    }
}
