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

    // Test adding a goal //
    @Test
    public void testAddGoal() {
        FitnessTracker tracker = new FitnessTracker();
        Goal goal = new Goal();

        goal.setId(1);
        goal.setName("Complete 5 workouts");
        goal.setTargetWorkouts(5);

        tracker.addGoal(goal);

        Assertions.assertEquals(1, tracker.getGoals().size());
    }

    // Test adding a null goal //
    @Test
    public void testAddNullGoal() {
        FitnessTracker tracker = new FitnessTracker();

        tracker.addGoal(null);

        Assertions.assertEquals(0, tracker.getGoals().size());
    }

    // Test a goal that has not been reached //
    @Test
    public void testGoalNotReached() {
        FitnessTracker tracker = new FitnessTracker();
        Goal goal = new Goal();

        goal.setId(1);
        goal.setName("Complete 5 workouts");
        goal.setTargetWorkouts(5);

        Assertions.assertFalse(tracker.isGoalReached(goal));
    }

    // Test a goal that has been reached //
    @Test
    public void testGoalReached() {
        FitnessTracker tracker = new FitnessTracker();
        Goal goal = new Goal();

        goal.setId(2);
        goal.setName("Complete 1 workout");
        goal.setTargetWorkouts(1);

        Workout workout = new Workout();
        tracker.addWorkout(workout);

        Assertions.assertTrue(tracker.isGoalReached(goal));
    }

    // Test checking a null goal //
    @Test
    public void testNullGoalNotReached() {
        FitnessTracker tracker = new FitnessTracker();

        Assertions.assertFalse(tracker.isGoalReached(null));
    }

    // Test a goal with an invalid target //
    @Test
    public void testInvalidGoalTarget() {
        FitnessTracker tracker = new FitnessTracker();
        Goal goal = new Goal();

        goal.setId(3);
        goal.setName("Invalid Goal");
        goal.setTargetWorkouts(0);

        Assertions.assertFalse(tracker.isGoalReached(goal));
    }
}
