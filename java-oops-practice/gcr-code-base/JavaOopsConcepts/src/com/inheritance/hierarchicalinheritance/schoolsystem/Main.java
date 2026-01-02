package com.inheritance.hierarchicalinheritance.schoolsystem;

public class Main {
    public static void main(String[] args) {

        Teacher t = new Teacher("Mr. Sharma", 40, "Mathematics");
        Student s = new Student("Abuzar", 16, "10th Grade");
        Staff st = new Staff("Ganesh", 45, "Administration");

        t.displayDetails();
        t.displayRole();

        System.out.println();

        s.displayDetails();
        s.displayRole();

        System.out.println();

        st.displayDetails();
        st.displayRole();
    }
}

