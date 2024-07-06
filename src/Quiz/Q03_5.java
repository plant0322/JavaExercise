package Quiz;

public class Q03_5 {

	public static void main(String[] args) {
//		九九の表を出力
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.print(i * j + "\t");
			}
			System.out.println();
		}

	}

}
