package org.example.service;

import org.example.model.Todo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TodoServiceImplCorrection implements TodoService {
    private List<Todo> todos = new ArrayList<>();
    private int count = 1;

    @Override
    public List<Todo> getAll() {
        return todos;
    }

    @Override
    public Todo getById(int id) {
        Todo todoSearch = null;
        for (Todo todo : todos) {
            if (todo.getId() == id)
                todoSearch = todo;
        }
       //  return todoSearch;
        return todos.get(id);
    }

    @Override
    public void add(String name, String description) {
        Todo newTodo = new Todo(count++, name, description);
        this.todos.add(newTodo);
    }

    @Override
    public void update(int id, String name, String description, boolean done) {
        Todo todoToUpdate = getById(id);
        todoToUpdate.setName(name);
        todoToUpdate.setDescription(description);
        todoToUpdate.setDone(done);
    }

    @Override
    public void remove(int id) {
        todos.remove(getById(id));
    }

    @Override
    public void toggleDone(int id) {
        Todo todoId = getById(id);
//        if (!todoId.isDone()) {
//            todoId.setDone(true);
//        } else {
//            todoId.setDone(false);
//        }
        todoId.setDone(!todoId.isDone());
    }
}