package com.nice.demobootnice2020;

import com.nice.demobootnice2020.homework.MessageHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.toMap;

@SpringBootApplication
public class DemoBootNice2020Application {

    @Bean
    public Map<Integer, MessageHandler> messageHandlerMap(List<MessageHandler> handlers){
       return handlers.stream().collect(toMap(MessageHandler::myType, identity()));
    }




    public static void main(String[] args) {
        SpringApplication.run(DemoBootNice2020Application.class, args);
    }

}
