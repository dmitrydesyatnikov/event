package org.example.reservation.servicesinterface;

import org.example.reservation.domain.Event;
import org.example.reservation.dto.EventDTO;

import java.util.List;

/**
 * Интерфейс с методами для конвертации EventDTO в Entity Event и Entity Event в EventDTO
 *
 * @author Desyatnikov Dmitry
 */
public interface EventConverterInterface {
    /**
     * Метод конвертации Entity Event в EventDTO
     *
     * @param event это Entity Event, которую необходимо конвертировать
     * @return EventDTO, полученную из Entity Event
     */
    EventDTO entityToDto(Event event);

    /**
     * Метод конвертации List Entity Event в List EventDTO
     *
     * @param events это List Entity Event, который необходимо конвертировать
     * @return List EventDTO, полученный из List Entity Event
     */
    List<EventDTO> entityToDto(List<Event> events);

    /**
     * Метод конвертации EventDTO в Entity Event
     *
     * @param eventDTO это EventDTO, который необходимо конвертировать
     * @return Entity Event, полученный из EventDTO
     */
    Event dtoToEntity(EventDTO eventDTO);

    /**
     * Метод конвертации List EventDTO в List Entity Event
     *
     * @param eventDTOs это List EventDTO, который необходимо конвертировать
     * @return List Entity Event, полученный из List EventDTO
     */
    List<Event> dtoToEntity(List<EventDTO> eventDTOs);

    /**
     * Метод, изменяющий Entity Event путём передачи значений из EventDTO в Entity Event
     *
     * @param eventDTO это EventDTO со значениями, которые необходимо передать
     * @param event    это Entity Event, которую необходимо изменить
     * @return Entity Event, которая была изменена
     */
    Event dtoToEntityEdit(EventDTO eventDTO, Event event);

}
