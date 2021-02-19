package mjeks.athenkosi.controller.internal_generics;

import mjeks.athenkosi.entity.employee.Doctor;
import mjeks.athenkosi.entity.internal_generics.Department;
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

import static org.junit.Assert.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DepartmentControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL = "http://localhost:8080/electronichealthrecord/department";

    Department department = DepartmentFactory.createDepartment("Khayelitsha", "Athenkosi", "2552");
    @Test
    public void create() {
        String url = baseURL + "/create";
        System.out.println("URL: " + url);
        ResponseEntity<Department> postResponse = restTemplate
                //.withBasicAuth(ADMIN_USERNAME, ADMIN_PASSWORD)
                .postForEntity(url, department, Department.class);

        System.out.println("Status Code: " + postResponse.getStatusCode());
        department = postResponse.getBody();
        System.out.println("Doctor: " + department);
        assertEquals(department.getDepNo(), postResponse.getBody().getDepNo());
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