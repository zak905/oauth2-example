package com.gwidgets.examples.resourceserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController("/")
public class ResourceController {

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("/foo")
    public String foo(){
        return "foo";
    }

    @GetMapping("/bar")
    public String bar(){
        return "bar";
    }

    @GetMapping("/test")
    public String test(){
        return "test";
    }
}
