package CRMWebAPP.service;


import CRMWebAPP.model.Customer;

import java.util.List;



import CRMWebAPP.model.Customer;

import java.util.List;

public interface ICustomerService
{
    List<Customer> getCustomerInfo();

    void registerCustomer(Customer cx);

    Customer fetchCustomerById(Integer id);

    void delete(Integer id);

    List<Customer> searchCustomersByName(String name);

    List<Customer> getCustomersByPage(int pageNumber, int pageSize);

    void deleteBatch(List<Integer> ids);

    boolean updateCustomer(Customer cx);

}

