package java1;

public class LibraryUse {
	public static void main(String[] args) {
		Kidsuser k = new Kidsuser();
		k.registeraccount(10);
		k.registeraccount(18);

		k.requestbook("kids");
		k.requestbook("fiction");
		System.out.println();

		AdultUser a = new AdultUser();
		a.registeraccount(5);
		a.registeraccount(23);

		a.requestbook("kids");
		a.requestbook("fiction");

	}

}