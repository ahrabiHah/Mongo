package CRMWebAPP.web;


import CRMWebAPP.model.Customer;
import CRMWebAPP.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class CustomerController
{
	@Autowired
	private ICustomerService service;
	
	@GetMapping("/cxlist")
	public String getCustomerInfo(Model model)
	{
		List<Customer> customers = service.getCustomerInfo();
		model.addAttribute("customers", customers);
//		for(Customer c:customers)
//		{
//			int id=c.getId();
//			
//			System.out.println(c.getFirstName());
//			System.out.println(c.getLastName());
//			System.out.println(c.getCity());
//			
//			System.out.println("link is + update"+ id);
//		}
		
		return "customerlist";
		
	}
	@GetMapping("/showForm")
	public String showForm(Model model)
	{
		Customer c=new Customer();
		model.addAttribute("customer", c);
		return "showform";
	}
	
	@PostMapping("/registerCustomer")
	public String register(@ModelAttribute("customer")Customer customer,Model model)
	{
		service.registerCustomer(customer);
		return "redirect:/cxlist";
	}
	
	@GetMapping("/updateForm")
	public String showUpdateForm(@RequestParam("customerId")Integer id,Model model)
	{
		Customer cx = service.fetchCustomerById(id);
		
		model.addAttribute("customer", cx);
		return "updateform";
	}
	
	@GetMapping("/deleteData")
	public String delete(@RequestParam("customerId")Integer id)
	{
		System.out.println("Control in /delete");
		service.delete(id);
		System.out.println("Deleted");
		return "redirect:/cxlist"; 
	}
	
	

}
