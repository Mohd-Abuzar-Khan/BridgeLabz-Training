package com.classandobject.levelone;

public class MobilePhone {
     
	// Attributes
    String brand;
    String model;
    double price;
    
    //constructor
    public MobilePhone(String brand,String model ,double price)
    {
    	this.brand=brand;
    	this.model=model;
    	this.price=price;
    	
    }
    
    
    // Method to display details about the mobile phone
    public void display() {
    	System.out.println("Brand of mobile: "+brand);
		System.out.println("Model of mobile: "+model);
		System.out.println("Price of mobile: "+price);
		System.out.println("------------------------------");

    }
    
    // Main method to test and run the display method
    public static void main(String[]args) {
    	MobilePhone obj1=new MobilePhone("OPPO", "OPPO9", 20999);
    	MobilePhone obj2=new MobilePhone("Apple", "16 pro", 89999);
    	MobilePhone obj3=new MobilePhone("VIVO", "VIVO8", 30999);
    	
    	obj1.display();
        obj2.display();
        obj3.display();
    }
    
    
}