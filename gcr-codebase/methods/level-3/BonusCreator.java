// Create BonusCreator class to calculate bonus and salary
public class BonusCreator {

	// Method to generate random salary and service years
	public static double[][] generateEmployeeData(int size) {
		double[][] data = new double[size][2];
		for (int i = 0; i < size; i++) {
			data[i][0] = 10000 + (Math.random() * 90000); // Salary
			data[i][1] = 1 + (Math.random() * 10);       // Years of Service
		}
		return data;
	}

	// Method to calculate new salary and bonus
	public static double[][] calculateBonus(double[][] data) {
		double[][] result = new double[data.length][3];
		for (int i = 0; i < data.length; i++) {

			double salary = data[i][0];
			double years = data[i][1];
			double bonusRate;

			if (years > 5) {
				bonusRate = 0.05;
			} else {
				bonusRate = 0.02;
			}

			double bonus = salary * bonusRate;

			result[i][0] = salary;
			result[i][1] = bonus;
			result[i][2] = salary + bonus;
		}
		return result;
	}

	public static void main(String[] args) {
		
		//Calling method to generate employee details and computing bonus
		double[][] employees = generateEmployeeData(10);
		double[][] result = calculateBonus(employees);

		System.out.printf( "OldSalary", "Bonus", "NewSalary");

		for (int i = 0; i < result.length; i++) {
			System.out.printf( result[i][0], result[i][1], result[i][2]);
		}

	}
}