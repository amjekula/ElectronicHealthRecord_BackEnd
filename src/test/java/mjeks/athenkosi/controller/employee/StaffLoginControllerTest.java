package mjeks.athenkosi.controller.employee;

import mjeks.athenkosi.entity.employee.StaffLogin;
import mjeks.athenkosi.factory.employee.StaffLoginFactory;
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
public class StaffLoginControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;
    private String baseUrl = "http://localhost:8080/electronichealthrecord/stafflogin";

    private StaffLogin staffLogin = StaffLoginFactory.createStaffLogin("150", "566");

    @Test
    public void create() {
        String url = baseUrl + "/create";
        ResponseEntity<StaffLogin> postForEntity = restTemplate
                //.withBasicAuth(USERNAME, PASSWORD)
                .postForEntity(url, staffLogin, StaffLogin.class);

        System.out.println("Status code: " + postForEntity.getStatusCode());
        staffLogin = postForEntity.getBody();
        System.out.println("Staff Login: " + staffLogin);

        assertEquals(staffLogin.getLoginDate(), postForEntity.getBody().getLoginDate());
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