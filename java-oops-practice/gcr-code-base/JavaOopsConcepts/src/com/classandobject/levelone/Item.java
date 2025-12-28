package com.classandobject.levelone;

public class Item {
    
	// Attributes
	String [] itemCode;
	String []  itemName;
	double []  price;
	
	//constructor
	public Item(String[] itemCode, String []itemName, double[]price){
		this.itemCode=itemCode;
		this.itemName=itemName;
		this.price= price;
		
	}
	
	// Method to display details of an Item
	public void display(int i) {
		System.out.println("itemCode : "+itemCode[i]);
		System.out.println("itemPrice : "+price[i]);
		System.out.println("itemName : "+itemName[i]);
		System.out.println("----------------------------");

	}
	
	// Main Method for testing and running
	public static void main(String[]args) {
		String[] itemName= {"Sipper","Vase","Turtel Neck"};
		String[] itemCode= {"04xA","05xB","06xC"};
		double[] price= {600,400,900};
        Item obj=new Item(itemName,itemCode, price);
        
        for(int i=0; i<price.length ; i++) {
        	obj.display(i);
        }
	}
}