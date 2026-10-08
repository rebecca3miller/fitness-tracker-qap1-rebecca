package com.fitness;

import java.util.ArrayList;
import java.util.List;

public class FitnessTracker {

    private List<Workout> workouts;
    private List<Goal> goals;

    // Default constructor //
    public FitnessTracker() {
        workouts = new ArrayList<>();
        goals = new ArrayList<>();
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


    // Get all goals //
    public List<Goal> getGoals() {
        return goals;
    }


    // Add a goal //
    public void addGoal(Goal goal) {
        if (goal != null) {
            goals.add(goal);
        }
    }


    // Check if a goal has been reached //
    public boolean isGoalReached(Goal goal) {
        if (goal == null || goal.getTargetWorkouts() <= 0) {
            return false;
        }

        return workouts.size() >= goal.getTargetWorkouts();
    }
}
