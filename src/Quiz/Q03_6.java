package Quiz;

public class Q03_6 {

	public static void main(String[] args) {
//		二重ループを使用
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 1; i <= 4; i++) {
			for(int j = 4; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("----------------");
		
//		消していく
		String value = "";
		for(int i = 1; i <= 5; i++) {
			System.out.println(value += "*");
		}
		for(int i = 1; i <= 4; i++) {
			value = value.substring(0, value.length() -1);
			System.out.println(value);
		}
		System.out.println("----------------");
		
		
//		ifで分岐
		int num = 0;
		for(int i = 1; i <= 9; i++) {
			if(i <= 5) {
				num ++;
			} else {
				num --;
			}
			for(int j = 1; j <= num; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
