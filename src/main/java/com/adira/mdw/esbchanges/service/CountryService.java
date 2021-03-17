package com.adira.mdw.esbchanges.service;

import com.adira.mdw.esbchanges.domain.Country;

import java.util.List;
import java.util.Optional;

public interface CountryService {

    List<Country> getAll();

    Optional<Country> findById(String id);

    Country save(Country country);

}
