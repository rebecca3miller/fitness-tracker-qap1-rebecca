package com.fitness;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class FitnessTrackerTest {

    // Test that the workout list starts empty //
    @Test
    public void testEmptyWorkoutList() {
        FitnessTracker tracker = new FitnessTracker();

        Assertions.assertEquals(0, tracker.getWorkouts().size());
    }

    // Test that the goal list starts empty //
    @Test
    public void testEmptyGoalList() {
        FitnessTracker tracker = new FitnessTracker();

        Assertions.assertEquals(0, tracker.getGoals().size());
    }

    // Test adding a workout //
    @Test
    public void testAddWorkout() {
        FitnessTracker tracker = new FitnessTracker();
        Workout workout = new Workout();

        tracker.addWorkout(workout);

        Assertions.assertEquals(1, tracker.getWorkouts().size());
    }

    // Test adding a null workout //
    @Test
    public void testAddNullWorkout() {
        FitnessTracker tracker = new FitnessTracker();

        tracker.addWorkout(null);

        Assertions.assertEquals(0, tracker.getWorkouts().size());
    }
}
