package org.example.reservation.converter;

import org.example.reservation.domain.Event;
import org.example.reservation.dto.EventDTO;
import org.example.reservation.servicesinterface.EventConverterInterface;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Сервис для конвертации EventDTO в Entity Event и Entity Event в EventDTO
 *
 * @author Desyatnikov Dmitry
 */
@Service
public class EventConverter implements EventConverterInterface {
 /**
 * Метод конвертации Entity Event в EventDTO
 *
 * @param event это Entity Event, которое необходимо конвертировать
 * @return EventDTO, полученную из Entity Event
 */
    public EventDTO entityToDto(Event event) {
        EventDTO dto = new EventDTO(event.getId(), event.getInfoEvent(), event.getDateReservation());
        return dto;
    }

    /**
     * Метод конвертации List Entity Event в List EventDTO
     *
     * @param events это List Entity Event, который необходимо конвертировать
     * @return List EventDTO, полученный из List Entity Event
     */
    public List<EventDTO> entityToDto(List<Event> events) {
        return events.stream().map(this::entityToDto).collect(Collectors.toList());
    }

    /**
     * Метод конвертации EventDTO в Entity Event
     *
     * @param eventDTO это EventDTO, который необходимо конвертировать
     * @return Entity Event, полученный из EventDTO
     */
    public Event dtoToEntity(EventDTO eventDTO) {
        Event event = new Event();
        event.setId(eventDTO.getId());
        event.setInfoEvent(eventDTO.getInfoEvent());
        event.setDateReservation(eventDTO.getDateReservation());
        return event;
    }

    /**
     * Метод конвертации List EventDTO в List Entity Event
     *
     * @param eventDTOs это List EventDTO, который необходимо конвертировать
     * @return List Entity Event, полученный из List EventDTO
     */
    public List<Event> dtoToEntity(List<EventDTO> eventDTOs) {
        return eventDTOs.stream().map(this::dtoToEntity).collect(Collectors.toList());
    }

    /**
     * Метод, изменяющий Entity Event путём передачи значений из EventDTO в Entity Event
     *
     * @param eventDTO это EventDTO со значениями, которые необходимо передать
     * @param event    это Entity Event, которую необходимо изменить
     * @return Entity Event, которая была изменена
     */
    public Event dtoToEntityEdit(EventDTO eventDTO, Event event) {
        event.setInfoEvent(eventDTO.getInfoEvent());
        event.setDateReservation(eventDTO.getDateReservation());
        return event;
    }
}
