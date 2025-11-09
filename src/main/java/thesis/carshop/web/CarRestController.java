package thesis.carshop.web;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import thesis.carshop.domain.Car;
import thesis.carshop.domain.CarRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
@RestController
public class CarRestController {
@Autowired
private CarRepository carrepository;
@GetMapping("/cars")
public @ResponseBody List<Car> getCarsRest() {
return (List<Car>) carrepository.findAll();
}
@GetMapping("/cars/{registernumber}")
public @ResponseBody Optional<Car> findCarsRest(@PathVariable("registernumber") String rn) {
return carrepository.findByRegisternumber(rn);
}
}
