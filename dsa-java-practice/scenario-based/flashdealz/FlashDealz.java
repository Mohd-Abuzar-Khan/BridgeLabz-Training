package sorting.flashdealz;

public class FlashDealz {
	
	static int listSize = 0;
	static Product[] productList = new Product[listSize];
	
	// Static method to add product to array list
		public static void addProduct(String productName, int price, double discount) {
			Product product = new Product(productName, price, discount);
			if (listSize <= productList.length) {
				Product[] temp = new Product[++listSize];
				for (int i = 0; i < listSize - 1; i++) {
					temp[i] = productList[i];
				}
				temp[listSize - 1] = product;
				productList = temp;
				System.out.println(listSize + ") Product added successfully ");
			}

		}

		//Method to perform quick sort
		public static void quickSort(Product[] product, int low, int high) {
			if (low < high) {
				int pi = partition(product, low, high);
				quickSort(product, low, pi - 1);
				quickSort(product, pi + 1, high);
			}

		}
	
	
	private static int partition(Product[] product, int low, int high) {
			
			double pivot = product[high].discount;
			
			int i = low - 1;
			for(int j = low; j < high; j++) {
				if(product[j].discount < pivot) {
					i++;
					
					Product temp = product[j];
					product[j] = product[i];
					product[i] = temp;
					
				}
				
			}
			
			Product temp = product[high];
			product[high] = product[i + 1];
			product[i + 1] = temp;
		
			return i + 1;
		}
		

	//Method display product information
	public static void displayInfo() {
		System.out.println("---------------------------------");
		System.out.println("Product Details");
		System.out.println("----------------------------------------------------------");
		System.out.println("Product\t\t\tPrice\t\tDiscount");
		System.out.println("----------------------------------------------------------");
		for (Product p : productList) {
			System.out.println(p.product + "\t" + p.price + "\t\t" + p.discount);
		}
		System.out.println("----------------------------------------------------------");
	}


	public static void main(String[] args) {
		
		//Adding product to product list
		addProduct("Laptop		", 65000, 10);
		addProduct("Smartphone	", 22000, 5);
		addProduct("Headphones	", 2500, 15);
		addProduct("Smartwatch	", 5000, 8);
		addProduct("Keyboard		", 1200, 12);
		addProduct("Mouse		", 800, 10);
		addProduct("Monitor		", 15000, 7);
		addProduct("Printer		", 9000, 6);
		addProduct("Webcam		", 3000, 9);
		addProduct("External Hard Drive", 6000, 11);
		addProduct("Pen Drive	", 700, 20);
		addProduct("Router		", 2800, 13);
		addProduct("Bluetooth Speaker", 3500, 14);
		addProduct("Power Bank	", 2000, 10);
		addProduct("Tablet		", 18000, 5);
		addProduct("Scanner		", 12000, 6);
		addProduct("Graphics Card	", 42000, 4);
		addProduct("RAM 16GB		", 6500, 8);
		addProduct("SSD 1TB		", 9000, 9);
		addProduct("Cooling Fan	", 1500, 18);
				
		//Calling method to display product information
		displayInfo();
				
		System.out.println("\nProduct after sorting with respect to discount");
		quickSort(productList,0,listSize-1); //Calling method to sort product list
				
		//Calling Method to display product information after sorting
		displayInfo();

		
	}

}
