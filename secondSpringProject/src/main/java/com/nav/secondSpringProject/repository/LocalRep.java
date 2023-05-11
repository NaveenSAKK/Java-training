package com.nav.secondSpringProject.repository;

import com.nav.secondSpringProject.entity.LocalTour;
import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository

public interface LocalRep  extends CrudRepository<LocalTour,Long> {
//   @Modifying      // to mark delete or update query
//   @Query(value = "DELETE FROM atbl_foreign e WHERE e.travellercode = :travellercode")
//   Long removeByTravellercode(@Param("travellercode")Long travellercode);
}
