package mjeks.athenkosi.factory.patient;

import mjeks.athenkosi.entity.patient.PatientBMI;
import mjeks.athenkosi.util.GenericHelper;

public class PatientBMIFactory {

    public static PatientBMI createPatientBMI(/*String patientNo, */int weight, int temperature, int height){

        PatientBMI patientBMI = new PatientBMI.PatientBMIBuilder()
                .setPatientNo(GenericHelper.generateId())
                .setWeight(weight)
                .setTemperature(temperature)
                .setHeight(height)
                .build();

        return patientBMI;
    }
}
