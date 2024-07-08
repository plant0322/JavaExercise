package Quiz;

public class Q07_08 {

	public static void main(String[] args) {
		//  マインスイーパのマップ準備プログラム(ユーザーの指定した数値を元にランダムに地雷(*)を配置)
		System.out.println("一片のマスの数を、2以上かつ26以下の整数で入力");
		int square = new java.util.Scanner(System.in).nextInt();
		
		System.out.println("地雷の数を、" + (square * square -1) + "以下の整数で入力");
		int landmine = new java.util.Scanner(System.in).nextInt();
		
		//枠を作る
		String[][] arr = new String[square][square];
		for(int i = 0; i < square; i++) {
			for(int j = 0; j < square; j++) {
				arr[i][j] =	" ";
			}
		}
		
		//地雷を生成
		while(landmine > 0) {
			int x = new java.util.Random().nextInt(square);
			int y = new java.util.Random().nextInt(square);
			if(arr[x][y].equals(" ")) {
				arr[x][y] = "*";
				landmine--;
			}
		}
		
		//表の作成
		char c = 'A';
		System.out.print("   ");
		for(int i = 1; i <= square; i++) {
			System.out.print("  " + c++ + " ");
		}
		System.out.println();
		System.out.print("+--");
		for(int i = 1; i <= square; i++) {
			System.out.print("+---");
		}
		System.out.println("+");

		for(int i = 0; i < square; i++) {
			System.out.print(" " + (i + 1) + " |");
			for(int j = 0; j < square; j++) {
				System.out.print(" " + arr[i][j] + " |");
			}
			System.out.println();
			for(int j = 0; j <= square; j++) {
				System.out.print("---+");
			}
			System.out.println();
		}

	}

}
