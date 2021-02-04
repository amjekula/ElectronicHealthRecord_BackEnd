//package mjeks.athenkosi.repository.external_generics.impl;
//
//import mjeks.athenkosi.entity.external_generics.Address;
//import mjeks.athenkosi.factory.external_generics.AddressFactory;
//import mjeks.athenkosi.repository.external_generics.AddressRepository;
//import mjeks.athenkosi.util.GenericHelper;
//import org.junit.FixMethodOrder;
//import org.junit.Test;
//import org.junit.runners.MethodSorters;
//
//import static org.junit.Assert.*;
//
//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
//public class AddressRepositoryImplTest {
//
//    static String id = GenericHelper.generateId();
//    private static Address address = AddressFactory.createAddress(id, "South Africa", "Western Cape",
//                                "Cape Town", "Parklands","7441","12 Saint Johns Street");
//
//    private static AddressRepository addressRepository = AddressRepositoryImpl.getAddressRepository();
//
//    @Test
//    public void d_getAll() {
//        assertEquals(1, addressRepository.getAll().size());
//    }
//
//    @Test
//    public void a_create() {
//        this.addressRepository.create(address);
//        assertEquals("South Africa", address.getCountry());
//    }
//
//    @Test
//    public void b_read() {
//        this.addressRepository.read(address.getId());
//        assertNotNull(address.getId());
//    }
//
//    @Test
//    public void c_update() {
//        Address newAddress = new Address.AddressBuilder().copy(address).setTown("Parklands").build();
//        this.addressRepository.update(newAddress);
//
//        assertEquals("Parklands", newAddress.getTown());
//    }
//
//    @Test
//    public void e_delete() {
//        addressRepository.delete(address.getId());
//        assertEquals(0, addressRepository.getAll().size());
//
//    }
//}