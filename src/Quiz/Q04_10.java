package Quiz;

public class Q04_10 {

	public static void main(String[] args) {
		for(int i = 1; i <= 19; i++) {
			for(int j = 1; j <= 9; j++) {
				if(i % 2 == 1) {
					System.out.print("+--");
					if(j == 9) {
						System.out.print("+");
					}
				} else {
					if(j == 1) {
						System.out.print("|");
					}
					System.out.print((i - i / 2) * j);
					if((i - i / 2) * j <= 9) {
						System.out.print(" ");
					}
					System.out.print("|");
				}
			}
			System.out.println();
		}
		System.out.println();

		//別の書き方
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.print("+----");
			}
			System.out.println("+");
			
			for(int j = 1; j <= 9; j++) {
				int num = i * j;
				System.out.print("| ");
				if(num <= 9) {
					System.out.print(" ");
				}
				System.out.print(num + " ");
			}
			System.out.println("|");
		}
		
		for(int i = 1; i <= 9; i++) {
			System.out.print("+----");
		}
		System.out.println("+");

	}

}
