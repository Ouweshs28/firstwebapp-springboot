package com.ouwesh.springboot.myfirstwebapp.controller.todo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

@Entity
public class Todo {

    @Id
    @GeneratedValue
    private long id;

    private String username;

    @Size(min = 10, message = "Please enter at least 10 characters")
    private String description;

    private LocalDate targetDate;

    private boolean targetReached;

    public Todo(long id, String username, String description, LocalDate targetDate, boolean targetReached) {
        this.id = id;
        this.username = username;
        this.description = description;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
