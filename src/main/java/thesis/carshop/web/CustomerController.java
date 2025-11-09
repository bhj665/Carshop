package thesis.carshop.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import thesis.carshop.domain.Customer;

@Controller
public class CustomerController {
    @GetMapping("/createcustomer")
    public String getCustomers(Model model) {
        model.addAttribute("customer", new Customer());
        return "AddCustomer";
    }

    @PostMapping("/savecustomer")
    public String setCustomers(@ModelAttribute Customer customer, Model model) {
        model.addAttribute("customer", new Customer());
        return "Customers";
    }
}
