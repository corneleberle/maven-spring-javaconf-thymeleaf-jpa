package com.namics.test.sample.app.builder;

import com.namics.test.sample.app.model.Company;

public class CompanyBuilder {

    private Company company = new Company();

    public CompanyBuilder name(String name) {
        this.company.setName(name);
        return this;
    }

    public CompanyBuilder employees(int employees) {
        this.company.setEmployees(employees);
        return this;
    }

    public Company build() {
        return this.company;
    }

}
