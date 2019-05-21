package application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebApplication {
    //seul entree de l'application, cette classe ne doit pas être dans defaut package
    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class, args);
    }
}

