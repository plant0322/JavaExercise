package Quiz;

public class Q07_05 {

	public static void main(String[] args) {
		//じゃんけんゲーム
		System.out.println("じゃんけんゲームを始めます");
		System.out.println("あなたの手を数字で選択「0：ぐー」「1：ちょき」「2：ぱー」");
		
		String[] hand = {"ぐー", "ちょき", "ぱー"};
		int your_num = new java.util.Scanner(System.in).nextInt();
		int pc_num = new java.util.Random().nextInt(3);
		
		String your_hand = hand[your_num];
		String pc_hand = hand[pc_num];
		
		System.out.println("あなたの手は「" + your_hand + "」、PCの手は「" + pc_hand + "」");
		String win = "";
		switch(your_num - pc_num){
		case -1:
		case 2:
			System.out.println("あなたの勝ち");
			break;
		case -2:
		case 1:
			System.out.println("PCの勝ち");
			break;
		case 0:
			System.out.println("あいこ");
		}

	}

}
