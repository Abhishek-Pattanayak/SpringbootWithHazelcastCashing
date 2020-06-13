package com.countryservice.countryclient.dao;

import java.util.Optional;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.countryservice.countryclient.model.CountryDetails;
import com.countryservice.countryclient.repository.CountryDetailsRepository;

@Service
public class CountryDetailsDaoImpl implements CountryDetailsDao{
	
	@Autowired
	CountryDetailsRepository countryDetailsRepository;
	
	@Override
	public Optional<CountryDetails> getCountryDetails(int country_id) {
		Optional<CountryDetails> optional = countryDetailsRepository.findById(country_id);
		return optional;
	}
	
	@Override
	public CountryDetails saveCountryDetails(CountryDetails countryDetails) {
		return countryDetailsRepository.save(countryDetails);
	}

	@Override
	public CountryDetails updateDetails(CountryDetails countryDetails) {
		return countryDetailsRepository.save(countryDetails);
	}

}
