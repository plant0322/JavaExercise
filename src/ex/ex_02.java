package ex;

public class ex_02 {

	public static void main(String[] args) {
		// 1〜10までに偶数が何個あるか、また偶数の合計は幾つになるか表示させる
		int count = 0;
		int sum = 0;
		
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 1) {
				count ++;
				sum += i;
			}
		}
		System.out.println("個数：" + count);
		System.out.println("合計：" + sum);

	}

}
