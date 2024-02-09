package main.org.example.controllers.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @GetMapping
    public String hello() {
        return "hello";
    }

    @GetMapping("/zxc")
    public String someTextzxc() {
        return "zxc";
    }

}
