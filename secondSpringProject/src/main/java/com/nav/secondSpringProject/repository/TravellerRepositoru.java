package com.nav.secondSpringProject.repository;

import com.nav.secondSpringProject.entity.Travellers;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.*;

@Repository
public interface TravellerRepositoru extends CrudRepository<Travellers,Long> {
    public List<Travellers> findByTravellerNameIgnoreCaseContaining(String travellerName);
}
