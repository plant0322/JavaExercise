package Quiz;

import java.util.Scanner;

public class Q04_07 {

	public static void main(String[] args) {
		String white = "□";
		String black = "■";
		
		System.out.println("表示したいヨコ縞模様の一片の大きさを入力してください。");
		int num = new Scanner(System.in).nextInt();
		
		for(int i = 1; i <= num; i++) {
			for(int j = 1; j <= num; j++){
				if(i % 2 == 1) {
					System.out.print(black);
				} else {
					System.out.print(white);
				}
			}
			System.out.println();
		}
		System.out.println("-------");
		
//		別の書き方(変数使う？)
		String result = "";
		for(int i = 1; i <= num; i++) {
			if(i % 2 == 1) {
				result = black;
			} else {
				result = white;
			}
			for(int j = 1; j <= num; j++) {
				System.out.print(result);
			}
			System.out.println();
		}
		

	}

}
