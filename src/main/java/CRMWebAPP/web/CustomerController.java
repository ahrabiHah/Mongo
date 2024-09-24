package CRMWebAPP.web;

import CRMWebAPP.model.Customer;
import CRMWebAPP.service.ICustomerService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@Tag(name = "Customer Management", description = "API for Customer Management including creation, update, deletion, and retrieval.")
public class CustomerController {

	@Autowired
	private ICustomerService service;

	/**
	 * Retrieve all customers.
	 *
	 * @param model the model to store customers list
	 * @return the view displaying the list of customers
	 */
	@Operation(summary = "Get Customer List", description = "Retrieve the list of all customers.")
	@GetMapping("/cxlist")
	public String getCustomerInfo(Model model) {
		List<Customer> customers = service.getCustomerInfo();
		model.addAttribute("customers", customers);
		return "customerlist"; // This should match the JSP filename
	}

	/**
	 * Show form for creating a new customer.
	 *
	 * @param model the model to store a new customer object
	 * @return the view displaying the form to create a customer
	 */
	@Operation(summary = "Show Create Customer Form", description = "Show a form to input new customer details.")
	@GetMapping("/showForm")
	public String showForm(Model model) {
		Customer c = new Customer();
		model.addAttribute("customer", c);
		return "showform";
	}

	/**
	 * Register a new customer.
	 *
	 * @param customer the customer object to be registered
	 * @param model the model
	 * @return redirects to the list of customers after successful registration
	 */
	@Operation(summary = "Register a New Customer", description = "Submit new customer data to register them in the system.")
	@PostMapping("/registerCustomer")
	public String register(@ModelAttribute("customer") Customer customer, Model model) {
		service.registerCustomer(customer);
		return "redirect:/cxlist";
	}

	/**
	 * Show form for updating an existing customer.
	 *
	 * @param id the id of the customer to be updated
	 * @param model the model to store customer data
	 * @return the view displaying the form to update customer details
	 */
	@Operation(summary = "Show Update Customer Form", description = "Show a form to update existing customer details.")
	@GetMapping("/updateForm")
	public String showUpdateForm(@RequestParam("customerId") Integer id, Model model) {
		Customer cx = service.fetchCustomerById(id);
		model.addAttribute("customer", cx);
		return "updateform";
	}

	/**
	 * Delete a customer by ID.
	 *
	 * @param id the id of the customer to be deleted
	 * @return redirects to the list of customers after deletion
	 */
	@Operation(summary = "Delete Customer", description = "Delete a customer by their ID.")
	@GetMapping("/deleteData")
	public String delete(@RequestParam("customerId") Integer id) {
		System.out.println("Control in /delete");
		service.delete(id);
		System.out.println("Deleted");
		return "redirect:/cxlist";
	}

	@Operation(summary = "Search Customer", description = "Search for a customer by name.")
	@GetMapping("/search")
	public String search(@RequestParam("name") String name, Model model) {
		List<Customer> customers = service.searchCustomersByName(name);
		model.addAttribute("customers", customers);
		return "customerlist";
	}
	

}
