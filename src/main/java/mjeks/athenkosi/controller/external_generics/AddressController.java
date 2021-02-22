package mjeks.athenkosi.controller.external_generics;

import mjeks.athenkosi.entity.employee.Staff;
import mjeks.athenkosi.entity.external_generics.Address;
import mjeks.athenkosi.factory.external_generics.AddressFactory;
import mjeks.athenkosi.service.external_generics.impl.AddressServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("electronichealthrecord/address")
public class AddressController {

    @Autowired
    private AddressServiceImpl addressService;

    @PostMapping("/create")
    public Address create(@RequestBody Address address){
        Address newAddress = AddressFactory.createAddress(address.getCountry(), address.getProvince(),
                address.getTown(), address.getSuburb(), address.getPostalCode(), address.getStreetAddress());

        return this.addressService.create(newAddress);
    }

    @GetMapping("/read/{addressId}")
    public Address read(@PathVariable String addressId){
        return this.addressService.read(addressId);
    }

    @PostMapping("/update")
    public Address update(@RequestBody Address address){
        return this.addressService.update(address);
    }

    @DeleteMapping("/delete/{addressId}")
    public void delete(@PathVariable String addressId){
        this.addressService.delete(addressId);
    }

    @GetMapping("/all")
    public Set<Address> getAll(){
        return this.addressService.getAll();
    }
}
