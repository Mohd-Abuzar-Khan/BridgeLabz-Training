package bookbazar;

public class BookBazar {

    public static void main(String[] args) {

        // Creating books (Constructor + Inheritance)
        Book ebook1 = new EBook(
                "Atomic Habits",
                "James Clear",
                500,
                10,
                2.5
        );

        Book printedBook1 = new PrintedBook(
                "Clean Code",
                "Robert C. Martin",
                800,
                5,
                50
        );

        // Creating an order
        Order order1 = new Order(101);

        // Adding books to order (Encapsulation: stock updated via method)
        order1.addBook(ebook1, 1);
        order1.addBook(printedBook1, 1);

        // Polymorphism in action
        System.out.println("EBook discounted price: " + ebook1.applyDiscount());
        System.out.println("Printed Book discounted price: " + printedBook1.applyDiscount());

        // Operator usage: price × quantity – discount (abstracted internally)
        System.out.println("Total Order Amount: " + order1.calculateTotal());

        // Checking stock after order
        System.out.println("Remaining EBook stock: " + ebook1.getStock());
        System.out.println("Remaining Printed Book stock: " + printedBook1.getStock());

        // Order status (restricted modification)
        System.out.println("Order Status: " + order1.getStatus());
    }
}
