package mjeks.athenkosi.repository.external_generics;

import mjeks.athenkosi.entity.external_generics.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface AddressRepository extends JpaRepository<Address, String> {
    //Set<Address> getAll();
}
