package ru.strelchm.dbtest.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import ru.strelchm.dbtest.model.Notification;

import java.util.UUID;

public interface NotificationRepo extends JpaRepository<Notification, UUID> {

}
