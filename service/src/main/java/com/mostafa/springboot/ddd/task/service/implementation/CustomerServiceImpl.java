package com.mostafa.springboot.ddd.task.service.implementation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mostafa.springboot.ddd.task.domain.aggregate.Customer;
import com.mostafa.springboot.ddd.task.domain.repository.CustomerRepository;
import com.mostafa.springboot.ddd.task.domain.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

    private static final Logger logger = LoggerFactory.getLogger(CustomerServiceImpl.class);

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Customer getCustomerById(Integer customerId) {
        logger.info("Inside CustomerServiceImpl........");
        Customer customer = customerRepository.getCustomerById(customerId);
        return customer;
    }
}