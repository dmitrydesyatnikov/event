package org.example.reservation.constants;
/**
 * Константы со значениями маппинга для EventController
 *
 * @author Desyatnikov Dmitry
 */
public final class EventMapConstant {
    /**
     * Поле со значением маппинга для метода findAll
     */
    public static final String EVENT_ALL = "events";

    /**
     * Поле со значением маппинга для метода newEvent
     */
    public static final String EVENT_NEW = "newevent";

    /**
     * Поле со значением маппинга для метода edit
     */
    public static final String EVENT_EDIT = "editevent/{id}";

    /**
     * Поле со значением маппинга для метода delete
     */
    public static final String EVENT_DELETE = "deleteevent/{id}";
}
