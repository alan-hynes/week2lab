package ie.atu.week2_refresherlab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class Week2RefresherlabApplication {

    public static void main(String[] args) {
        SpringApplication.run(Week2RefresherlabApplication.class, args);
    }

}
