import java.util.Scanner;

public class ProductOfAllElements {

	public static void main(String[] args) {
		System.out.println("enter the length of array = ");
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int product = 1;
		
		int arr[] = new int[l];
		for(int i = 0 ; i< arr.length ; i++) {
			System.out.println("enter the element of an array = ");
			arr[i] = sc.nextInt();
			product = product * arr[i];
		}
		
		System.out.println("the product of all elements of array is = " + product);
		
		

	}

}