import java.util.Scanner;

public class SearchAElementInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the particular element you want to search ? ");
		int rows = sc.nextInt();
		int arr[] = new int[3];
		arr[0] = 21;
		arr[1] = 1;
		arr[2] = 121;
		
		
		for(int i = 0 ; i< arr.length ; i++) {
			if(arr[i] == rows) {
				System.out.println(arr[i]+" is present in the array");
				break;
			}
		}
		System.out.println(rows +" is not present in the Array");
		
	}

}