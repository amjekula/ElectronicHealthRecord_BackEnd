package mjeks.athenkosi.entity.patient;

import mjeks.athenkosi.util.GenericHelper;
import org.junit.Test;

import java.sql.Timestamp;
import java.util.Date;

import static org.junit.Assert.*;

public class PatientQueueTest {

    Date date = new Date();

    PatientQueue patientQueue = new PatientQueue.PatientQueueBuilder()
            .setStaffId(GenericHelper.generateId())
            .setDate(date.toString())
            .setDeptNo(GenericHelper.generateId())
            .setDoctorNo(GenericHelper.generateId())
            .setPatientNo(GenericHelper.generateId())
            .build();

    @Test
    public void getPatientNo() {
        assertNotNull(patientQueue.getStaffId());
        System.out.println("Patient Number: " + patientQueue.getPatientNo());
    }

    @Test
    public void getDoctorNo() {
        assertNotNull(patientQueue.getDoctorNo());
        System.out.println("Doctor Number: " + patientQueue.getPatientNo());
    }

    @Test
    public void getDeptNo() {
        assertNotNull(patientQueue.getDeptNo());
        System.out.println("Department Number: " + patientQueue.getDeptNo());
    }

    @Test
    public void getDate() {
        assertNotNull(patientQueue.getDate());
        System.out.println("Date " + patientQueue.getDate());
    }

    @Test
    public void getStaffId() {
        assertNotNull(patientQueue.getStaffId());
        System.out.println("Staff Number: " + patientQueue.getStaffId());
    }
}