package org.example.reservation.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * Entity Event
 *
 * @author Desyatnikov Dmitry
 */
@Entity
@Table
@Data
public class Event {
    /**
     * Поле со значением id
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /**
     * Поле со значением infoEvent
     */
    @Column(name = "infoEvent")
    private String infoEvent;

    /**
     * Поле со значением dateReservation
     */
    @Column(name = "dateReservation")
    private Date dateReservation;
}
