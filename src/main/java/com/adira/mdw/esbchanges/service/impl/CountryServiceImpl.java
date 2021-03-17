package com.adira.mdw.esbchanges.service.impl;

import com.adira.mdw.esbchanges.domain.Country;
import com.adira.mdw.esbchanges.repository.CountryRepository;
import com.adira.mdw.esbchanges.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CountryServiceImpl implements CountryService {

    @Autowired
    private CountryRepository countryRepository;

    @Override
    public List<Country> getAll() {
        return countryRepository.findAll();
    }

    @Override
    public Optional<Country> findById(String id) {
        return countryRepository.findById(id);
    }

    @Override
    public Country save(Country country) {
        return countryRepository.save(country);
    }
}
