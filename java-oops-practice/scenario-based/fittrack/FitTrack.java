package fittrack;

public class FitTrack {

    public static void main(String[] args) {

        // Creating first user profile with name, age, and weight
        UserProfile u1 = new UserProfile("Abuzar Khan", 21, 63);

        // Creating second user profile to show multi-user support
        UserProfile u2 = new UserProfile("Rahul Sharma", 24, 75);

        // Creating strength workouts with duration in minutes
        StrengthWorkout w1 = new StrengthWorkout(25);
        StrengthWorkout w2 = new StrengthWorkout(40);

        // Creating cardio workouts with duration in minutes
        CardioWorkout c1 = new CardioWorkout(30);
        CardioWorkout c2 = new CardioWorkout(20);

        // Adding workouts to first user
        u1.addWorkout(w1);
        u1.addWorkout(c1);

        // Adding workouts to second user
        u2.addWorkout(w2);
        u2.addWorkout(c2);

        // Calculating fitness progress for each user based on target calories
        u1.calculateProgress();
        u2.calculateProgress();

        // Calculating calories burned for each workout (polymorphism in action)
        w1.calculateCalories();
        c1.calculateCalories();
        w2.calculateCalories();
        c2.calculateCalories();

    }

}
