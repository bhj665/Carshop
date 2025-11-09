package thesis.carshop.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {
    List<Customer> findByCustomerid(int customerid);
}
