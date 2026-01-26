package com.annotations.caching;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * Advanced Level - Problem 7: Implement a Custom Caching System with @CacheResult
 */
public class CachingExample {
    private static Map<String, Object> cache = new HashMap<>();
    
    @CacheResult
    public int expensiveComputation(int n) {
        System.out.println("Computing for n = " + n);
        // Simulate expensive computation
        int result = 0;
        for (int i = 0; i < n * 1000000; i++) {
            result += i;
        }
        return result % 1000; // Return a simple result
    }
    
    @CacheResult
    public int fibonacci(int n) {
        System.out.println("Computing fibonacci(" + n + ")");
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    
    public static Object invokeWithCache(Object obj, Method method, Object... args) throws Exception {
        // Create cache key from method name and arguments
        StringBuilder keyBuilder = new StringBuilder(method.getName());
        for (Object arg : args) {
            keyBuilder.append("_").append(arg);
        }
        String cacheKey = keyBuilder.toString();
        
        // Check cache
        if (cache.containsKey(cacheKey)) {
            System.out.println("[CACHE HIT] Returning cached result for " + cacheKey);
            return cache.get(cacheKey);
        }
        
        // Execute method
        System.out.println("[CACHE MISS] Executing method " + method.getName());
        Object result = method.invoke(obj, args);
        
        // Store in cache
        cache.put(cacheKey, result);
        return result;
    }
    
    public static void main(String[] args) throws Exception {
        CachingExample example = new CachingExample();
        Class<?> clazz = example.getClass();
        
        Method expensiveMethod = clazz.getMethod("expensiveComputation", int.class);
        
        System.out.println("=== First Call (Cache Miss) ===");
        long start1 = System.nanoTime();
        Object result1 = invokeWithCache(example, expensiveMethod, 10);
        long end1 = System.nanoTime();
        System.out.println("Result: " + result1);
        System.out.println("Time: " + (end1 - start1) / 1_000_000.0 + " ms");
        
        System.out.println("\n=== Second Call (Cache Hit) ===");
        long start2 = System.nanoTime();
        Object result2 = invokeWithCache(example, expensiveMethod, 10);
        long end2 = System.nanoTime();
        System.out.println("Result: " + result2);
        System.out.println("Time: " + (end2 - start2) / 1_000_000.0 + " ms");
    }
}
