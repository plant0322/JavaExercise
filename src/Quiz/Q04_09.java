package Quiz;

import java.util.Scanner;

public class Q04_09 {

	public static void main(String[] args) {
		String white = "□";
		String black = "■";
		
		System.out.println("表示したいチェック模様の一片の大きさを入力");
		int num = new Scanner(System.in).nextInt();
		for(int i = 1; i <= num; i++) {
			for(int j = 1; j <= num; j++) {
				if(i % 2 == j % 2) {
					System.out.print(white);
				} else {
					System.out.print(black);
				}
			}
			System.out.println();
		}

	}

}
