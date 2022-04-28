package com.nartan.ba.resource.repository;

import com.nartan.ba.resource.model.Apartment;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ApartmentRepository extends JpaRepository<Apartment, Integer> {

  Page<Apartment> findAll(@Param("pageable") Pageable pageable);

  @Query("select a from #{#entityName} a, Building b where a.building = b and b.buildingId=:buildingId")
  Page<Apartment> findApartmentsbyBuilding(@Param("buildingId") int buildingId,
      @Param("pageable") Pageable pageable);
}
