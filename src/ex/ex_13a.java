package ex;

public class ex_13a {

	public static void main(String[] args) {
		// 3でも7でも割り切れる数字を10個出力
		//while文はtrueの間で繰り返すのであって、最初の値がfalseならそもそも実行されない
		int count = 0;
		int num = 1;
		int sum = 0;
		while(true) {
			if(num % 7 == 0 && num % 3 == 0) {
				System.out.print(num + " ");
				sum += num;
				count ++;
			}
			num ++;
			
			if(count == 10) {
				break;
			}
		}
		System.out.println("\n10個の数字の合計値：" + sum);

	}

}
