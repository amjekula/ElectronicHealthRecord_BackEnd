package mjeks.athenkosi.controller.employee;

import mjeks.athenkosi.entity.employee.Doctor;
import mjeks.athenkosi.entity.employee.Staff;
import mjeks.athenkosi.entity.internal_generics.Department;
import mjeks.athenkosi.factory.employee.StaffFactory;
import mjeks.athenkosi.factory.internal_generics.DepartmentFactory;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.bind.annotation.RestController;

import static org.junit.Assert.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StaffControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL = "http://localhost:8080/electronichealthrecord/staff";

    Department department = DepartmentFactory.createDepartment("Khayelitsha", "Athenkosi", "2552");
    Staff staff = StaffFactory.createStaff("Athi", "Mjeks", "8520",
            "1234","Diploma", department, "544", "Ayanda");
    @Test
    public void create() {
        System.out.println(department);
        String url = baseURL + "/create";
        System.out.println("URL: " + url);
        ResponseEntity<Staff> postResponse = restTemplate
                //.withBasicAuth(ADMIN_USERNAME, ADMIN_PASSWORD)
                .postForEntity(url, staff, Staff.class);

        System.out.println("Status Code: " + postResponse.getStatusCode());
        staff = postResponse.getBody();
        System.out.println("Staff: " + staff);
        assertEquals(staff.getStaffId(), postResponse.getBody().getStaffId());
    }

    @Test
    public void read() {
    }

    @Test
    public void update() {
    }

    @Test
    public void delete() {
    }

    @Test
    public void getAll() {
    }
}