package Quiz;

import java.util.Scanner;

public class Q04_08 {

	public static void main(String[] args) {
		String white = "□";
		String black = "■";
		
		System.out.println("表示したいタテ縞模様の一片の大きさを入力");
		int num = new Scanner(System.in).nextInt();
		
		for(int i = 1; i <= num; i++) {
			for(int j = 1; j <= num; j++) {
				if(j % 2 == 1) {
					System.out.print(black);
				} else {
					System.out.print(white);
				}
			}
			System.out.println();
		}

	}

}
