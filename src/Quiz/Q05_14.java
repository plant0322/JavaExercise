package Quiz;

import java.util.Scanner;

public class Q05_14 {

	public static void main(String[] args) {
		//平均点を計算
		System.out.println("生徒の人数を整数で入力");
		int people = new Scanner(System.in).nextInt();
		
		double total = 0;
		int max = 0;
		int min = 0;
		for(int i = 1; i <= people; i++) {
			System.out.println(i + "番目の生徒の点数を入力");
			int score = new Scanner(System.in).nextInt();
			total += score;
			if(i == 0) {
				max = score;
				min = score;
			} else if(max < score) {
				max = score;
			} else if(min > score) {
				min =score;
			}
		}
		System.out.println(people + "人の生徒の平均点は、" + total / people + "点です。");
		System.out.println("最高点は、" + max + "点です。");
		System.out.println("最低点は、" + min + "点です。");

	}

}
