package com.github.badu51.cities_api.repository;

import com.github.badu51.cities_api.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {

}
