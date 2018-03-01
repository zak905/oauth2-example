package com.gwidgets.examples.resourceserver;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController("/")
public class ResourceController {

    @PreAuthorize("#oauth2.hasScope('read')")
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @PreAuthorize("#oauth2.hasScope('read')")
    @GetMapping("/foo")
    public String foo(){
        return "foo";
    }

    @PreAuthorize("#oauth2.hasScope('write')")
    @PostMapping("/bar")
    public String bar(){
        return "bar";
    }

    @PreAuthorize("#oauth2.hasScope('trust')")
    @DeleteMapping("/test")
    public String test(){
        return "test";
    }
}
