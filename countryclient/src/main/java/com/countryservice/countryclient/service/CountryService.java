package com.countryservice.countryclient.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.countryservice.countryclient.dao.CountryDetailsDao;
import com.countryservice.countryclient.model.CountryDetails;

@Service
public class CountryService {
	@Autowired
	CountryDetailsDao countryDetailsDao;
	
	@Cacheable(value="countryCache", key="#country_id", unless="#result==null" )
	public CountryDetails getCountryCapital(int country_id) {
		System.out.println("Fetching from DB");
		return countryDetailsDao.getCountryDetails(country_id).get();
	}

	@Transactional
	@CachePut(value="countryCache", key="#country_id", unless="#result==null")
	public CountryDetails saveCountryDetails(CountryDetails countryDetails, int country_id) {
		return countryDetailsDao.saveCountryDetails(countryDetails);
	}

	@Transactional
	@CachePut(value="countryCache", key="#country_id", unless="#result==null")
	public CountryDetails updateDetails(CountryDetails countryDetails, int country_id) {
		return countryDetailsDao.updateDetails(countryDetails);
	}
}
