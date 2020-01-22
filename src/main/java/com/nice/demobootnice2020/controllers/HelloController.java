package com.nice.demobootnice2020.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author Evgeny Borisov
 */
@RestController
@RequestMapping("/api")
public class HelloController {


    @PostMapping("/person")
    public Person processPerson(@RequestBody Person person) {
        return person.withName(person.getName().toUpperCase()).withAge(person.getAge()+1);
    }

    @GetMapping("/hello2")
    public Person hello2(@RequestParam String name, @RequestParam int age) {
        return new Person(name, age);
    }


    @GetMapping("/hello")
    public String hello(){
        return "HELLO";
    }


    @GetMapping("/hello/{name}")
    public String helloByName(@PathVariable String name) {
        return name.toUpperCase();
    }


    @SneakyThrows
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        Person jeremy = new Person("Jeremy", 35);
        String json = mapper.writeValueAsString(jeremy);
        System.out.println("json = " + json);

        Person person = mapper.readValue(json, Person.class);
        System.out.println("person = " + person);
    }







}
