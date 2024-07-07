package Quiz;

import java.util.Scanner;

public class Q03_01 {

	public static void main(String[] args) {
		
//		int num = 0;
//		while(true) {
//			System.out.println("採点結果を数値で入力してください");
//			num = new Scanner(System.in).nextInt();
//			
//			if(num >= 80) {
//				System.out.println("合格です");
//				break;
//			}
//		}
		int num = 0;
		while(num < 80) {
			System.out.println("採点結果を数値で入力してください");
			num = new Scanner(System.in).nextInt();
		}
		System.out.println("合格です");

	}

}
