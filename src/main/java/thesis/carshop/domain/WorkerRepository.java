package thesis.carshop.domain;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface WorkerRepository extends CrudRepository<Worker, Integer> {
    List<Worker> findByWorkerid(int workerid);
}
