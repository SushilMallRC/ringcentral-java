package com.ringcentral.definitions;


public class TMCreateEventRequest {
    /**
     * Internal identifier of an event
     */
    public String id;
    /**
     * Internal identifier of a person created an event
     */
    public String creatorId;
    /**
     * Event title
     * Required
     */
    public String title;
    /**
     * Datetime of starting an event
     * Required
     * Format: date-time
     */
    public String startTime;
    /**
     * Datetime of ending an event
     * Required
     * Format: date-time
     */
    public String endTime;
    /**
     * Indicates whether event has some specific time slot or lasts for whole day(s)
     */
    public Boolean allDay;
    /**
     * Event recurrence settings. For non-periodic events the value
     * is `None`. Must be greater or equal to event duration: 1- Day/Weekday;
     * 7 - Week; 28 - Month; 365 - Year
     * Enum: None, Day, Weekday, Week, Month, Year
     */
    public String recurrence;
    /**
     * Condition of ending an event
     * Enum: None, Count, Date
     */
    public String endingCondition;
    /**
     * Count of event iterations. For periodic events only. Value range is 1 - 10.
     * Must be specified if `endingCondition` is `Count`
     * Format: int32
     */
    public Long endingAfter;
    /**
     * Iterations ending datetime for periodic events in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format
     * Format: date-time
     */
    public String endingOn;
    /**
     * Color of Event title (including its presentation in Calendar)
     * Default: Black
     * Enum: Black, Red, Orange, Yellow, Green, Blue, Purple, Magenta
     */
    public String color;
    /**
     * Event location
     */
    public String location;
    /**
     * Event details
     */
    public String description;

    public TMCreateEventRequest id(String id) {
        this.id = id;
        return this;
    }

    public TMCreateEventRequest creatorId(String creatorId) {
        this.creatorId = creatorId;
        return this;
    }

    public TMCreateEventRequest title(String title) {
        this.title = title;
        return this;
    }

    public TMCreateEventRequest startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    public TMCreateEventRequest endTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    public TMCreateEventRequest allDay(Boolean allDay) {
        this.allDay = allDay;
        return this;
    }

    public TMCreateEventRequest recurrence(String recurrence) {
        this.recurrence = recurrence;
        return this;
    }

    public TMCreateEventRequest endingCondition(String endingCondition) {
        this.endingCondition = endingCondition;
        return this;
    }

    public TMCreateEventRequest endingAfter(Long endingAfter) {
        this.endingAfter = endingAfter;
        return this;
    }

    public TMCreateEventRequest endingOn(String endingOn) {
        this.endingOn = endingOn;
        return this;
    }

    public TMCreateEventRequest color(String color) {
        this.color = color;
        return this;
    }

    public TMCreateEventRequest location(String location) {
        this.location = location;
        return this;
    }

    public TMCreateEventRequest description(String description) {
        this.description = description;
        return this;
    }
}
