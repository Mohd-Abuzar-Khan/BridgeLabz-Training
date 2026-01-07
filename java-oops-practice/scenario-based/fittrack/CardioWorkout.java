package fittrack;

// CardioWorkout represents  exercises such as running or cycling
public class CardioWorkout extends Workout {

    // Constructor initializes workout type as Cardio and sets duration
    public CardioWorkout(int duration) {
        super("Cardio", duration);
    }

    // Calculates calories burned during a cardio workout
    @Override
    public int calculateCalories() {

        // Cardio exercises burn approximately 8 calories per minute
        caloriesBurned = duration * 8;

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
