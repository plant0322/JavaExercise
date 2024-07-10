package ex;

public class ex_05 {

	public static void main(String[] args) {
//		int arr[] = {0, 3, 6};
		for(int i = 6; i >= 0; i-=3) {
			for(int a = 3; a >= 1; a--) {
				System.out.print(a + i);
				if(a != 1) {
					System.out.print(",");
				}
			}
			System.out.println();
		}

	}

}
