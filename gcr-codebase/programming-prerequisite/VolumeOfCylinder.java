public class VolumeOfCylinder{
	public static void main(String[] args){
		Scanner Scan = new Scanner (System.in);
		final double PI = 3.14;
		int radius = nextInt();
		int height = nextInt();
		int volume = PI * (radius * radius) * height;
		System.out.println(volume);
	
	}
} 