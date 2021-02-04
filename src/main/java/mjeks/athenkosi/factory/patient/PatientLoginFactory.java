package mjeks.athenkosi.factory.patient;

import mjeks.athenkosi.entity.patient.PatientLogin;

public class PatientLoginFactory {

    public static PatientLogin createPatientLogin(String patientNo, String username,
                                                  String password, String loginDate, String logoutTime){

        PatientLogin patientLogin = new PatientLogin.PatientLoginBuilder()
                .setPatientNo(patientNo)
                .setUsername(username)
                .setPassword(password)
                .setLoginDate(loginDate)
                .setLogoutTime(logoutTime).build();

        return patientLogin;
    }
}
