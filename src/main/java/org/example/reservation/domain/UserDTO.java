package org.example.reservation.domain;

import java.util.Date;
/**
 * DTO для UserDTO
 */

public class UserDTO {
    private String infoEvent;
    private Date dateReservation;

    public String getInfoEvent() {
        return infoEvent;
    }
    public void setInfoEvent(String infoEvent) {
        this.infoEvent = infoEvent;
    }

    public Date getDateReservation() {
        return dateReservation;
    }
    public void setDateReservation(Date dateReservation) {
        this.dateReservation = dateReservation;
    }

}
