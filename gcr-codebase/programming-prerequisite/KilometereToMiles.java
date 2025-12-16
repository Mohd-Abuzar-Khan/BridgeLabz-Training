public class KilometereToMiles{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int kilometers = sc.nextInt();
		int miles = kilometers * 0.621371;
		System.out.println(miles);
	}
}