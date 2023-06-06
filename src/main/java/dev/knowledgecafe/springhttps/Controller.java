package dev.knowledgecafe.springhttps;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

        @GetMapping("/")
        public String getGreeting() {
            return "Welcome to Spring Boot on HTTPS!";
        }

}
