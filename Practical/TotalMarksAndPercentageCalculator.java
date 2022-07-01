import java.util.Scanner;

public class TotalMarksAndPercentageCalculator {

	public static void main(String[] args) {
		
		
		totalmarksandpercentagecalculator();
	
		ArrayExplaination.copyArray();
		

	}
	public static void totalmarksandpercentagecalculator() {
	int Total = 0;
	int Per = 0;
	try (Scanner sc = new Scanner(System.in)) {
		System.out.print("Enter number of Subjects = ");
		int subjects = sc.nextInt();
		int arr[] = new int[subjects];
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.print("enter marks of subjects "+ (i +1) +" = ");
			int marks = sc.nextInt();
			arr[i] = marks;
			Total = Total + arr[i];
		}
		Per = Total/subjects;
	}
	
	System.out.println("total number of marks is = "+ Total);
	System.out.println("Percentage = "+ Per +"%");

}
}
