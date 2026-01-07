package fittrack;

import java.util.ArrayList;

public class UserProfile {

    // User basic details
    public String name;
    public int age;
    public double weight;

    // Fitness goal details
    public String goal;
    public int dailyCalorieTarget;

    // List to store all workouts performed by the user
    private ArrayList<Workout> workouts = new ArrayList<>();

    // Constructor with default fitness goal and calorie target
    public UserProfile(String name, int age, double weight) {
        this(name, age, weight, "Stay Fit", 2000);
    }

    // Constructor with custom goal and calorie target
    public UserProfile(String name, int age, double weight, String goal, int dailyCalorieTarget) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.goal = goal;
        this.dailyCalorieTarget = dailyCalorieTarget;
    }

    // Getter method to return user weight
    public double getWeight() {
        return weight;
    }

    // Setter method to update user weight
    public void setWeight(double weight) {
        this.weight = weight;
    }

    // Adds a workout to the user's workout list
    public void addWorkout(Workout workout) {
        if (workout == null) {
            System.out.println("Invalid workout. Cannot add null workout.");
            return;
        }
        workouts.add(workout);
        System.out.println("Workout added for " + name + ": " + workout.getClass().getSimpleName());
    }

    // Calculates total calories burned and displays progress toward daily goal
    public void calculateProgress() {
        int totalBurned = 0;

        // Calculate calories burned from each workout
        for (Workout workout : workouts) {
            totalBurned += workout.calculateCalories();
        }

        // Display user progress
        System.out.println("\n--- Fitness Progress Report ---");
        System.out.println("User: " + name);
        System.out.println("Goal: " + goal);
        System.out.println("Daily Calorie Target: " + dailyCalorieTarget);
        System.out.println("Total Calories Burned: " + totalBurned);
        System.out.println("Workouts Completed: " + workouts.size());

        // Check whether the user met the daily goal
        if (totalBurned >= dailyCalorieTarget) {
            System.out.println("Goal achieved for today.");
        } else {
            System.out.println("Calories remaining to reach goal: " +
                    (dailyCalorieTarget - totalBurned));
        }
    }
}
