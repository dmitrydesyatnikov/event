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

    /**
     * Метод для изменения бронирования комнаты
     *
     * @param id        это параметр, задающий id бронирования, которое необходимо изменить
     * @param eventDTO это параметр с данными, которые необходимо внести для изменения бронирования
     *                  комнаты
     * @return изменённое бронирование комнаты
     */
    EventDTO edit(Long id, EventDTO eventDTO);

    /**
     * Метод удаления бронирования комнаты
     *
     * @param id это параметр, задающий id бронирования комнаты, которое необходимо удалить
     */
    void delete(Long id);
}
