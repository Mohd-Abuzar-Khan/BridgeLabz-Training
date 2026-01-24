package sorting.icecreamrush;

public class Flavour {

	protected String flavourName;
	private int sold;
	public Flavour(String flavourName) {

		this.flavourName = flavourName;
	}
	
	
	void soldIceCream() {
		System.out.println(flavourName +" Sold");
		sold++;
	}
	
	public int getSold() {
		return sold;
	}
	public void setSold(int sold) {
		this.sold = sold;
	}
	
	

}
