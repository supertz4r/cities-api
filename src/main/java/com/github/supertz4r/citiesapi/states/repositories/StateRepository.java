package com.github.supertz4r.citiesapi.states.repositories;

import com.github.supertz4r.citiesapi.states.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
