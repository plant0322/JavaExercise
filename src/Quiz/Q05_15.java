package Quiz;

public class Q05_15 {

	public static void main(String[] args) {
		//booleanを使用
//		System.out.println("素数判定したい整数を入力");
//		int num = new java.util.Scanner(System.in).nextInt();
//		
//		boolean result = false;
//		for(int i = 2; i <= num; i++) {
//			if(num % i == 0 && num != i) {
//				result = true;
//			}
//		}
//		System.out.print(num + "は");
//		if(result == false) {
//			System.out.println("素数です");
//		} else {
//			System.out.println("素数ではありません");
//		}
		
		//booleanを使わない
		System.out.println("素数判定したい整数を入力");
		int num = new java.util.Scanner(System.in).nextInt();
		
		String result = "素数です";
		for(int i = 2; i <= num; i++) {
			if(num % i == 0 && num != i) {
				result = "素数ではありません";
			}
		}
		System.out.println(num + "は" + result);

	}

}
