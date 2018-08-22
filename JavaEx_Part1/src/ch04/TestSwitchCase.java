package ch04;

/*
 * Switch - case應用與示範
 * JDK 7以後switch - case也可進行字串比對
 */
public class TestSwitchCase {

	public static void main(String[] args) {
		String n = "A"; // 10 20 30

		switch (n) {
		case "S":
			System.out.println("n 的值是 10");
			break;
		case "A":
			System.out.println("n 的值是 20");
			break;
		default:
			System.out.println("n 的值不是 10 也不是 20");
		}

		System.out.println("我仍有執行到!");
	}

}
