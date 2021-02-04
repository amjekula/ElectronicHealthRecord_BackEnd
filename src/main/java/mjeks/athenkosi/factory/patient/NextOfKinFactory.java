package mjeks.athenkosi.factory.patient;

import mjeks.athenkosi.entity.patient.NextOfKin;
import mjeks.athenkosi.util.GenericHelper;

public class NextOfKinFactory {

    public static NextOfKin createNextOfKin(String name, String lastName, String phoneNumber, String patientNo){

        String nextOfKinNo = GenericHelper.generateId();

        NextOfKin nextOfKin = new NextOfKin.NextOfKinBuilder()
                .setNextOfKinNo(nextOfKinNo)
                .setName(name)
                .setLastName(lastName)
                .setPhoneNumber(phoneNumber)
                .setPatientNo(patientNo)
                .build();

        return nextOfKin;
    }
}
