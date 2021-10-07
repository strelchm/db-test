package ru.strelchm.dbtest.test;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import ru.strelchm.dbtest.model.Notification;
import ru.strelchm.dbtest.repo.NotificationRepo;


@EnableScheduling
@Service
public class TestNotificationScheduler {
    private final NotificationRepo notificationRepo;

    public TestNotificationScheduler(NotificationRepo notificationRepo) {
        this.notificationRepo = notificationRepo;
    }

    @Scheduled(initialDelay = 5000, fixedDelay = 5000)
    public void create() {
        Notification notification = new Notification();
        notification.setTitle(Math.random() + "--- \n");
        notificationRepo.save(notification);
    }

    @Scheduled(initialDelay = 5000, fixedDelay = 30000)
    public void delete() {
        notificationRepo.delete(notificationRepo.findAll().get(0));
    }
}
