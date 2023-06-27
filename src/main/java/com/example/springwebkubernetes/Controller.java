package com.example.springwebkubernetes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hi")
public class Controller {

    @GetMapping("/{hello}")
    public String hellomessage(@PathVariable String hello){
        return "hello hi " + hello;
    }

}
