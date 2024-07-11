package ex;

public class ex_11 {

	public static void main(String[] args) {
		
		//1.10までの数値を2倍にして表示
		int[] arr1 = new int[10];
		for(int i = 0; i < arr1.length; i++) {
			arr1[i] = (i + 1) * 2;
			System.out.print(arr1[i] + " ");
		}
		System.out.println("\n----------");

		//2.10までの数値を逆順で表示
		int[] arr2 = new int[10];
		for(int i = arr2.length - 1 ; i > 0; i--) {
//			System.out.println(i);
			arr2[i] = i;
			System.out.print(arr2[i] + " ");
		}
		System.out.println("\n---------");

		//3.5億以下の数でもっとも大きな素数
		int num5 = 500000000;
		
		for(int i = num5; i >= 2; i--) {
			boolean num_max = true;
			for(int j = 2; j < i; j++) {
				if(i % j == 0) {
					num_max = false;
					break;
				}
			}
			if(num_max == true) {
				System.out.println(i);
				break;
			}
		}
		System.out.println("--------");
		
		//4.5億以上の数でもっとも小さな素数
		while(true) {
			boolean num_min = true;
			for(int i = 2; i < num5; i++) {
				if(num5 % i == 0) {
					num_min = false;
					break;
				}
			}
			if(num_min) {
				System.out.println(num5);
				break;
			}
			num5++;
		}
		System.out.println("--------");
		
		//5.季節を表示
		String[] seasons = {"冬", "春", "夏", "秋" };
		int month = new java.util.Scanner(System.in).nextInt();
		
		System.out.println(seasons[month / 3 % 4]);
		
		

	}

}
