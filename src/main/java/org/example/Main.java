package org.example;


import org.example.ihm.Ihm;
import org.example.model.Todo;
import org.example.service.TodoService;
//import org.example.service.TodoServiceImpl;
import org.example.service.TodoServiceImplCorr2;
import org.example.service.TodoServiceImplCorrection;


public class Main {
    public static void main(String[] args) {
       // TodoService service = new TodoServiceImplCorrection(); // remplacer null par une instanciation d'une classe respectant l'interface TodoService
       TodoService service = new TodoServiceImplCorr2(); // remplacer null par une instanciation d'une classe respectant l'interface TodoService
        Ihm ihm = new Ihm(service);
        ihm.start();
    }
}

// public class Main {
//    public static void main(String[] args) {
//        TodoServiceImpl service = new TodoServiceImpl();
//        service.add("faire courses", "aller au magasin ");
//
//        for (String todo : service.getAll()) {
//            System.out.println(todo);
//        }
//    }

// }
