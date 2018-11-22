package pl.adsproject.rest;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"pl.adsproject.*"})
@EnableJpaRepositories("pl.adsproject.db")
@EntityScan("pl.adsproject.db.entities")
public class AdsRestApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdsRestApplication.class, args);
    }


}
