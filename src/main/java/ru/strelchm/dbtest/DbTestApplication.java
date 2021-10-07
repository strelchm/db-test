package ru.strelchm.dbtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.strelchm.dbtest.repo.NotificationRepo;

import java.util.Arrays;

@SpringBootApplication
@RestController
public class DbTestApplication {
    private final NotificationRepo notificationRepo;

    public DbTestApplication(NotificationRepo notificationRepo) {
        this.notificationRepo = notificationRepo;
    }

    @RequestMapping("/")
    public String home() {
        return Arrays.toString(notificationRepo.findAll().toArray());
    }

    public static void main(String[] args) {
        try {
        SpringApplication.run(DbTestApplication.class, args);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
