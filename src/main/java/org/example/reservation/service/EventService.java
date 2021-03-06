package org.example.reservation.service;

import org.example.reservation.domain.Event;
import org.example.reservation.dto.EventDTO;
import org.example.reservation.repo.EventRepository;
import org.example.reservation.servicesinterface.EventConverterInterface;
import org.example.reservation.servicesinterface.EventServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Сервис для работы с бронированиями комнаты
 *
 * @author Desyatnikov Dmitry
 */
@Service
public class EventService implements EventServiceInterface {
    /**
     * Репозиторий для работы с Entity Event
     */
    @Autowired
    private EventRepository eventRepository;

    /**
     * Сервис для конвертации EventDTO в Entity Event и Entity Event в EventDTO
     */
    @Autowired
    private EventConverterInterface eventConverter;

    /**
     * Метод получения списка всех бронирований комнаты
     *
     * @return список бронирований комнаты
     */
    public List<EventDTO> findAll() {
        return eventConverter.entityToDto(eventRepository.findAll());
    }

    /**
     * Метод добавления нового бронирования комнаты
     *
     * @param eventDTO это параметр с данными для добавления бронирования комнаты
     * @return добавленное бронирование комнаты
     */
    public EventDTO newEvent(EventDTO eventDTO) {
        Event event = eventConverter.dtoToEntity(eventDTO);
        return eventConverter.entityToDto(eventRepository.saveAndFlush(event));
    }
}
