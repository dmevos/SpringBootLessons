package ru.osipov.springbootdemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import ru.osipov.springbootdemo.domain.Person;

@RestController
public class HelloController {
    @Value("${prop.str}")
    private String[] str;

    @PostMapping("/hello")
    private String hello(@RequestBody Person guest) {
        return String.format("Привет %s %d лет, от %s %s!",
                guest.getName(), guest.getAge(), str[0], str[1]);
    }

    @GetMapping("/helloget")
    private String helloget(Person guest) {
        return String.format("Привет %s %d лет, от %s %s!",
                guest.getName(), guest.getAge(), str[0], str[1]);
    }
    @GetMapping("/helloget2")
    private String helloget2(@RequestParam("name") String name,
                             @RequestParam("age") int age) {
        return String.format("Привет %s %d лет, от %s %s!",
                name, age, str[0], str[1]);
    }
}
