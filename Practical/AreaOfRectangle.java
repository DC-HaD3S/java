public class AreaOfRectangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter length = ");
		int length = sc.nextInt();
		System.out.println("enter breadth = ");
		int breadth = sc.nextInt();
		Area a = new Area();
		a.calculateArea(length, breadth);
		
		

	}

}



public class Area {

	public void calculateArea(int length , int  breadth) {
		int area = length * breadth ;
		System.out.println("Area of Rectangle is = " + area);
	}

	

}
