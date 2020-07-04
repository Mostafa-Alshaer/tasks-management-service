package com.mostafa.springboot.ddd.task.domain.service;

import com.mostafa.springboot.ddd.task.domain.aggregate.Customer;

public interface CustomerService {

    Customer getCustomerById(Integer customerId);
}