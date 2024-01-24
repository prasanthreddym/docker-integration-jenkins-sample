package com.docker.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "demo")
public class DemoController {

    @RequestMapping(path = "/hello")
    public String sayHello(){
        return "Hello Docker Demo";
    }
}
