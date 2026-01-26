package com.annotations.suppresswarnings;

import java.util.ArrayList;
import java.util.List;

/**
 * Exercise 3: Suppress Unchecked Warnings
 */
public class SuppressWarningsExample {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        // Creating ArrayList without generics
        List list = new ArrayList();
        list.add("Hello");
        list.add("World");
        
        System.out.println("List contents: " + list);
    }
}
