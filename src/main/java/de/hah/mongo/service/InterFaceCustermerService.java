package de.hah.mongo.service;

import de.hah.mongo.dto.CustomerDto;
import de.hah.mongo.model.Customer;

import java.util.List;

public interface InterFaceCustermerService {

    public String registerCustomer(CustomerDto dto);

    public List<Customer> fetchAllCustomers();

    public String removeCustomerInfo(String name);
}
