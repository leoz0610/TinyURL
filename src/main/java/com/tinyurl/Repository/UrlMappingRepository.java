package com.tinyurl.Repository;

import com.tinyurl.model.UrlMapping;
import org.springframework.data.repository.CrudRepository;


/**
 * Created by leoz on 4/8/18.
 */
public interface UrlMappingRepository extends CrudRepository<UrlMapping, Long> {
    //UrlMapping createUrlMapping(String longUrl);
}
