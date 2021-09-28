package org.example.reservation.repo;

import org.example.reservation.domain.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Репозиторий для работы с Entity Event
 *
 * @author Desyatnikov Dmitry
 */
@Repository
public interface EventRepository extends JpaRepository<Event, Long> {
}
