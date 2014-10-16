package com.namics.test.sample.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.namics.test.sample.app.model.Company;

public interface CompanyRepository extends CrudRepository<Company, Long> {
    
}
