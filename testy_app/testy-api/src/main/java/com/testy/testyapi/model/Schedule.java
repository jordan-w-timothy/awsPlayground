package com.testy.testyapi.model;

import java.util.Arrays;
import java.util.Objects;

public class Schedule {
    private String date;
    private String title;
    private String[] events;

    public Schedule(String date, String title, String[] events) {
        this.date = date;
        this.title = title;
        this.events = events;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String[] getEvents() {
        return events;
    }

    public void setEvents(String[] events) {
        this.events = events;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Schedule schedule = (Schedule) o;
        return Objects.equals(date, schedule.date) && Objects.equals(title, schedule.title) && Arrays.equals(events, schedule.events);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(date, title);
        result = 31 * result + Arrays.hashCode(events);
        return result;
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "date='" + date + '\'' +
                ", title='" + title + '\'' +
                ", events=" + Arrays.toString(events) +
                '}';
    }
}
