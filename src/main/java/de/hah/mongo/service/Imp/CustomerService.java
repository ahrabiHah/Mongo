package de.hah.mongo.service.Imp;

import de.hah.mongo.dto.CustomerDto;
import de.hah.mongo.model.Customer;
import de.hah.mongo.repo.ICustomerRepo;
import de.hah.mongo.service.InterFaceCustermerService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService implements InterFaceCustermerService {



    @Autowired
    private ICustomerRepo customerRepo;


    @Override
    public String registerCustomer(CustomerDto dto) {
        Customer customer = new Customer();

        BeanUtils.copyProperties(dto,customer);

        Customer c=customerRepo.save(customer);
        return "it is saved";
    }

    @Override
    public List<Customer> fetchAllCustomers() {
        return null;
    }

    @Override
    public String removeCustomerInfo(String name) {
        return null;
    }
}
