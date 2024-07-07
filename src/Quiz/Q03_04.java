package Quiz;

public class Q03_04 {

	public static void main(String[] args) {
//		階段状に*を出力
		String value = "";
		for(int i = 1; i <= 5; i++) {
			System.out.println(value += "*");
		}
		System.out.println("------------");
		
//		二重ループを使用して出力
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
