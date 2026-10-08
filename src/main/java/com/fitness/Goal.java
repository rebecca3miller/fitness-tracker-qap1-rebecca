package com.fitness;

public class Goal {

    private int id;
    private String name;
    private int targetWorkouts;

    // Default constructor //
    public Goal() {

    }

    // Constructor with parameters //
    public Goal(int id, String name, int targetWorkouts) {
        this.id = id;
        this.name = name;
        this.targetWorkouts = targetWorkouts;
    }

    // Getters and setters //
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTargetWorkouts() {
        return targetWorkouts;
    }

    public void setTargetWorkouts(int targetWorkouts) {
        this.targetWorkouts = targetWorkouts;
    }
}
