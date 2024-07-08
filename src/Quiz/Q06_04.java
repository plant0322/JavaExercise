package Quiz;

import java.util.Scanner;

public class Q06_04 {

	public static void main(String[] args) {
		//if文で指定
//		String[] season = {"冬", "春", "夏", "秋"};
//		
//		System.out.println("1～12の範囲で月を入力してください");
//		int month = new Scanner(System.in).nextInt();
//		
//		if(month <= 2 || month ==12) {
//			System.out.println(season[0]);
//		} else if(month <= 5) {
//			System.out.println(season[1]);
//		} else if(month <= 8) {
//			System.out.println(season[2]);
//		} else {
//			System.out.println(season[3]);
//		}
		
		//もっと単純に書く
		String[] season = {"冬", "春", "夏", "秋"};
		
		System.out.println("1～12の範囲で月を入力してください");
		int month = new Scanner(System.in).nextInt();
		
		String result = season[month / 3 % 4];
		System.out.println(month + "月は" + result + "です");

	}

}
