//package mjeks.athenkosi.repository.patient.impl;
//
//import mjeks.athenkosi.entity.patient.PatientLogin;
//import mjeks.athenkosi.repository.patient.PatientLoginRepository;
//import mjeks.athenkosi.util.GenericHelper;
//import org.junit.FixMethodOrder;
//import org.junit.Test;
//import org.junit.runners.MethodSorters;
//
//import java.text.SimpleDateFormat;
//import java.util.Date;
//
//import static org.junit.Assert.*;
//
//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
//public class PatientLoginImplTest {
//
//    private static Date date = new Date();
//    private static SimpleDateFormat timeFormatter = new SimpleDateFormat("HH : mm");
//    private static SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-mm-dd HH: mm");
//
//    private static PatientLogin patientLoginBuilder = new PatientLogin.PatientLoginBuilder()
//            .setPatientNo(GenericHelper.generateId())
//            .setLoginDate(dateFormatter.format(date))
//            .setLogoutTime(timeFormatter.format(date))
//            .setPassword("8520")
//            .setUsername("Likho")
//            .build();
//
//    private static PatientLoginRepository patientLoginRepository = new PatientLoginImpl().getPatientLoginRepository();
//
//    @Test
//    public void d_getAll() {
//        assertEquals(1, patientLoginRepository.getAll().size());
//    }
//
//    @Test
//    public void a_create() {
//        this.patientLoginRepository.create(patientLoginBuilder);
//
//        assertEquals(patientLoginRepository.read(patientLoginBuilder.getPatientNo()).getPatientNo()
//                , patientLoginBuilder.getPatientNo());
//    }
//
//    @Test
//    public void b_read() {
//        PatientLogin patientLogin = this.patientLoginRepository.read(patientLoginBuilder.getPatientNo());
//        assertEquals(patientLogin.getPatientNo(), this.patientLoginRepository
//                    .read(patientLoginBuilder.getPatientNo()).getPatientNo());
//    }
//
//    @Test
//    public void c_update() {
//        PatientLogin patientLogin = new PatientLogin.PatientLoginBuilder().copy(patientLoginBuilder)
//                                    .setUsername("Likhona").build();
//        this.patientLoginRepository.update(patientLogin);
//
//        assertNotEquals(this.patientLoginRepository.read(patientLogin.getPatientNo()).getUsername(),
//                            patientLoginBuilder.getUsername());
//
//        System.out.println("Update: " + patientLogin.getPatientNo() + " \n" +
//                            patientLoginBuilder.getPatientNo());
//    }
//
//    @Test
//    public void e_delete() {
//        patientLoginRepository.delete(patientLoginRepository.read(patientLoginBuilder.getPatientNo()).getPatientNo());
//        assertEquals(0, patientLoginRepository.getAll().size());
//    }
//}