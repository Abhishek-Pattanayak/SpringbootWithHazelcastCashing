package com.countryservice.countryclient.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.countryservice.countryclient.model.CountryDetails;

public interface CountryDetailsRepository extends CrudRepository<CountryDetails, Integer>{
}
