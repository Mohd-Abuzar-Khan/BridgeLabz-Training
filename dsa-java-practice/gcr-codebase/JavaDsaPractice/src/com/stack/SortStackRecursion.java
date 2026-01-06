package com.stack;

import java.util.Stack;

//Sort a Stack using Recursion
public class SortStackRecursion {

 // Function to sort the stack
 public static void sortStack(Stack<Integer> stack) {

     // Base case: stack is empty
     if (stack.isEmpty()) {
         return;
     }

     // Step 1: Remove top element
     int top = stack.pop();

     // Step 2: Sort remaining stack
     sortStack(stack);

     // Step 3: Insert the element at correct position
     insertSorted(stack, top);
 }

 // Helper function to insert element in sorted order
 private static void insertSorted(Stack<Integer> stack, int value) {

     // If stack is empty OR value is greater than top element
     if (stack.isEmpty() || stack.peek() <= value) {
         stack.push(value);
         return;
     }

     // Remove top element
     int temp = stack.pop();

     // Recursive call
     insertSorted(stack, value);

     // Push back the removed element
     stack.push(temp);
 }

 // Main method for testing
 public static void main(String[] args) {

     Stack<Integer> stack = new Stack<>();

     stack.push(30);
     stack.push(10);
     stack.push(20);
     stack.push(5);

     System.out.println("Original Stack: " + stack);

     sortStack(stack);

     System.out.println("Sorted Stack (Ascending): " + stack);
 }
}
