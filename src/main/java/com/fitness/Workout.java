package com.fitness;

public class Workout {

    private int id;
    private String name;
    private int duration;
    private int caloriesBurned;

    // Default constructor //
    public Workout() {

    }

    // Constructor with parameters //
    public Workout(int id, String name, int duration, int caloriesBurned) {
        this.id = id;
        this.name = name;
        this.duration = duration;
        this.caloriesBurned = caloriesBurned;
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

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getCaloriesBurned() {
        return caloriesBurned;
    }

    public void setCaloriesBurned(int caloriesBurned) {
        this.caloriesBurned = caloriesBurned;
    }
}
