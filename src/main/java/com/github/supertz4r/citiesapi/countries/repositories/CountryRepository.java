package com.github.supertz4r.citiesapi.countries.repositories;

import com.github.supertz4r.citiesapi.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
