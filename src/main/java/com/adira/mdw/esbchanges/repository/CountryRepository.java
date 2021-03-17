package com.adira.mdw.esbchanges.repository;

import com.adira.mdw.esbchanges.domain.Country;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CountryRepository extends PagingAndSortingRepository<Country, String> {

    List<Country> findAll();

    Optional<Country> findById(String id);

    Optional<Country> findByCode(String code);

}
