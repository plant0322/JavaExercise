package Quiz;

public class Q07_05a {
	public static void main(String[] args) {
		//Q07_5の別パターン
		
		String[] hand = {"ぐー", "ちょき", "ぱー"};
		String[] result = {"あいこ", "あなたの勝ち", "PCの勝ち"};
		
		System.out.println("じゃんけんゲーム");
		System.out.println("あなたの手を数字で選択");
		for(int i = 0; i <= 2; i++) {
			System.out.print("「" + i + ":" + hand[i] + "」");
		}
		
		int your_num = new java.util.Scanner(System.in).nextInt();
		int pc_num = new java.util.Random().nextInt(3);
		
		System.out.println("あなたの手は「" + hand[your_num] + "」PCの手は「" + hand[pc_num] + "」");
		System.out.println(result[(pc_num - your_num + 3) % 3]);
	}

}
