package com.tinyurl.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by leoz on 10/14/17.
 */
@RestController
@RequestMapping("/ping")
public class PingController {

    @RequestMapping(method = RequestMethod.GET)
    public String ping() {
        return "Pong";
    }
}
