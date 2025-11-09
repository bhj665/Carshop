package thesis.carshop.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import thesis.carshop.domain.Worker;

@Controller
public class WorkerController {
    @GetMapping("/createworker")
    public String getWorkers(Model model) {
        model.addAttribute("worker", new Worker());
        return "AddWorker";
    }

    @PostMapping("/saveworker")
    public String setWorkers(@ModelAttribute Worker worker, Model model) {
        model.addAttribute("worker", new Worker());
        return "Workers";
    }
}
