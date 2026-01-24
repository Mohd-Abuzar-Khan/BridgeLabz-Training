package com.linkedlist.doublylinkedlist.undoredo;

//Main class to test Undo/Redo functionality
public class TextEditorApp {

 public static void main(String[] args) {

     UndoRedoManager editor = new UndoRedoManager();

     editor.addState("Hello");
     editor.addState("Hello World");
     editor.addState("Hello World!");
     editor.addState("Hello World! Welcome");

     editor.displayCurrentState();

     // Undo operations
     editor.undo();
     editor.displayCurrentState();

     editor.undo();
     editor.displayCurrentState();

     // Redo operation
     editor.redo();
     editor.displayCurrentState();

     // New typing clears redo history
     editor.addState("Hello World! Welcome Back");
     editor.displayCurrentState();

     editor.redo();  // Should not redo
 }
}
