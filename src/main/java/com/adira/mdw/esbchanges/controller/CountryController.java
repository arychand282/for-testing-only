package com.adira.mdw.esbchanges.controller;

import com.adira.mdw.esbchanges.domain.Country;
import com.adira.mdw.esbchanges.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/v1/country")
public class CountryController {

    @Autowired
    private CountryService countryService;

    @PostMapping(value = "/", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void save(@RequestBody Country country) {
        countryService.save(country);
    }

    @GetMapping(value = "/get_all")
    public List<Country> getAll() {
        String date = "18689";
        Date dateConverted = new Date(Long.parseLong(date) * 1000);
        System.out.println(dateConverted);

        return countryService.getAll();
    }

}
