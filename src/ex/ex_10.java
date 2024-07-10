package ex;

public class ex_10 {

	public static void main(String[] args) {
		//平均値を出す
		int[] scores = {61,23,76,55,98,91,55,44,33,64,68,69};
		int sum = 0;
		for(int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		System.out.println(sum / scores.length);
		
		//九九表を出す
		int[][] kuku = new int[9][9];
		
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 9; j++) {
				kuku[i][j] = (i + 1) * (j + 1);
				if(kuku[i][j] < 10) {
					System.out.print(" ");
				}
				System.out.print(kuku[i][j] + " ");
			}
			System.out.println();
		}

	}

}
