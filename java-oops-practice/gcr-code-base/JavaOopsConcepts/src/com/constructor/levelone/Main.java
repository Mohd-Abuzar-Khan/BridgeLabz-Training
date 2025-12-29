package com.constructor.levelone;

public class Main {

    // Executing All the testing method in main
    public static void main(String[] args) {

        testBookClass();
        testCircleClass();
        testPersonCopyConstructor();
        testHotelBooking();
        testCarRental();
        testProductClass();
        testCourseClass();
        testVehicleClass();
        testStudentAndPostgraduate();
        testManagerAndEmployee();
        testBankAccount();
        testEBook();
    }
    

    // Book Class Testing
    public static void testBookClass() {
        System.out.println("\n--- Book Class Test ---");

        Book book1 = new Book();
        Book book2 = new Book("Atomic Habits", "James Clear", 499);

        System.out.println("Book 1 → " + book1.title + ", " + book1.author + ", ₹" + book1.price);
        System.out.println("Book 2 → " + book2.title + ", " + book2.author + ", ₹" + book2.price);

        book2.borrowBook();
    }


    // Circle Class Testing   
    public static void testCircleClass() {
        System.out.println("\n--- Circle Class Test ---");

        Circle defaultCircle = new Circle();
        Circle customCircle = new Circle(50.5);

        System.out.println("Default Circle Radius: " + defaultCircle.radius);
        System.out.println("Custom Circle Radius: " + customCircle.radius);
    }

   
    // Person Copy Constructor Testing 
    public static void testPersonCopyConstructor() {
        System.out.println("\n--- Person Copy Constructor Test ---");

        Person originalPerson = new Person("Abuzar", 22);
        Person copiedPerson = new Person(originalPerson);

        System.out.println("Original Person: " + originalPerson.name + ", " + originalPerson.age);
        System.out.println("Copied Person: " + copiedPerson.name + ", " + copiedPerson.age);
    }
    

    // Hotel Booking Testing    
    public static void testHotelBooking() {
        System.out.println("\n--- Hotel Booking Test ---");

        HotelBooking booking1 = new HotelBooking("Abuzar", "Deluxe", 3);
        HotelBooking booking2 = new HotelBooking(booking1);

        System.out.println("Booking 1 → " + booking1.guestName + ", " + booking1.roomType + ", Nights: " + booking1.nights);
        System.out.println("Booking 2 → " + booking2.guestName + ", " + booking2.roomType + ", Nights: " + booking2.nights);
    }
    

    // Car Rental Testing
    public static void testCarRental() {
        System.out.println("\n--- Car Rental Test ---");

        CarRental rental = new CarRental("Abuzar", "SUV", 4);
        System.out.println("Total Rental Cost: ₹" + rental.calculateCost());
    }

    // Product Class Testing
    public static void testProductClass() {
        System.out.println("\n--- Product Class Test ---");

        Product product1 = new Product("Laptop", 75000);
        Product product2 = new Product("Smartphone", 45000);
        Product product3 = new Product("Headphones", 3000);

        product1.displayProductDetails();
        System.out.println();

        product2.displayProductDetails();
        System.out.println();

        Product.displayTotalProducts();
    }

    
    // Course Class Testing
    public static void testCourseClass() {
        System.out.println("\n--- Course Class Test ---");

        Course course1 = new Course("Java Full Stack", 6, 45000);
        Course course2 = new Course("Data Structures", 4, 30000);

        course1.displayCourseDetails();
        course2.displayCourseDetails();

        Course.updateInstituteName("BridgeLabs");

        System.out.println("\nAfter Updating Institute Name:\n");

        course1.displayCourseDetails();
        course2.displayCourseDetails();
    }


    // Vehicle Class Testing
    public static void testVehicleClass() {
        System.out.println("\n--- Vehicle Registration Test ---");

        Vehicle vehicle1 = new Vehicle("Abuzar", "Car");
        Vehicle vehicle2 = new Vehicle("Ayaan", "Bike");

        vehicle1.displayVehicleDetails();
        vehicle2.displayVehicleDetails();

        Vehicle.updateRegistrationFee(6500);

        System.out.println("\nAfter Updating Registration Fee:\n");

        vehicle1.displayVehicleDetails();
        vehicle2.displayVehicleDetails();
    }


    // Student & Postgraduate Student Testing
    public static void testStudentAndPostgraduate() {
        System.out.println("\n--- Student & Postgraduate Test ---");

        Student student = new Student(101, "Abuzar", 8.7);
        student.displayStudentInfo();

        System.out.println("\nUpdating CGPA...");
        student.setCGPA(9.1);
        System.out.println("Updated CGPA: " + student.getCGPA());

        System.out.println("\nPostgraduate Student:");

        PostgraduateStudent pgStudent =
                new PostgraduateStudent(201, "Abuzar Khan", 9.3, "Computer Science");

        pgStudent.displayPostgraduateDetails();
    }

    // Manager & Employee Testing
    public static void testManagerAndEmployee() {
        System.out.println("\n--- Manager & Employee Test ---");

        Manager manager = new Manager(101, "Engineering", 85000, "Team Lead");

        manager.displayManagerDetails();

        System.out.println("\nUpdating Salary...");
        manager.setSalary(95000);

        System.out.println("Updated Salary: " + manager.getSalary());
    }

    
    // Bank Account & Savings Account Testing
    public static void testBankAccount() {
        System.out.println("\n--- Bank Account Test ---");

        SavingsAccount savingsAccount = new SavingsAccount(
                "SB12345",
                "Abuzar Khan",
                50000,
                4.5
        );

        savingsAccount.displayAccountDetails();

        System.out.println("\nUpdating Balance...");
        savingsAccount.setBalance(60000);

        System.out.println("Updated Balance: " + savingsAccount.getBalance());
    }
    
 // EBooks and Books Testing
    public static void testEBook() {
    	System.out.println("\n--- EBook Test ---");
    	EBook ebook = new EBook(
                "978-0134685991",
                "Subtle art of not giving a fu*k",
                "Mark Manson",
                "PDF"
        );

        ebook.displayEBookDetails();

        // Modifying author using setter
        ebook.setAuthor("M. Manson");
        System.out.println("Updated Author: " + ebook.getAuthor());
    }
}
