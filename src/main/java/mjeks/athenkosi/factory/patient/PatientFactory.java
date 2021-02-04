package mjeks.athenkosi.factory.patient;

import mjeks.athenkosi.entity.patient.Patient;
import mjeks.athenkosi.util.GenericHelper;

public class PatientFactory {

    public static Patient createPatient(String name,String lastName,String idNumber,String phoneNumber){
        String patientNo = GenericHelper.generateId();

        Patient patient = new Patient.PatientBuilder()
                .setPatientNo(patientNo)
                .setName(name)
                .setLastName(lastName)
                .setIdNumber(idNumber)
                .setPhoneNumber(phoneNumber)
                .build();

        return patient;
    }
}
