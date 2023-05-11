package com.nav.secondSpringProject.repository;

import com.nav.secondSpringProject.entity.ForeignTour;
import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface ForeignRep extends CrudRepository<ForeignTour,Long> {
//  @Modifying      // to mark delete or update query
//  @Query(value = "DELETE FROM atbl_local e WHERE e.travellercode = :travellercode")
//  Long removeByTravellercode(@Param("travellercode") Long travellercode);
}
