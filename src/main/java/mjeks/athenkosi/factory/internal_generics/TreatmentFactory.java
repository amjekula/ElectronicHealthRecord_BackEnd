package mjeks.athenkosi.factory.internal_generics;

import mjeks.athenkosi.entity.internal_generics.Treatment;
import mjeks.athenkosi.util.GenericHelper;

public class TreatmentFactory {

    public static Treatment createTreatment(String treatmentDisease, String treatmentNotes, String testId,
                                            String drugId, String patientNo, String treatmentDate){

        Treatment treatment = new Treatment.TreatmentBuilder()
                .setTreatmentId(GenericHelper.generateId())
                .setTreatmentDisease(treatmentDisease)
                .setTreatmentNotes(treatmentNotes)
                .setTestId(testId)
                .setDrugId(drugId)
                .setPatientNo(patientNo)
                .setTreatmentDate(treatmentDate)
                .build();

        return treatment;
    }
}
