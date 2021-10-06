package org.example.reservation.controller;

import org.example.reservation.constants.EventMapConstant;
import org.example.reservation.dto.EventDTO;
import org.example.reservation.servicesinterface.EventServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    /**
     * Метод для изменения бронирования комнаты
     *
     * @param id        это параметр, задающий id бронирования, которое необходимо изменить
     * @param eventDTO это параметр с данными, которые необходимо внести для изменения бронирования
     *                  комнаты
     * @return изменённое бронирование комнаты
     */
    @PutMapping(value = EventMapConstant.EVENT_EDIT)
    public EventDTO edit(@PathVariable(name = "id") Long id, @RequestBody EventDTO eventDTO){
        return eventService.edit(id,eventDTO);
    }

    /**
     * Метод удаления бронирования комнаты
     *
     * @param id это параметр, задающий id бронирования комнаты, которое необходимо удалить
     */
    @DeleteMapping(value = EventMapConstant.EVENT_DELETE)
    public void delete(@PathVariable(name = "id") Long id){
        eventService.delete(id);
    }
}