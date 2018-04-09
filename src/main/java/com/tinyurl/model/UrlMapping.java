package com.tinyurl.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by leoz on 4/8/18.
 */
@Entity
public class UrlMapping {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String longUrl;

    protected UrlMapping() { }

    public UrlMapping(String longUrl) {
        this.longUrl = longUrl;
    }

    public Long getId() { return id; }

    public String getLongUrl() { return longUrl; }

    @Override
    public String toString() {
        return String.format("UrlMapping[id=%d, longUrl='%s']",
                id, longUrl);
    }
}
