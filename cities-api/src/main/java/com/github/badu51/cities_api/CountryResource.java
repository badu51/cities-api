package com.github.badu51.cities_api;

import com.github.badu51.cities_api.countries.Country;
import com.github.badu51.cities_api.repository.CountryRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;


@RestController
//@RequestMapping("/countries")
public class CountryResource {

    private final CountryRepository repository;

    public CountryResource(CountryRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/countries")
    public Page<Country> countries(Pageable page){
        return repository.findAll(page);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Country> getOne(@PathVariable Long id){
        //return repository.findById(id);

        Optional<Country> optional = repository.findById(id);


        return ResponseEntity.ok().body(optional.get());
    }
}
