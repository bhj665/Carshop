package thesis.carshop.web;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import thesis.carhsop.domain.Customer;
import thesis.carshop.domain.CustomerRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class CustomerRestController {
    @Autowired
    private CustomerRepository customerrepository;

    @GetMapping("/customers")
    public @ResponseBody List<Customer> getCustomersRest() {
        return (List<Customer>) customerrepository.findAll();
    }

    @GetMapping("/customers/{customerid}")
    public @ResponseBody Optional<Customer> findCustomersRest(@PathVariable("customerid") int cid) {
        return customerrepository.findByCustomerid(cid);
    }
}
