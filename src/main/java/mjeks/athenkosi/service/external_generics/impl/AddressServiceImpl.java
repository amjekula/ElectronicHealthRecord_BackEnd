package mjeks.athenkosi.service.external_generics.impl;

import mjeks.athenkosi.entity.external_generics.Address;
import mjeks.athenkosi.repository.external_generics.AddressRepository;
import mjeks.athenkosi.service.external_generics.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressRepository addressRepository;

    @Override
    public Set<Address> getAll() {
        return this.addressRepository.findAll().stream().collect(Collectors.toSet());
    }

    @Override
    public Address create(Address address) {
        return this.addressRepository.save(address);
    }

    @Override
    public Address read(String addressId) {
        return this.addressRepository.findById(addressId).orElse(null);
    }

    @Override
    public Address update(Address address) {
        if(this.addressRepository.existsById(address.getId())){
            return this.addressRepository.save(address);
        }else {
            return null;
        }
    }

    @Override
    public void delete(String addressId) {
        this.addressRepository.deleteById(addressId);
    }
}
