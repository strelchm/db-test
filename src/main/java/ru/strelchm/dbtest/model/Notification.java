package ru.strelchm.dbtest.model;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

/**
 * Модель обьекта Notification
 *
 * @author strelchm
 */
@Entity
@Data
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @NotNull
//    @Size(max = 255)
    private String title;

    @NotNull
//    @Size(max = 128)
    @Column(length = 128)
    private String name;

    private LocalDateTime date;

    private Boolean viewed;

    private LocalDateTime dateViewed;
}
