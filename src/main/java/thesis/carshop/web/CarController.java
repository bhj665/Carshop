package thesis.carshop.web;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import thesis.carshop.domain.Car;
@Controller
public class CarController {
@GetMapping("/createcar")
public String getCars(Model model) {
model.addAttribute("car", new Car());
return "AddCar";
}
@PostMapping("/savecar")
public String setCars(@ModelAttribute Car car, Model model) {
model.addAttribute("car", new Car());
return "Cars";
}
}
