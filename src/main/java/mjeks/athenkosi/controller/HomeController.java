package mjeks.athenkosi.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping("index/home")
    @Bean
    String home(){
        return "Electronic Health Record";
    }
}
