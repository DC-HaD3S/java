import java.util.Scanner;

public class OddAndEvenFromArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows = ");
		int rows = sc.nextInt();
		System.out.print("Enter number of collums = ");
		int col = sc.nextInt();
		
		int arr[][] = new int[rows][col];
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0 ; j < arr[i].length ; j++) {
				System.out.print("enter value for "+(i + 1)+ "st row and "+ (j+1) + "st coloumn  = ");
				arr[i][j] = sc.nextInt();
				
			}
		}
			for(int i = 0 ; i < arr.length ; i++) {
				for(int j = 0 ; j < arr[i].length ; j++) {
					if(arr[i][j] % 2 == 0) {
						System.out.println(arr[i][j]+ " is even");
					}
					else {
						System.out.println(arr[i][j]+ " is odd");
					}
				}}
			
			
		}
		
		
		
	

	}