package CRMWebAPP.repo;


import CRMWebAPP.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface ICustomerRepo extends JpaRepository<Customer, Integer> {
    List<Customer> findByFirstNameContainingOrLastNameContaining(String firstName, String lastName);

        List<Customer> findByLastName(String lastName);
        List<Customer> findByLastNameContaining(String lastName);
        List<Customer> findByFirstNameContaining(String firstName);
}
