package com.codegym.cms.service;

import com.codegym.cms.model.Customer;
import com.codegym.cms.model.Province;

import java.util.List;

public interface CustomerService {
    Iterable<Customer> findAll();

    Customer findById(Long id);


    void remove(Long id);

    void save(Customer customer);

    Iterable<Customer> findAllByProvince(Province province);
}
