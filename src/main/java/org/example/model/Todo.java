package org.example.model;

public class Todo {
    private int count;
    private int id;
    private String name;
    private String description;
    private boolean done;

    public Todo(String name, String description) {
        count = 1;
        this.name = name;
        this.done = false;
        this.description = description;
        this.id = count++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    @Override
    public String toString() {
        String completion = "";
        if (done == true) {
            completion = "(FAIT)";
        } else {
            completion = "(A FAIRE)";

        }
        return "Tache n°" + this.id + "Nom de la tâche : " + this.name + "\n" + ", description " + this.description + completion;
    }


}
