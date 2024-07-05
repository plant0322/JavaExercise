package ex;

public class ex_07 {

	public static void main(String[] args) {
		for(int i = 0; i <= 6; i+=3) {
			for(int a = 1; a <= 3; a++) {
				System.out.print(a + i);
				if(a != 3) {
					System.out.print(",");
				} else {
					System.out.print("\n");
				}
			}
		}
		System.out.println("----");
		
		String num = "";
		for(int i = 0; i <= 6; i+=3) {
			for(int a = 1; a <= 3; a++) {
				if(a == 3) {
					num = a + i + "\n";
				} else {
					num = a + i +",";
				}
				System.out.print(num);
			}
		}

	}

}
