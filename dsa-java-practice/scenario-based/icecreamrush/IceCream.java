package sorting.icecreamrush;

public class IceCream {
	
	public static Flavour[] flavourList = new Flavour[8];
	public static int index = 0;
	
	
	public static void addFlavour(Flavour flavour) {
		if (index < flavourList.length) {
			flavourList[index] = flavour;
			System.out.println(flavour.flavourName + " added successfully ");
			index++;
		} else {
			System.out.println("List full");
		}
	}
	
	

	public static void bubbleSort() 
	{
		for(int i = 0; i < flavourList.length - 1; i++) {
			
			boolean swapped = false;
			
			for(int j = 0; j < flavourList.length - i - 1; j++) {
				
				if(flavourList[j].getSold() > flavourList[j + 1].getSold()) {
					Flavour temp = flavourList[j];
                    flavourList[j] = flavourList[j + 1];
                    flavourList[j + 1] = temp;
                    swapped = true;
				}
			}
			
			
			if (!swapped) {
                break;
            }
			
		}
	}
	
	public static void displayFlavour() {
		
		System.out.println("------------------------------------------");
		System.out.println("Ice Cream Flavor Popularity");
		System.out.println("------------------------------------------");
		System.out.println("Flavor\t\t\tPopularity");
		System.out.println("------------------------------------------");
		for (Flavour fl : flavourList) {
			System.out.println(fl.flavourName + "\t\t" + fl.getSold());
		}
	}
	
	public static void main(String[] args) {

		// Creating object of flavor
		Flavour flavor1 = new Flavour("Caramel");
		Flavour flavor2 = new Flavour("Blueberry");
		Flavour flavor3 = new Flavour("Coffee");
		Flavour flavor4 = new Flavour("Pineapple");
		Flavour flavor5 = new Flavour("Hazelnut");
		Flavour flavor6 = new Flavour("MintChocolate");
		Flavour flavor7 = new Flavour("Raspberry");
		Flavour flavor8 = new Flavour("DarkChocolateFudge");


		// Adding flavor to list
		System.out.println("------------------------------------------");
		addFlavour(flavor1);
		addFlavour(flavor2);
		addFlavour(flavor3);
		addFlavour(flavor4);
		addFlavour(flavor5);
		addFlavour(flavor6);
		addFlavour(flavor7);
		addFlavour(flavor8);

		// calling method to sold ice cream
		System.out.println("------------------------------------------");
		flavor3.soldIceCream();
		flavor1.soldIceCream();
		flavor7.soldIceCream();
		flavor4.soldIceCream();
		flavor2.soldIceCream();
		flavor5.soldIceCream();
		flavor8.soldIceCream();
		flavor1.soldIceCream();
		flavor6.soldIceCream();
		flavor3.soldIceCream();
		flavor2.soldIceCream();
		flavor4.soldIceCream();
		flavor7.soldIceCream();
		flavor1.soldIceCream();
		flavor5.soldIceCream();
		flavor1.soldIceCream();
		flavor6.soldIceCream();
		flavor1.soldIceCream();
		flavor2.soldIceCream();
		flavor4.soldIceCream();
		System.out.println("------------------------------------------");

		// Calling method to apply sorting
		bubbleSort();

		// Calling method to display IceCream details
		displayFlavour();

	}

}
