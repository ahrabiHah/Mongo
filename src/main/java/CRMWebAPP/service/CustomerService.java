package CRMWebAPP.service;

import CRMWebAPP.model.Customer;
import CRMWebAPP.repo.ICustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService implements ICustomerService
{
	@Autowired
	private ICustomerRepo repo;

	@Override
	public List<Customer> getCustomerInfo() {
		return (List<Customer>) repo.findAll();
	}

	@Override
	public void registerCustomer(Customer cx) {
		repo.save(cx);
	}

	@Override
	public Customer fetchCustomerById(Integer id) {
		Optional<Customer> optional = repo.findById(id);
		return optional.orElse(null);
	}

	@Override
	public void delete(Integer id) {
		repo.deleteById(id);
	}

	@Override
	public List<Customer> searchCustomersByName(String name) {
		return repo.findByFirstNameContainingOrLastNameContaining(name, name);
	}

	@Override
	public List<Customer> getCustomersByPage(int pageNumber, int pageSize) {
		Pageable pageable = PageRequest.of(pageNumber - 1, pageSize);
		Page<Customer> page = repo.findAll(pageable);
		return page.getContent();
	}

	@Override
	public void deleteBatch(List<Integer> ids) {
		repo.deleteAllById(ids);
	}

	@Override
	public boolean updateCustomer(Customer customer) {
		Optional<Customer> existingCustomer = repo.findById(customer.getId());
		if (existingCustomer.isPresent()) {
			repo.save(customer); // This will update the customer if the ID already exists
			return true;
		} else {
			return false; // If the customer does not exist, return false
		}
	}


}
