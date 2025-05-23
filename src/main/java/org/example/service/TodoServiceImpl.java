//package org.example.service;
//
//import org.example.model.Todo;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//
//public class TodoServiceImpl implements TodoService {
//    private List<Todo> todos;
//
////    public TodoServiceImpl(List<Todo> todos) {
////        this.todos = todos;
////    }
//
//    public TodoServiceImpl() {
//        todos = new ArrayList<>();
//    }
//
//    @Override
//    public List<Todo> getAll() {
//        List<String> todoNoms = new ArrayList<>();
//        for (int i = 0; i < this.todos.size(); i++) {
//            todoNoms.add(i + 1 + ") " + this.todos.get(i).getName() + this.todos.get(i).getDescription() + this.todos.get(i).isDone());
//        }
//        return Collections.singletonList(todoNoms.toString());
//    }
//
//    @Override
//    public Todo getById(int id) {
//        for (Todo todo : todos) {
//            if (todo.getId() == id)
//                return todo;
//        }
//        return null;
//    }
//
//    @Override
//    public void add(String name, String description) {
//        Todo todo = new Todo(name, description);
//        this.todos.add(todo);
//    }
//
//    @Override
//    public void update(int id, String name, String description, boolean done) {
//        for (Todo todo : todos) {
//            if (todo.getId() == id) {
//                todo.setName(name);
//                todo.setDescription(description);
//                todo.setDone(done);
//                break;
//            }
//        }
//    }
//
//    @Override
//    public void remove(int id) {
//        for (Todo todo : todos) {
//            if (todo.getId() == id)
//
//                todos.remove(Integer.valueOf(todo.getId()));
//        }
//    }
//
//    @Override
//    public void toggleDone(int id) {
//        for (Todo todo : todos) {
//            if (todo.getId() == id) {
//                if (todo.isDone() == false) {
//                    todo.setDone(true);
//                } else {
//                    todo.setDone(false);
//                }
//            }
//        }
//    }
//}