package com.tinyurl.controllers;

import com.tinyurl.Repository.UrlMappingRepository;
import com.tinyurl.model.UrlMapping;
import org.springframework.beans.factory.annotation.Autowired;
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
    private final UrlMappingRepository urlMappingRepository;

    @Autowired
    public UrlController(UrlMappingRepository urlMappingRepository) {
        this.urlMappingRepository = urlMappingRepository;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/{longUrl}")
    public UrlMapping postUrl(@PathVariable String longUrl) {
        UrlMapping mapping = new UrlMapping();
        mapping.setLongUrl(longUrl);
        urlMappingRepository.save(mapping);
        return mapping;
    }


}
