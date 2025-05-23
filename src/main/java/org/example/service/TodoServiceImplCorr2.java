package org.example.service;

import org.example.model.Todo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TodoServiceImplCorr2 implements TodoService {

    private Map<Integer, Todo> todoMap = new HashMap<>();
    private int nextId = 1;

    @Override
    public List<Todo> getAll() {
        List<Todo> todoList = null;
//        for (Todo t : todoMap.values()) {
//            todoList.add(t);
//        }

        return new ArrayList<>(todoMap.values());
    }

    @Override
    public Todo getById(int id) {
        return todoMap.get(id);
    }

    @Override
    public void add(String name, String description) {
        Todo todo = new Todo(nextId++, name, description);
        todoMap.put(todo.getId(), todo);

    }

    @Override
    public void update(int id, String name, String description, boolean done) {
        Todo todoUpdate = todoMap.get(id);
        todoUpdate.setName(name);
        todoUpdate.setDescription(description);
        todoUpdate.setDone(done);
    }

    @Override
    public void remove(int id) {
//        Todo todoRemove = todoMap.get(id);
//        todoMap.remove(todoRemove);
        todoMap.remove(id);
    }

    @Override
    public void toggleDone(int id) {
        Todo todoToToggleDone = todoMap.get(id);
        todoToToggleDone.setDone(!todoToToggleDone.isDone());
    }
}
