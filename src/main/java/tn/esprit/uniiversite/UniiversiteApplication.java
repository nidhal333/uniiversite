package tn.esprit.uniiversite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class UniiversiteApplication {

    public static void main(String[] args) {SpringApplication.run(UniiversiteApplication.class, args);}

}
