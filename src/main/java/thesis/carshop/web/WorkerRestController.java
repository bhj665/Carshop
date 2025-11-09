package thesis.carshop.web;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import thesis.carshop.domain.Worker;
import thesis.carshop.domain.WorkerRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class WorkerRestController {
    @Autowired
    private WorkerRepository workerrepository;

    @GetMapping("/workers")
    public @ResponseBody List<Worker> getWorkersRest() {
        return (List<Worker>) workerrepository.findAll();
    }

    @GetMapping("/workers/{workerid}")
    public @ResponseBody Optional<Worker> findWorkersRest(@PathVariable("workerid") int wid) {
        return workerrepository.findByWorkerid(wid);
    }
}
