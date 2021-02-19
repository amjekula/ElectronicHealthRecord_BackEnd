package mjeks.athenkosi.factory.patient;

import mjeks.athenkosi.entity.patient.PatientLogin;

import java.util.Date;

public class PatientLoginFactory {

    public static PatientLogin createPatientLogin(String loginNumber, Date logoutTime){

        Date date = new Date();

        PatientLogin patientLogin = new PatientLogin.PatientLoginBuilder()
                .setLoginNumber(loginNumber)
                .setLoginDate(date)
                .setLogoutTime(logoutTime).build();

        return patientLogin;
    }
}
