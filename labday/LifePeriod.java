import java.util.Scanner;

public class LifePeriod {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		if(age <= 10 && age >= 1 ) {
			
			System.out.println("childhood");
		}
		else if(age>=11 && age<=16){
			System.out.println("Adolescence");
		}
		else if(age>= 17 && age <= 19){
			System.out.println("Teenager");
		}
		else if(age>=20 && age<=24){
			System.out.println("Young Adult");
		}
		else if(age>= 25 && age <= 35){
			System.out.println("Adult");
		}
		else if(age>=36 && age<=45){
			System.out.println("Middle Age ");
		}
		else if(age>= 46 && age <= 50){
			System.out.println("Late Adult");
		}
		else {
			System.out.println("senior citizen");
		}

	}

}