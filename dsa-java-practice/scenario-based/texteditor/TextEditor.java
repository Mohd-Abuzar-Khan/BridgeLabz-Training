package texteditor;

import java.util.Stack;

public class TextEditor {
	
	//Creating two stack to store undo and redo state
	Stack<String> undo = new Stack<>();
	Stack<String> redo = new Stack<>();
	
	//Method to perform undo operation
	void undo() {
		if(undo.size() <=1) {
			System.out.println("No Undo state available");
			return;
		}
		redo.push(undo.pop());
	}
	
	//Method to perform redo operation
	void redo() {
		if(redo.size() <=1) {
			System.out.println("No Redo state available");
			return;
		}
		undo.push(redo.pop());
	}
	
	//Method to add text
	void addText(String text) {
		if (!undo.isEmpty()){
			undo.push(undo.peek() +" " + text);
			redo.clear();
		} else {
			undo.push(text);
			redo.clear();
		}
	}
	//Method to display text state
	void displaytext() {
		System.out.println(undo.peek());
	}
	public static void main(String[] args) {
		TextEditor editor = new TextEditor();
		
		//Performing Add state, undo and redo operation
		editor.addText("Hello");
		editor.displaytext();
		editor.addText("world");
		editor.displaytext();
		editor.addText("Testing");
		editor.displaytext();
		editor.undo();
		editor.displaytext();
		editor.addText("This is the new state");
		editor.displaytext();
		editor.undo();
		editor.displaytext();
		editor.undo();
		editor.displaytext();
		editor.undo();
		editor.displaytext();
		editor.redo();
		editor.displaytext();
		editor.addText("Walking to the end");
		editor.displaytext();
		editor.redo();
		editor.displaytext();
		

	}

}