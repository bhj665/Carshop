package thesis.carshop.domain;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
public interface CarRepository extends CrudRepository<Car, String> {
List<Car> findByRegisternumber(String registernumber);
}
