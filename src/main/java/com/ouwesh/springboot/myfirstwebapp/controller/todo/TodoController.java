package com.ouwesh.springboot.myfirstwebapp.controller.todo;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.time.LocalDate;

@Controller
@SessionAttributes("name")
public class TodoController {

    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @RequestMapping("list-todos")
    public String listAllTodos(ModelMap modelMap) {
        modelMap.put("todos", todoService.findByUsername(""));
        return "listTodos";
    }

    @RequestMapping(value = "add-todo", method = RequestMethod.GET)
    public String showNewTodoPage(ModelMap modelMap) {
        Todo todo = new Todo(0, modelMap.get("name").toString(), "", LocalDate.now().plusYears(1), false);
        modelMap.put("todo", todo);
        return "todo";
    }

    @RequestMapping(value = "add-todo", method = RequestMethod.POST)
    public String addNewTodo(ModelMap modelMap, @Valid Todo todo, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "todo";
        }
        todoService.addTodo(modelMap.get("name").toString(), todo.getDescription(), LocalDate.now().plusYears(1), false);
        return "redirect:list-todos";
    }

    @RequestMapping("delete-todo")
    public String deleteTodo(@RequestParam int id) {
        todoService.deleteById(id);
        return "redirect:list-todos";
    }

}
