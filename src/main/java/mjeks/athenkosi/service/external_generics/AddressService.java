package mjeks.athenkosi.service.external_generics;

import mjeks.athenkosi.entity.external_generics.Address;
import mjeks.athenkosi.service.IService;

import java.util.Set;

public interface AddressService extends IService<Address, String> {
    Set<Address> getAll();
}
