package thesis.carshop;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import thesis.carshop.domain.Customer;

public class CustomerTest {
    @Test
    void testGetCustomerid() {
        var mattimattila = new Customer(1, "Matti", "Mattila", "+358401741870", "matti.mattila@gmail.com",
                "Vihdintie 1 A 1", "QWH-657", "WTZ-520", "GNB-502");
        assertEquals(1, mattimattila.getCustomerid());
    }

    @Test
    void testGetFirstname() {
        var mikkomikkola = new Customer(2, "Mikko", "Mikkola", "+358406358646", "mikko.mikkola@gmail.com",
                "Mannerheimintie 2 B 2", "ODX-814", "IJW-271", "GRW-965");
        assertEquals("Mikko", mikkomikkola.getFirstname());
    }

    @Test
    void testGetLastname() {
        var pekkapekkala = new Customer(3, "Pekka", "Pekkala", "+358402245345", "pekka.pekkala@gmail.com",
                "Luutnantintie 3 C 3", "VXI-782", "JCT-732", "EEP-665");
        assertEquals("Pekkala", pekkapekkala.getLastname());
    }

    @Test
    void testGetPhonenumber() {
        var heikkiheikkila = new Customer(4, "Heikki", "Heikkilä", "+358408419946", "heikki.heikkila@gmail.com",
                "Kartanonmetsäntie 4 D 4", "WGN-532", "YMJ-834", "WYD-258");
        assertEquals("+358408419946", heikkiheikkila.getPhonenumber());
    }

    @Test
    void testGetEmail() {
        var jaakkojaakkola = new Customer(5, "Jaakko", "Jaakkola", "+358409800907", "jaakko.jaakkola@gmail.com",
                "Pihkatie 5 A 5", "ZSG-944", "FED-982", "GIZ-401");
        assertEquals("jaakko.jaakkola@gmail.com", jaakkojaakkola.getEmail());
    }

    @Test
    void testGetAddress() {
        var joukojoukola = new Customer(6, "Jouko", "Joukola", "+358401628146", "jouko.joukola@gmail.com",
                "Kaarnatie 6 B 6", "NQP-879", "DNR-139", "EWX-371");
        assertEquals("Kaarnatie 6 B 6", joukojoukola.getAddress());
    }

    @Test
    void testGetCars() {
        var toivotoivola = new Customer(7, "Toivo", "Toivola", "+358404811583", "toivo.toivola@gmail.com",
                "Neulastie 7 C 7", "FYT-608", "ZTL-522", "LEN-227");
        assertEquals("FYT-608", "ZTL-522", "LEN-227", toivotoivola.getCars());
    }
}
