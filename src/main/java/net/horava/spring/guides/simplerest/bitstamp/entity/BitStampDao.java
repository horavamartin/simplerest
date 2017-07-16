package net.horava.spring.guides.simplerest.bitstamp.entity;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Martin Horava
 */
@Repository
public interface BitStampDao extends CrudRepository<BitStampTicker, Long> {

}
