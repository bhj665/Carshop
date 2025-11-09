package thesis.carshop.domain;
import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.CascadeType;
@Entity
public class Worker {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int workerid;
private String firstname;
private String lastname;
private String phonenumber;
private String email;
private String address;
private String role;
@OneToMany(cascade = CascadeType.ALL, mappedBy = "worker")
private List<Car> cars;
public Worker() {
this.workerid = 0;
this.firstname = null;
this.lastname = null;
this.phonenumber = null;
this.email = null;
this.address = null;
this.role = null;
this.cars = null;
}
public Worker(int workerid, String firstname, String lastname, String phonenumber, String email, String address, String role, List<Car> cars) {
this.workerid = workerid;
this.firstname = firstname;
this.lastname = lastname;
this.phonenumber = phonenumber;
this.email = email;
this.address = address;
this.role = role;
this.cars = cars;
}
public int getWorkerid() {
return workerid;
}
public void setWorkerid(int workerid) {
this.workerid = workerid;
}
public String getFirstname() {
return firstname;
}
public void setFirstname(String firstname) {
this.firstname = firstname;
}
public String getLastname() {
return lastname;
}
public void setLastname(String lastname) {
this.lastname = lastname;
}
public String getPhonenumber() {
return phonenumber;
}
public void setPhonenumber(String phonenumber) {
this.phonenumber = phonenumber;
}
public String getEmail() {
return email;
}
public void setEmail(String email) {
this.email = email;
}
public String getAddress() {
return address;
}
public void setAddress(String address) {
this.address = address;
}
public String getRole() {
return role;
}
public void setRole(String role) {
this.role = role;
}
public List<Car> getCars() {
return cars;
}
public void setCars(List<Car> cars) {
this.cars = cars;
}
@Override
public String toString() {
return this.workerid + this.firstname + this.lastname + this.phonenumber + this.email + this.address + this.role + this.cars;
}
}
