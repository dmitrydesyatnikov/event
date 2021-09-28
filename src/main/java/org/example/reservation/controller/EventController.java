package org.example.reservation.controller;

import org.example.reservation.constants.EventMapConstant;
import org.example.reservation.dto.EventDTO;
import org.example.reservation.servicesinterface.EventServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Контроллер для работы с бронированиями комнаты
 *
 *  @author Desyatnikov Dmitry
 */

@RestController
public class EventController {
    /**
     * Сервис, содержащий методы для работы с бронированиями комнаты
     */
    @Autowired
    private EventServiceInterface eventService;
    /**
     * Метод получения списка всех бронирований
     *
     * @return список бронирований комнат
     */
    @GetMapping(value = EventMapConstant.EVENT_ALL)
    public List<EventDTO> findAll() {
        return eventService.findAll();
    }

    /**
     * Метод добавления нового бронирования комнаты
     *
     * @param eventDTO это параметр с данными для добавления бронирования комнаты
     * @return добавленное бронирования комнаты
     */
    @PostMapping(value = EventMapConstant.EVENT_NEW)
    public EventDTO newOffice(@RequestBody EventDTO eventDTO) {
        return eventService.newEvent(eventDTO);
    }
}