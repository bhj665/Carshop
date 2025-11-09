package thesis.carshop;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import thesis.carshop.domain.Worker;
public class WorkerTest {
@Test
void testGetWorkerid() {
var richardhammond = new Worker(1, "Richard", "Hammond", "+358404357315", "richard.hammond@gmail.com", "Kartanonvoudintie 1 A 1", "salesperson", "ABF-774", "BWA-443", "ASO-951");
assertEquals(1, richardhammond.getWorkerid());
}
@Test
void testGetFirstname() {
var jeremyclarkson = new Worker(2, "Jeremy", "Clarkson", "+358405181977", "jeremy.clarkson@gmail.com", "Puustellintie 2 B 2", "fixer", "HCC-790", "ECC-590", "FHB-837");
assertEquals("Jeremy", jeremyclarkson.getFirstname());
}
@Test
void testGetLastname() {
var jamesmay = new Worker(3, "James", "May", "+358400290170", "james.may@gmail.com", "Viljelijäntie 3 C 3", "salesperson", "HZB-191", "WUM-137", "IFM-465");
assertEquals("May", jamesmay.getLastname());
}
@Test
void testGetPhonenumber() {
var chrisharris = new Worker(4, "Chris", "Harris", "+358405436000", "chris.harris@gmail.com", "Juustenintie 4 D 4", "fixer", "ILM-466", "IUT-564", "RFQ-113");
assertEquals("+358405436000", chrisharris.getPhonenumber());
}
@Test
void testGetEmail() {
var paddymcguinness = new Worker(5, "Paddy", "McGuinness", "+358405145847", "paddy.mcguinness@gmail.com", "Jägerhornintie 5 A 5", "salesperson", "ABD-343", "FQX-941", "UEV-782");
assertEquals("paddy.mcguinness@gmail.com", paddymcguinness.getEmail());
}
@Test
void testGetAddress() {
var andrewflintoff = new Worker(6, "Andrew", "Flintoff", "+358404784311", "andrew.flintoff@gmail.com", "Rukkilantie 6 B 6", "fixer", "ZML-498", "LSJ-508", "LGZ-176");
assertEquals("Rukkilantie 6 B 6", andrewflintoff.getAddress());
}
@Test
void testGetRole() {
var ismoleikola = new Worker(7, "Ismo", "Leikola", "+358409273650", "ismo.leikola@gmail.com", "Tuulenpesäntie 7 C 7", "salesperson", "SBM-542", "SOA-372", "QXC-654");
assertEquals("salesperson", ismoleikola.getRole());
}
@Test
void testGetCars() {
var teemuselanne = new Worker(8, "Teemu", "Selänne", "+358402917683", "teemu.selanne@gmail.com", "Sammatintie 8 D 8", "fixer", "DFK-630", "NHG-572", "DSF-416");
assertEquals("DFK-630", "NHG-572", "DSF-416", teemuselanne.getCars());
}
}
