package com.tinyurl.controllers;

import com.tinyurl.model.UrlMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by leoz on 4/8/18.
 */
@RestController
@RequestMapping("/url")
public class UrlController {

    @RequestMapping(method = RequestMethod.POST, value = "/{longUrl}")
    public UrlMapping postUrl(@PathVariable String longUrl) {
        return null;
    }


}
