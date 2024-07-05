package ex;

public class ex_01 {

	public static void main(String[] args) {
		// 1〜10までの数字のうち偶数のみを昇順で表示させる
		for(int i = 10; i > 1; i--) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}

	}

}
