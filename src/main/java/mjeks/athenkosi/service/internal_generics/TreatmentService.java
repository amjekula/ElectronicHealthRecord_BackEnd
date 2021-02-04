package mjeks.athenkosi.service.internal_generics;

import mjeks.athenkosi.entity.internal_generics.Treatment;
import mjeks.athenkosi.service.IService;

import java.util.Set;

public interface TreatmentService extends IService<Treatment, String> {
    Set<Treatment> getAll();
}
