// Created ProfitAndLoss Class for computing Profit and Loss 
public class ProfitAndLoss {
	public static void main(String[] args){
		
		// Creating a integer variable costPrice to indicate the cost price of item
		int costPrice = 129;
		
		// Creating a integer variable sellingPrice to indicate the sellingPrice of item;
		int sellingPrice = 191;
		
		//Creating a integer variable profit to indicate the profit obtain
		int profit = sellingPrice - costPrice;
		
		//Creating a double varibale profitPercentage to calculate the percentage of profit 
		double profitPercentage = ((double)profit / (double)costPrice)*100;
		
		//Displaying the cost price and selling price
		System.out.println("The Cost price is INR " + costPrice + " and Selling Price is INR " + sellingPrice);
		
		//Displaying the profit and profit percentage 
		System.out.println("The Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage);
	}
}