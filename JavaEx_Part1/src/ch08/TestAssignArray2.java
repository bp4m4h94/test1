package ch08;

public class TestAssignArray2 {

	static void passReference(int[] intArra) {
		for (int i = 0; i < intArra.length; i++)
			intArra[i] = 0;
	}

	public static void main(String[] args) {
		int[] iArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println(iArray);
		passReference(iArray);
//		for (int i = 0; i < iArray.length; i++)
//			System.out.println(iArray);
	}

}
