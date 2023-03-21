package com.ouwesh.springboot.myfirstwebapp.controller.todo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class TodoService {

    private static List<Todo> todos = new ArrayList<>();

    private static int todoCount = 0;

    static {
        todos.add(
                new Todo(++todoCount, "ows", "Learn Java", LocalDate.now().plusYears(1), false));
        todos.add(
                new Todo(++todoCount, "ows", "Learn AWS", LocalDate.now().plusYears(2), false));
        todos.add(
                new Todo(++todoCount, "ows", "Learn Quarkus", LocalDate.now().plusYears(3), false));
    }


    public List<Todo> findByUsername(String username) {
        return todos;
    }

    public void addTodo(String username, String description, LocalDate targetDate, Boolean isCompleted) {
        todos.add(new Todo(++todoCount, username, description, targetDate, isCompleted));
    }

    public void deleteById(int id) {
        Predicate<Todo> predicate = todo -> todo.getId() == id;
        todos.removeIf(predicate);
    }
}
