package com.nartan.ba.resource.repository;

import com.nartan.ba.resource.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CountryRepository extends JpaRepository<Country, String> {

  List<Country> findAll();
}
