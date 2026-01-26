package com.annotations.rolebasedaccess;

import java.lang.reflect.Method;

/**
 * Advanced Level - Problem 5: Implement a Role-Based Access Control with @RoleAllowed
 */
public class RoleBasedAccessExample {
    
    @RoleAllowed("ADMIN")
    public void adminOnlyMethod() {
        System.out.println("Admin method executed");
    }
    
    @RoleAllowed("USER")
    public void userMethod() {
        System.out.println("User method executed");
    }
    
    public void publicMethod() {
        System.out.println("Public method executed");
    }
    
    public static void executeMethod(Object obj, String methodName, String userRole) throws Exception {
        Class<?> clazz = obj.getClass();
        Method method = clazz.getMethod(methodName);
        
        if (method.isAnnotationPresent(RoleAllowed.class)) {
            RoleAllowed roleAllowed = method.getAnnotation(RoleAllowed.class);
            String requiredRole = roleAllowed.value();
            
            if (!userRole.equals(requiredRole)) {
                System.out.println("Access Denied! Required role: " + requiredRole + ", User role: " + userRole);
                return;
            }
        }
        
        method.invoke(obj);
    }
    
    public static void main(String[] args) throws Exception {
        RoleBasedAccessExample example = new RoleBasedAccessExample();
        
        System.out.println("=== Testing with ADMIN role ===");
        executeMethod(example, "adminOnlyMethod", "ADMIN");
        executeMethod(example, "userMethod", "ADMIN");
        
        System.out.println("\n=== Testing with USER role ===");
        executeMethod(example, "adminOnlyMethod", "USER");
        executeMethod(example, "userMethod", "USER");
        
        System.out.println("\n=== Testing public method ===");
        executeMethod(example, "publicMethod", "GUEST");
    }
}
