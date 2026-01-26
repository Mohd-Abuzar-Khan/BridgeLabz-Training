package com.reflection.dependencyinjection;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

// Dependency Injection using Reflection - Implements a simple DI container that scans classes with @Inject annotation
public class DependencyInjection {
    private Map<Class<?>, Object> container = new HashMap<>();
    
    // Register a class instance in the container
    public void register(Class<?> clazz, Object instance) {
        container.put(clazz, instance);
    }
    
    // Inject dependencies into an object
    public void injectDependencies(Object obj) {
        Class<?> clazz = obj.getClass();
        Field[] fields = clazz.getDeclaredFields();
        
        for (Field field : fields) {
            if (field.isAnnotationPresent(Inject.class)) {
                Class<?> fieldType = field.getType();
                Object dependency = container.get(fieldType);
                
                if (dependency != null) {
                    try {
                        field.setAccessible(true);
                        field.set(obj, dependency);
                        System.out.println("Injected " + fieldType.getSimpleName() + " into " + clazz.getSimpleName());
                    } catch (IllegalAccessException e) {
                        System.err.println("Error injecting dependency: " + e.getMessage());
                    }
                }
            }
        }
    }
    
    public static void main(String[] args) {
        DependencyInjection di = new DependencyInjection();
        
        // Register Service
        Service service = new Service();
        di.register(Service.class, service);
        
        // Create a class that needs injection
        class Client {
            @Inject
            private Service service;
            
            public void useService() {
                if (service != null) {
                    service.doWork();
                } else {
                    System.out.println("Service not injected!");
                }
            }
        }
        
        Client client = new Client();
        di.injectDependencies(client);
        client.useService();
    }
}
