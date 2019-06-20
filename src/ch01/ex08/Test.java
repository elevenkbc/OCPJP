package ch01.ex08;


class User {
	private String firstName;
	private String lastName;
	private static int count;

	public User(String first, String last) {
		firstName = first;
		lastName = last;
		++count;
	}

	static {
		count = 0;
	}

	public static int getCount() {
		return count;
	}
}

public class Test {
	public static void main(String[] args) {
		User u1 = new User("Jim", "Tzeng");
		User u2 = new User("Duke", "Java");
		User u3 = new User("Edwin", "Chung");
		User u4 = new User("Sonic", "Huang");

		u4 = null;
		u3 = u2;
		System.out.println(User.getCount());
	}

}
