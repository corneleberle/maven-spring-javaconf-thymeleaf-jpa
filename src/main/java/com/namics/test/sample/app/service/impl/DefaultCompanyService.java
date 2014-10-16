package com.namics.test.sample.app.service.impl;

import com.namics.test.sample.app.builder.CompanyBuilder;
import com.namics.test.sample.app.model.Company;
import com.namics.test.sample.app.repository.CompanyRepository;
import com.namics.test.sample.app.service.CompanyService;
import org.apache.commons.collections4.IteratorUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DefaultCompanyService implements CompanyService {

    @Autowired
    private CompanyRepository companyRepository;

    public List<Company> getCompanies() {
        List<Company> companies = IteratorUtils.toList(companyRepository.findAll().iterator());

        if (companies.isEmpty()) {
            companies.add(companyRepository.save(new CompanyBuilder().name("Namics AG").employees(450).build()));
            companies.add(companyRepository.save(new CompanyBuilder().name("Swisscom AG").employees(12000).build()));
        }

        return companies;
    }

}
