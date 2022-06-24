public class Armstrong {
	public static void main(String[] args) {

		int num = 371, originalNumber, rem, result = 0;

		originalNumber = num;

		while (originalNumber != 0) {
			rem = originalNumber % 10;
			result += Math.pow(rem, 3);
			originalNumber /= 10;
		}

		if (result == num)
			System.out.println(num + " is an Armstrong number.");
		else
			System.out.println(num + " is not an Armstrong number.");
	}