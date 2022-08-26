package java1;

interface LibraryU {
	public void registeraccount();

	public void requestbook();
}

class Kidsuser implements LibraryU {
	int age;
	String booktype;

	public void registeraccount(int age) {
		if (age < 12) {
			System.out.println("You have successfully registered under a Kids Account");
		} else {
			System.out.println("Sorry, Age must be less than 12 to register as a kid");
		}
	}

	public void requestbook(String booktype) {
		if (booktype == ("kids")) {
			System.out.println("Book Issued successfully, please return the book within 10 days");
		} else {
			System.out.println("Oops, you are alowed to take only kids books");
		}
	}

	@Override
	public void registeraccount() {
		// TODO Auto-generated method stub

	}

	@Override
	public void requestbook() {
		// TODO Auto-generated method stub

	}
}

class AdultUser implements LibraryU {
	int age;
	String booktype;

	public void registeraccount(int age) {
		if (age > 12) {
			System.out.println("You have successfully registered under an Adult Account");
		} else {
			System.out.println("Sorry, Age must be greater than 12 to register as an adult");
		}
	}

	public void requestbook(String booktype) {
		if (booktype == ("fiction")) {
			System.out.println("Book Issued successfully, please return the book within 7 days");
		} else {
			System.out.println("Oops, you are allowed to take only adult Fiction books");
		}
	}

	@Override
	public void registeraccount() {
		// TODO Auto-generated method stub

	}

	@Override
	public void requestbook() {
		// TODO Auto-generated method stub

	}

}