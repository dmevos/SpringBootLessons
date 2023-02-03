package ru.osipov.springbootdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.osipov.springbootdemo.domain.Person;

@RequestMapping("/another")
@RestController
public class AnotherBrokenController {

    @GetMapping("/iae")
    public Person throwException() {
        throw new IllegalArgumentException("throwException");
    }
}
