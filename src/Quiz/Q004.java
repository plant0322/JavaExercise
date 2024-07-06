package Quiz;

import java.util.Scanner;

public class Q004 {

	public static void main(String[] args) {
		System.out.println("9999兆までの数値を入力してください");
		long num = new Scanner(System.in).nextLong();
		
		long cho = num / 1000000000000l;
		num %= 1000000000000l;
		long oku = num / 100000000l;
		num %= 100000000l;
		long man = num / 10000l;
		num %= 10000l;
		System.out.println(cho + "兆" + oku + "億" + man + "万" + num + "円");

	}

}
