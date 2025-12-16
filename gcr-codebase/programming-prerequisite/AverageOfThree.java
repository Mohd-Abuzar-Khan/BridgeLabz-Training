public class AverageOfThree{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int Number1 = sc.nextInt();
		int Number2 = sc.nextInt();
		int Number3 = sc.nextInt();
		int average = (Number1 + Number2 + Number3)/3;
		System.out.println(average);
	}
}