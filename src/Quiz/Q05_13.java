package Quiz;

public class Q05_13 {

	public static void main(String[] args) {
		//先に2勝した方が勝ちになるじゃんけんゲーム
		System.out.println("じゃんけんゲームを始めます");
		System.out.println("先に2勝した方の勝ちです");
		
		//回数countの初期設定を1にしてforの中身の最後にcount数を指定して繰り返す
		int count = 1;
		int your_win = 0;
		int pc_win = 0;
		int draw = 0;
		for(int i = 1; i == count; i++) {
			System.out.println("第" + count + "回戦：あなたの手を数字で選んでください");
			System.out.println("「0：ぐー」「1：ちょき」「2：ぱー」");
			int your_num = new java.util.Scanner(System.in).nextInt();
			int pc_num = new java.util.Random().nextInt(2);
			
			String your_hand = "";
			if(your_num == 0) {
				your_hand = "ぐー";
			} else if(your_num == 1) {
				your_hand = "ちょき";
			} else if(your_num == 2) {
				your_hand = "ぱー";
			}
			
			String pc_hand = "";
			if(pc_num == 0) {
				pc_hand = "ぐー";
			} else if(pc_num == 1) {
				pc_hand = "ちょき";
			} else if(pc_num == 2) {
				pc_hand = "ぱー";
			}
			System.out.println("あなたの手は「" + your_hand + "」、PCの手は「" + pc_hand + "」。");
			switch(your_num - pc_num) {
			case -1:
			case 2:
				your_win ++;
				System.out.println("あなたの勝ち");
				break;
			case -2:
			case 1:
				pc_win ++;
				System.out.println("PCの勝ち");
				break;
			case 0:
				draw ++;
				System.out.println("あいこ");
				break;
			}
			System.out.println("あなた：" + your_win + "勝、PC：" + pc_win + "勝、あいこ：" + draw + "回");
			
			if(your_win == 2 || pc_win ==2) {
				count = i;
			} else {
				count ++;
			}
		}
		String winer = "";
		if(your_win > pc_win) {
			winer = "あなた";
		} else {
			winer = "PC";
		}
		System.out.println("終了！優勝者は" + winer + "です");

	}

}
