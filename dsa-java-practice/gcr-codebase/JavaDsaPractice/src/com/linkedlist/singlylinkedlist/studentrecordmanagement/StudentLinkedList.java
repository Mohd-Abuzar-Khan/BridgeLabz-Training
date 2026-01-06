package com.linkedlist.singlylinkedlist.studentrecordmanagement;

public class StudentLinkedList {
	private StudentNode head;
	
	public void addAtBeginning(int rollNo, String name, int age, char grade) {
		
		StudentNode newNode = new StudentNode(rollNo, name, age, grade);
		
		newNode.next = head;
		
		head = newNode;
	}
	
	public void addAtEnd(int rollNo, String name, int age, char grade) {
		
		StudentNode newNode = new StudentNode(rollNo, name, age, grade);

		if(head == null) {
			head = newNode;
			return;
		}
		
		StudentNode temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		
		temp.next = newNode;
		
	}
	
	public void addAtPosition(int position,int rollNo, String name, int age, char grade) {
		
		StudentNode newNode = new StudentNode(rollNo, name, age, grade);
		StudentNode temp = head;
		
		if(position <= 1) {
			addAtBeginning(rollNo, name, age, grade);
			return;
		}
		
		for(int i = 0; i < position - 1 && temp != null; i++) {
			temp = temp.next;
			
		}
		
		if (temp == null) {
			System.out.println("Invalid Output");
			return;
		}
		
		newNode.next = temp.next;
		temp.next = newNode.next;
			
	}
	
	// Deleted by Roll Number 
	public void deleteByRollNo(int rollNo) {
		
		if(head == null) {
			System.out.println("The list is empty");
		}
		
		if (head.rollNo == rollNo) {
            head = head.next;
            System.out.println("Student record deleted.");
            return;
        }
		
		StudentNode temp = head;
		while(temp.next != null && temp.next.rollNo != rollNo) {
			temp = temp.next;
		}
		
		if (temp.next == null) {
            System.out.println("Student with this roll no. not found.");
        } else {
            temp.next = temp.next.next;
            System.out.println("Student record deleted.");
        }
		
	}
	
	
	// Search by Roll Number
	public void searchByRollNo(int rollNo) {
		StudentNode temp = head;
		
		while(temp.next != null) {
			if(temp.rollNo == rollNo) {
				displayStudent(temp);
				return;
			}
			temp = temp.next;
		}
		
		System.out.println("Student is not found");
	}
	
	
	public void updateGrade(int rollNo, char grade) {
		StudentNode temp = head;
		
		while(temp != head) {
			if (temp.rollNo == rollNo) {
				temp.grade = grade;
				System.out.println("Grade updated successfully.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found.");
	}
	
	
	  // Display all students
    public void displayAll() {
        if (head == null) {
            System.out.println("No student records available.");
            return;
        }

        StudentNode temp = head;
        while (temp != null) {
            displayStudent(temp);
            temp = temp.next;
        }
    }

    private void displayStudent(StudentNode s) {
        System.out.println("----------------------------");
        System.out.println("Roll No: " + s.rollNo);
        System.out.println("Name   : " + s.name);
        System.out.println("Age    : " + s.age);
        System.out.println("Grade  : " + s.grade);
    }
}

