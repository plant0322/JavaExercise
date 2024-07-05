package ex;

public class ex_03 {

	public static void main(String[] args) {
		// 1〜10までの整数をカンマ区切りで横並びで表示させる(10にはカンマをつけない)
		String num = "";
		for(int i = 1; i <= 10; i++) {
			num += i + ",";
		}
		
		if(!num.isEmpty()) {
			num = num.substring(0, num.length() - 1);
		}
		
		System.out.println(num);

	}

}
