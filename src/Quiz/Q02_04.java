package Quiz;

import java.util.Random;
import java.util.Scanner;

public class Q02_04 {

	public static void main(String[] args) {
		System.out.println("じゃんけんゲームスタート\nあなたの手を数字で選んでください「0：ぐー」「1：ちょき」「2：ぱー」");
		int you = new Scanner(System.in).nextInt();
		int pc = new Random().nextInt(2);
		
		String your_hand = "";
		if(you == 0) {
			your_hand = "ぐー";
		} else if(you == 1) {
			your_hand = "ちょき";
		} else if(you == 2) {
			your_hand = "ぱー";
		}
		
		String pc_hand = "";
		if(pc == 0) {
			pc_hand = "ぐー";
		} else if(pc == 1) {
			pc_hand = "ちょき";
		} else if(pc == 2) {
			pc_hand = "ぱー";
		}
		
		System.out.println("あなたの手は「" + your_hand + "」、PCの手は「" + pc_hand + "」。");
		
		String result = "";
		switch(you - pc) {
		case 0:
			result = "あいこ";
			break;
		case 2:
		case -1:
			result = "あなたの勝ち";
			break;
		case 1:
		case -2:
			result = "PCの勝ち";
		}
		
//		String result = "";
//		if(pc == 0 && you == 2 || pc == 1 && you == 0 || pc == 3 && you == 1) {
//			result = "あなたの勝ち";
//		} else if(pc == you) {
//			result = "あいこ";
//		} else {
//			result = "PCの勝ち";
//		}
		System.out.println(result + "です。");
		

	}

}
