package Quiz;

import java.util.Scanner;

public class Q002 {
	public static void main(String[] args) {
		int adult_price = 1000;
		int child_price = 500;
		
		System.out.println("いらっしゃいませ、お名前を入力してください。");
		String name = new Scanner(System.in).next();
//		Scanner scan = new Scanner(System.in);
//		String name = scan.next();
		
		System.out.println("大人の人数を入力してください");
		int adult_num = new Scanner(System.in).nextInt();
		
		System.out.println("子どもの人数を入力してください");
		int child_num = new Scanner(System.in).nextInt();
		
		int sum = adult_price * adult_num + child_price * child_num;
		System.out.println(name + "様、合計料金は" + sum + "円です。");
	}
}