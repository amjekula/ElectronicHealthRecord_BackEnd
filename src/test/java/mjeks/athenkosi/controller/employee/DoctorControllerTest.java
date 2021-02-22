package mjeks.athenkosi.controller.employee;

import mjeks.athenkosi.entity.employee.Doctor;
import mjeks.athenkosi.entity.employee.Staff;
import mjeks.athenkosi.entity.external_generics.Address;
import mjeks.athenkosi.entity.internal_generics.Department;
import mjeks.athenkosi.factory.employee.DoctorFactory;
import mjeks.athenkosi.factory.employee.StaffFactory;
import mjeks.athenkosi.factory.external_generics.AddressFactory;
import mjeks.athenkosi.factory.internal_generics.DepartmentFactory;
import mjeks.athenkosi.util.GenericHelper;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DoctorControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL = "http://localhost:8080/electronichealthrecord/doctor";

    Date date = new Date();
    private Department department = DepartmentFactory.createDepartment("Khayelitsha", "Athenkosi", "2552");
    private Address address = AddressFactory.createAddress("South Africa", "Western Cape", "Cape Town",
            "Observetory", "7441", "6 Browning Road");
    private Staff staff = StaffFactory.createStaff("Athi", "Mjeks", "8520",
            "1234","Diploma", address, department, "544", "Ayanda");
    private Doctor doctor = DoctorFactory.createDoctor(staff);


    @Test
    public void a_create() {
        String url = baseURL + "/create";
        System.out.println("URL: " + url);
        ResponseEntity<Doctor> postResponse = restTemplate
                //.withBasicAuth(ADMIN_USERNAME, ADMIN_PASSWORD)
                .postForEntity(url, doctor, Doctor.class);

        System.out.println("Status Code: " + postResponse.getStatusCode());
        doctor = postResponse.getBody();
        System.out.println("Doctor: " + doctor);
        assertEquals(doctor.getDoctorNo(), postResponse.getBody().getDoctorNo());
    }

    @Test
    public void b_read() {

    }

    @Test
    public void c_update() {
    }

    @Test
    public void e_delete() {
    }

    @Test
    public void d_getAll() {
    }
}