package com.ouwesh.springboot.myfirstwebapp.controller.todo;

import java.time.LocalDate;

public class Todo {

    private long id;

    private String username;

    private String title;

    private LocalDate targetDate;

    private boolean targetReached;

    public Todo(long id, String username, String title, LocalDate targetDate, boolean targetReached) {
        this.id = id;
        this.username = username;
        this.title = title;
        this.targetDate = targetDate;
        this.targetReached = targetReached;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(LocalDate targetDate) {
        this.targetDate = targetDate;
    }

    public boolean isTargetReached() {
        return targetReached;
    }

    public void setTargetReached(boolean targetReached) {
        this.targetReached = targetReached;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", targetDate=" + targetDate +
                ", targetReached=" + targetReached +
                '}';
    }
}
