//package mjeks.athenkosi.repository.generic.impl;
//
//import mjeks.athenkosi.entity.generic.Address;
//import mjeks.athenkosi.repository.generic.AddressRepository;
//
//import java.util.HashSet;
//import java.util.Set;
//
//public class AddressRepositoryImpl implements AddressRepository {
//
//    private Set<Address> addressDB;
//    private static AddressRepository addressRepository = null;
//
//    public AddressRepositoryImpl(){
//        this.addressDB = new HashSet<>();
//    }
//    public static AddressRepository getAddressRepository(){
//        if(addressRepository == null){
//            addressRepository = new AddressRepositoryImpl();
//        }
//        return addressRepository;
//    }
//
//
//    @Override
//    public Set<Address> getAll() {
//        return this.addressDB;
//    }
//
//    @Override
//    public Address create(Address address) {
//        this.addressDB.add(address);
//        return address;
//    }
//
//    @Override
//    public Address read(String addressId) {
//        Address address = null;
//
//        for(Address findAddress: addressDB){
//            if(findAddress.getId().equalsIgnoreCase(addressId)){
//                address = findAddress;
//                break;
//            }
//        }
//        return address;
//    }
//
//    @Override
//    public Address update(Address address) {
//        Address oldAddress = read(address.getId());
//
//        if(oldAddress != null){
//            this.addressDB.remove(oldAddress);
//            this.addressDB.add(address);
//        }
//        return address;
//    }
//
//    @Override
//    public void delete(String addressId) {
//        Address address = read(addressId);
//
//        if(address != null){
//            this.addressDB.remove(address);
//        }
//    }
//}
