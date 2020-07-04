package com.mostafa.springboot.ddd.task.domain.repository;

import com.mostafa.springboot.ddd.task.domain.aggregate.Customer;

public interface CustomerRepository {

    Customer getCustomerById(Integer customerId);
}