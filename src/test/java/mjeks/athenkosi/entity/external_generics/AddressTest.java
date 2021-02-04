package mjeks.athenkosi.entity.external_generics;

import mjeks.athenkosi.util.GenericHelper;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddressTest {

    GenericHelper helper = new GenericHelper();
    Address address = new Address.AddressBuilder().setStreetAddress("12 St. John's Street").setCountry("South Africa")
            .setProvince("Western Cape").setTown("Cape Farms").setPostalCode("7441").setId(helper.generateId()).build();

    @Test
    public void testPatientNo() {
        assertNotNull(address.getId());
    }

    @Test
    public void testCountry() {
        assertEquals(address.getCountry(), "South Africa");
    }

    @Test
    public void testProvince() {
        assertEquals(address.getProvince(), "Western Cape");
    }

    @Test
    public void testTown() {
        assertEquals(address.getTown(), "Cape Farms");
    }

    @Test
    public void testStreetAddress() {
        assertEquals(address.getStreetAddress(), "12 St. John's Street");
    }

    @Test
    public void testPostalCode() {
        assertEquals(address.getPostalCode(), "7441");
    }
}