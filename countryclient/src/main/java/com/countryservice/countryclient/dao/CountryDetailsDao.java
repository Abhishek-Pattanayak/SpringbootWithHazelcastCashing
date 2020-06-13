package com.countryservice.countryclient.dao;

import java.util.Optional;

import com.countryservice.countryclient.model.CountryDetails;


public interface CountryDetailsDao {
	public Optional<CountryDetails> getCountryDetails(int country_id);
	public CountryDetails saveCountryDetails(CountryDetails countryDetails);
	public CountryDetails updateDetails(CountryDetails countryDetails);
}
