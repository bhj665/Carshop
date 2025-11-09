package thesis.carshop.domain;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@Entity
public class Car {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private String registernumber;
private String manufacturer;
private String color;
private String fueltype;
private int year;
private String price;
@ManyToOne
@JoinColumn(name = "customerid")
@JoinColumn(name = "workerid")
@JsonIgnoreProperties("car")
private Customer customer;
private Worker worker;
public Car() {
this.registernumber = null;
this.manufacturer = null;
this.color = null;
this.fueltype = null;
this.year = 0;
this.price = null;
this.customer = null;
this.worker = null;
}
public Car(String registernumber, String manufacturer, String color, String fueltype, int year, String price, Customer customer, Worker worker) {
this.registernumber = registernumber;
this.manufacturer = manufacturer;
this.color = color;
this.fueltype = fueltype;
this.year = year;
this.price = price;
this.customer = customer;
this.worker = worker;
}
public String getRegisterNumber() {
return registernumber;
}
public void setRegisterNumber(String registernumber) {
this.registernumber = registernumber;
}
public String getManufacturer() {
return manufacturer;
}
public void setManufacturer(String manufacturer) {
this.manufacturer = manufacturer;
}
public String getColor() {
return color;
}
public void setColor(String color) {
this.color = color;
}
public String getFueltype() {
return fueltype;
}
public void setFueltype(String fueltype) {
this.fueltype = fueltype;
}
public int getYear() {
return year;
}
public void setYear(int year) {
this.year = year;
}
public String getPrice() {
return price;
}
public void setPrice(String price) {
this.price = price;
}
public Customer getCustomer() {
return customer;
}
public void setCustomer(Customer customer) {
this.customer = customer;
}
public Worker getWorker() {
return worker;
}
public void setWorker(Worker worker) {
this.worker = worker;
}
@Override
public String toString() {
return this.registernumber + this.manufacturer + this.color + this.fueltype + this.year + this.price + this.customer + this.worker;
}
}
