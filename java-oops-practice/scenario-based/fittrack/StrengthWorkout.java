package fittrack;

// StrengthWorkout represents workouts like weight lifting or resistance training
public class StrengthWorkout extends Workout {

    // Constructor initializes workout type and duration
    public StrengthWorkout(int duration) {
        super("Strength", duration);
    }

    // Calculates calories burned during a strength workout
    @Override
    public int calculateCalories() {
        caloriesBurned = duration * 5;

        // Display workout details and calories burned
        System.out.println(
                "Workout Type   : " + type +
                "\nDuration       : " + duration + " minutes" +
                "\nCalories Burned: " + caloriesBurned + "\n"
        );

        // Return calculated calories
        return caloriesBurned;
    }
}
