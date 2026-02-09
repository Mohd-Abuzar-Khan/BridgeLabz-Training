package com.restrauntorder;

// Represents a chef thread
class Chef extends Thread {

    private final String dishName; // Assigned dish
    private final int cookingTime; // Total cooking time in ms

    public Chef(String chefName, String dishName, int cookingTime) {
        super(chefName);
        this.dishName = dishName;
        this.cookingTime = cookingTime;
    }

    @Override
    public void run() {

        System.out.println(getName() + " started preparing " + dishName);

        int stepTime = cookingTime / 4; // Time per step

        try {
            Thread.sleep(stepTime);
            System.out.println(getName() + " preparing " + dishName + ": 25% complete");

            Thread.sleep(stepTime);
            System.out.println(getName() + " preparing " + dishName + ": 50% complete");

            Thread.sleep(stepTime);
            System.out.println(getName() + " preparing " + dishName + ": 75% complete");

            Thread.sleep(stepTime);
            System.out.println(getName() + " preparing " + dishName + ": 100% complete");

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
