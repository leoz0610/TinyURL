package com.tinyurl.Repository;

import com.tinyurl.model.UrlMapping;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


/**
 * Created by leoz on 4/8/18.
 */
@Repository
public interface UrlMappingRepository extends CrudRepository<UrlMapping, Long> {
    //UrlMapping createUrlMapping(String longUrl);
}
