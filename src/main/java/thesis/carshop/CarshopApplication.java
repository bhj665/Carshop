package thesis.carshop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import thesis.carshop.domain.Car;
import thesis.carshop.domain.CarRepository;
import thesis.carshop.domain.Customer;
import thesis.carshop.domain.CustomerRepository;
import thesis.carshop.domain.Worker;
import thesis.carshop.domain.WorkerRepository;

@SpringBootApplication
public class CarshopApplication {
	private static final Logger log = LoggerFactory.getLogger(CarshopApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(CarshopApplication.class, args);
	}

	@Bean
	public CommandLineRunner cardata(CarRepository carrepository, CustomerRepository customerrepository,
			WorkerRepository workerrepository) {
		return (args) -> {
			log.info("Save more information of car");
			carrepository.save(new Car("OSG-981", "Lada", "beige", "95-octane", 2000, "20000 €", 1, 1));
			carrepository.save(new Car("GAP-417", "Saab", "orange", "98-octane", 2001, "21000 €", 2, 1));
			carrepository.save(new Car("OML-283", "Kia", "purple", "Diesel", 2002, "22000 €", 3, 3));
			customerrepository.save(new Customer(10, "Matti", "Meikäläinen", "+358405072093",
					"matti.meikalainen@gmail.com", "Lönnrotinkatu 1 A 1", "RMY-683", "KJF-484", "DAQ-202"));
			customerrepository.save(new Customer(11, "Mikko", "Meikäläinen", "+358404157570",
					"mikko.meikalainen@gmail.com", "Salomonkatu 2 B 2", "NUC-402", "PWV-728", "IHK-234"));
			customerrepository.save(new Customer(12, "Maija", "Meikäläinen", "+358400186630",
					"maija.meikalainen@gmail.com", "Fredrikinkatu 3 C 3", "QDR-334", "OOE-980", "LHZ-273"));
			workerrepository.save(new Worker(10, "Matt", "LeBlanc", "+358401642129", "matt.leblanc@gmail.com",
					"Snellmaninkatu 1 A 1", "salesperson", "SMI-785", "KWQ-574", "JIK-759"));
			workerrepository.save(new Worker(11, "Eddie", "Jordan", "+358406513791", "eddie.jordan@gmail.com",
					"Unioninkatu 2 B 2", "fixer", "GBY-293", "NNJ-922", "YVC-665"));
			workerrepository.save(new Worker(12, "Rory", "Reid", "+358401319935", "rory.reid@gmail.com",
					"Lönnrotinkatu 3 C 3", "salesperson", "RZC-692", "THR-817", "VDO-402"));
			log.info("More information of car has been saved");
		};
	}
}
