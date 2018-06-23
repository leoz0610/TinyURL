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

    public Long getId() { return id; }

    public String getLongUrl() { return longUrl; }

    public void setId(Long id) { this.id = id; }

    public void setLongUrl(String url) { this.longUrl = url; }

    @Override
    public String toString() {
        return String.format("UrlMapping[id=%d, longUrl='%s']",
                id, longUrl);
    }
}
