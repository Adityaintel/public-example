package de.nufin.interviews;

import de.moss.interview.Geeks;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        Geeks g1 = new Geeks();
        g1.call();
    }

}
