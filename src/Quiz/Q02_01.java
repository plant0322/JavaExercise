package Quiz;

import java.util.Scanner;

public class Q02_01 {

	public static void main(String[] args) {
		System.out.println("年齢を整数で入力してください");
		int age = new Scanner(System.in).nextInt();
		
		String price = "";
		if(age < 6 || age >= 75) {
			price = "無料";
		} else if(age <= 12) {
			price = "500円";
		} else {
			price = "1000円";
		}
		System.out.println(age + "歳のお客様の入園料は" + price + "です。");

	}

}
