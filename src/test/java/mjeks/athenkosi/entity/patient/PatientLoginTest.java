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
            .setLoginDate(dateFormatter.format(date))
            .setPatientNo(GenericHelper.generateId())
            .setLogoutTime(timeFormatter.format(date))
            .setPassword("8520")
            .setUsername("Athi")
            .build();
    @Test
    public void getPatientNo() {
        assertNotNull(patientLogin.getPatientNo());
    }

    @Test
    public void getUsername() {
        assertEquals("Athi", patientLogin.getUsername());
    }

    @Test
    public void getPassword() {
        assertEquals("8520", patientLogin.getPassword());
    }

    @Test
    public void getLoginDate() {
        assertNotNull(patientLogin.getLoginDate());
        System.out.println("Login Date: " + patientLogin.getLoginDate());
    }
}