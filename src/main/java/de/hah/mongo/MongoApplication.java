package de.hah.mongo;

import de.hah.mongo.dto.CustomerDto;
import de.hah.mongo.model.Customer;
import de.hah.mongo.service.Imp.CustomerService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MongoApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext container = SpringApplication.run(MongoApplication.class, args);
        CustomerService c=container.getBean(CustomerService.class);

        CustomerDto customer= new CustomerDto();
        customer.setCxNo("20");
        customer.setId("40");
        customer.setCity("Hamburg");
        customer.setName("Hesham");
        String s = c.registerCustomer(customer);

        System.out.println(s);
    }

}
