package org.example.reservation.servicesinterface;

import org.example.reservation.dto.EventDTO;

import java.util.List;

/**
 * Интерфейс с методами для работы с бронированиями комнаты
 *
 * @author Desyatnikov Dmitry
 */
public interface EventServiceInterface {
    /**
     * Метод получения списка всех почтовых отделений
     *
     * @return список почтовых отделений
     */
    List<EventDTO> findAll();

    /**
     * Метод добавления нового бронирования комнаты
     *
     * @param eventDTO это параметр с данными для добавления почтового отделения
     * @return добавленное почтовое отделение
     */
    EventDTO newEvent(EventDTO eventDTO);
}
