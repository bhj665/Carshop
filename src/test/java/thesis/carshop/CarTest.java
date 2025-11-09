package thesis.carshop;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import thesis.carshop.domain.Car;
public class CarTest {
@Test
void testGetRegisternumber() {
var mercedesbenz = new Car("UFP-855", "Mercedes-Benz", "blue", "95-octane", 1991, "11000 €", 1, 1);
assertEquals("UFP-855", mercedesbenz.getRegisternumber());
}
@Test
void testGetManufacturer() {
var volvo = new Car("IXR-371", "Volvo", "grey", "98-octane", 1992, "12000 €", 2, 1);
assertEquals("Volvo", volvo.getManufacturer());
}
@Test
void testGetColor() {
var bmw = new Car("OQB-448", "BMW", "green", "diesel", 1993, "13000 €", 3, 3);
assertEquals("green", bmw.getColor());
}
@Test
void testGetFueltype() {
var volkswagen  = new Car("UHV-954", "Volkswagen", "white", "95-octane", 1994, "14000 €", 4, 3);
assertEquals("95-octane", volkswagen.getFueltype());
}
@Test
void testGetYear() {
var skoda = new Car("SSW-320", "Skoda", "red", "98-octane", 1995, "15000 €", 5, 5);
assertEquals(1995, skoda.getYear());
}
@Test
void testGetPrice() {
var ferrari = new Car("KZJ-635", "Ferrari", "yellow", "diesel", 1996, "16000 €", 6, 5);
assertEquals("16000 €", ferrari.getPrice());
}
@Test
void testGetCustomer() {
var citroen = new Car("QLD-942", "Citroen", "black", "95-octane", 1997, "17000 €", 7, 7);
assertEquals(7, citroen.getCustomer());
}
@Test
void testGetWorker() {
var berlingo = new Car("GWO-624", "Berlingo", "brown", "98-octane", 1998, "18000 €", 8, 7);
assertEquals(7, berlingo.getWorker());
}
}
