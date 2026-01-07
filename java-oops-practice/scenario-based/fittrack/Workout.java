package fittrack;

public abstract class Workout implements ITrackable {

    protected String type;
    protected int duration; // in minutes
    protected int caloriesBurned;

    public Workout(String type, int duration) {
        this.type = type;
        this.duration = duration;
    }

    // Polymorphic method
    public abstract int calculateCalories();

    public void startWorkout() {
        System.out.println(type + " workout started.");
    }

    public void stopWorkout() {
        System.out.println(type + " workout stopped.");
    }

    public int getCaloriesBurned() {
        return caloriesBurned;
    }
}

