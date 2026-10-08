package com.fitness;

import java.util.ArrayList;
import java.util.List;

public class FitnessTracker {

    private List<Workout> workouts;

    // Default constructor //

    public FitnessTracker() {
        workouts = new ArrayList<>();
    }

    // Get all workouts //

    public List<Workout> getWorkouts() {
        return workouts;
    }

    // Add a workout //

    public void addWorkout(Workout workout) {
        if (workout != null) {
            workouts.add(workout);
        }
    }
}
