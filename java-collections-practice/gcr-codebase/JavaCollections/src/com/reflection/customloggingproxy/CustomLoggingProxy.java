package com.reflection.customloggingproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

// Advanced Level - Problem 10: Custom Logging Proxy Using Reflection - Implements a Dynamic Proxy that intercepts method calls and logs the method name
public class CustomLoggingProxy {
    
    public static void main(String[] args) {
        // Create the original object
        Greeting greeting = new GreetingImpl();
        
        // Create a proxy with logging
        Greeting proxy = (Greeting) Proxy.newProxyInstance(
            Greeting.class.getClassLoader(),
            new Class[]{Greeting.class},
            new LoggingInvocationHandler(greeting)
        );
        
        // Call methods through proxy
        System.out.println("=== Calling methods through proxy ===");
        proxy.sayHello();
        proxy.sayGoodbye();
    }
    
    // Invocation handler that logs method calls
    static class LoggingInvocationHandler implements InvocationHandler {
        private final Object target;
        
        public LoggingInvocationHandler(Object target) {
            this.target = target;
        }
        
        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            // Log before method execution
            System.out.println("[LOG] Calling method: " + method.getName());
            
            // Execute the actual method
            Object result = method.invoke(target, args);
            
            // Log after method execution
            System.out.println("[LOG] Method " + method.getName() + " completed");
            
            return result;
        }
    }
}
