package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@ComponentScan("")
public class HelloController {
    
    @RequestMapping("/welcome")
    public String index() {
        return "Greetings from Spring Boot!";
    }
    
}
