package mjeks.athenkosi.entity.patient;

import mjeks.athenkosi.util.GenericHelper;
import org.junit.Test;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.*;

public class PatientLoginTest {


    Date date = new Date();
    SimpleDateFormat timeFormatter = new SimpleDateFormat("HH : mm");
    SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-mm-dd HH: mm");

    PatientLogin patientLogin = new PatientLogin.PatientLoginBuilder()
            //.setLoginDate(dateFormatter.format(date))
            .setLoginNumber(GenericHelper.generateId())
            .setLogoutTime(date)
            .build();
    @Test
    public void getPatientNo() {
        assertNotNull(patientLogin.getLoginNumber());
    }

    @Test
    public void getLoginDate() {
        assertNotNull(patientLogin.getLoginDate());
        System.out.println("Login Date: " + patientLogin.getLoginDate());
    }
}