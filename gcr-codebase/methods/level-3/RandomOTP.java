//Crating a class RandomOTP to generate 6 digit otp number
public class RandomOTP {
	
	//Method to generate 6 digit otp
	public static int generateOTP() {
		return 100000 + (int)(Math.random() * 900000);
	}
	
	//Method to check generated opt is unique
	public static boolean isUnique(int[] otp) {
		for (int i = 0; i < otp.length; i++) {
			for (int j = i + 1; j < otp.length; j++) {
				if (otp[i] == otp[j]) return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		//Creating a array to store 10 different OTPs
		int[] otpArray = new int[10];
		
		//Dispalying all OTPs
		for (int i = 0; i < 10; i++) {
			otpArray[i] = generateOTP();
			System.out.println("OTP " + (i + 1) + ": " + otpArray[i]);
		}

		//Validating all OTP are unique
		System.out.println("All OTPs Unique: " + isUnique(otpArray));
	}
}