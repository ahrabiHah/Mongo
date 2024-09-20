package de.hah.mongo.repo;

import de.hah.mongo.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICustomerRepo extends MongoRepository<Customer,String> {
}
