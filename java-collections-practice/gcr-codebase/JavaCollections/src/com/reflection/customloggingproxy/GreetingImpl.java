package com.reflection.customloggingproxy;

// Implementation of Greeting interface
public class GreetingImpl implements Greeting {
    @Override
    public void sayHello() {
        System.out.println("Hello!");
    }
    
    @Override
    public void sayGoodbye() {
        System.out.println("Goodbye!");
    }
}
