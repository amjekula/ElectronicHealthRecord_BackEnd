package mjeks.athenkosi.repository.internal_generics;

import mjeks.athenkosi.entity.internal_generics.Treatment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface TreatmentRepository extends JpaRepository<Treatment, String> {
    //Set<Treatment> getAll();
}
