package Quiz;

public class Q03_02 {

	public static void main(String[] args) {
//		1～1000までの整数の合計値を求める
		int sum = 0;
		for(int i = 1; i <= 1000; i++) {
			sum += i;
		}
		System.out.println("合計値は:" + sum);

	}

}
