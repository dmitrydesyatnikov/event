package org.example.reservation.dto;
import java.util.Date;
import lombok.Getter;
/**
 * Dto для Entity Event
 *
 * @author Desyatnikov Dmitry
 */
@Getter
public final class EventDTO {
    /**
     * Поле со значением id
     */
    private final Long id;

    /**
     * Поле со значением описания мероприятия
     */
    private final String infoEvent;

    /**
     * Поле со значением даты бронирования
     */
    private final Date dateReservation;

    public EventDTO(Long id, String infoEvent, Date dateReservation){
        this.id = id;
        this.infoEvent = infoEvent;
        this.dateReservation = dateReservation;
    }
}
