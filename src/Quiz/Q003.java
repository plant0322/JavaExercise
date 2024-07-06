package Quiz;

import java.util.Scanner;

public class Q003 {

	public static void main(String[] args) {
		System.out.println("金額を整数で入力してください");
		int price = new Scanner(System.in).nextInt();
		
		System.out.println("消費税率のパーセント値を整数で入力してください");
		int tax = new Scanner(System.in).nextInt();
		
		int total = price * (tax + 100) / 100;
		System.out.println("税込金額は、" + total + "円です");

	}

}
