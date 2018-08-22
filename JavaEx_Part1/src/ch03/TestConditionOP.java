package ch03;
/*
 * 此範例為條件運算子測試
 * 可自行更換變數的值以比較不同結果
 */
public class TestConditionOP {

	public static void main(String[] args) {
		int num1 = 3, num2 = 4;
		System.out.println(num1 > num2 && num1 != num2); //當運算左邊並已知結果，右邊便不再運算
		System.out.println(num1 > num2 || num1 != num2); //1
		System.out.println(!(num1 > num2)); //1
	}

}
