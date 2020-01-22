package com.nice.demobootnice2020.controllers;

import lombok.*;
import lombok.experimental.Wither;

/**
 * @author Evgeny Borisov
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Wither
public class Person {
    private String name;
    private int age;
}
