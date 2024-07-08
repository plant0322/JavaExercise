package Quiz;

public class Q07_06 {

	public static void main(String[] args) {
		//「国語」、「数学」、「英語」の三科目の試験結果集計
		String[] subject = {"国語", "数学", "英語"};
		
		System.out.println("生徒の人数を整数で入力");
		int num = new java.util.Scanner(System.in).nextInt();

		int[][] score = new int[num][subject.length];
		
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < subject.length; j++) {
				System.out.println(i + 1 + "番目の生徒の" + subject[j] + "の点数を入力");
				int scan = new java.util.Scanner(System.in).nextInt();
				score[i][j] = scan;
			}
		}
		System.out.println("-----");
		
		//結果
		System.out.println("成績一覧表　国語　数学　英語");
		for(int i = 0; i < num; i++) {
			System.out.println(i + 1 + "人目 " + score[i][0] + " " + score[i][1] + " " + score[i][2]);			
		}
		
		while(true) {
			System.out.println("表示したい内容を数値で入力");
			System.out.println("1.生徒ごとの合計点");
			System.out.println("2.科目ごとの平均点");
			System.out.println("プログラム終了は0を入力");
			
			int process = new java.util.Scanner(System.in).nextInt();
			
			if(process == 1) {
				for(int i = 0; i < num; i++) {
					System.out.println(i + "番目の生徒の合計点は" + (score[i][0] + score[i][1] + score[i][2]) + "点です");
				}
			} else if(process == 2) {
				for(int i = 0; i < subject.length; i++) {
					int total = 0;
					for(int j = 0; j < num; j++) {
						total += score[j][i];
					}
					System.out.println(subject[i] + "の平均点は" + total /subject.length + "点です。");
				}
			} else if(process == 0) {
				System.out.println("終了");
				break;
			}
		}

	}

}
