package mjeks.athenkosi.factory.external_generics;

import mjeks.athenkosi.entity.external_generics.Address;
import mjeks.athenkosi.util.GenericHelper;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddressFactoryTest {

    GenericHelper helper = new GenericHelper();
    Address address = new Address.AddressBuilder().setStreetAddress("12 St. John's Street").setCountry("South Africa")
            .setProvince("Western Cape").setTown("Cape Farms").setPostalCode("7441").setId(helper.generateId()).build();

    @Test
    public void testAddressFactory() {
        assertEquals(address.getPostalCode(), "7441");
    }
}