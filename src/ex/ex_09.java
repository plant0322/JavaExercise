package ex;

public class ex_09 {

	public static void main(String[] args) {
		//再確認
		//1～10の中で偶数を表示
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}
		System.out.println("-----");
		
		//3の倍数
		for(int i = 1; i <= 30; i++) {
			if(i % 3 == 0) {
				System.out.println(i);
			}
		}
		System.out.println("-----");
		
		//3の倍数が何個あるかと合計値
		int count = 0;
		int sum = 0;
		
		for(int i = 1; i <= 30; i++) {
			if(i % 3 == 0) {
				count ++;
				sum += i;
			}
		}
		System.out.println(count);
		System.out.println(sum);
		

		System.out.println("-----");
		
		//カンマ区切り
		for(int i = 1; i <= 10; i++) {
			System.out.print(i);
			if(i != 10) {
				System.out.print(",");	
			}
		}

		System.out.println("\n-----");
		
		//配列を作って5ずつ加算
		int[] arr = new int[20];
		arr[0] = 0;
		
		String arr_before = "";
		String arr_after = "";
		for(int i = 1; i < arr.length; i++) {
			arr[i] = arr[i - 1] + 5;
			if(i <= 9 && arr[i] % 2 == 1) {
				arr_before += arr[i] + ",";
			} else if(i >= 10 && arr[i] % 2 == 0){
				arr_after += arr[i] + ",";
			}
		}
		System.out.println(arr_before);
		System.out.println(arr_after);


		System.out.println("\n-----");
		
		//配列を作って表示
		String[] num = new String[3];
	
		for(int j = 7; j >= 1; j-=3) {
			for(int i = 0; i < num.length; i++) {
				if(num[i] == null) {
					num[i] = "";
				}
				num[i] += j + i;
			}

		}
		for(int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		
		System.out.println("\n-----");
		
		//配列を使わないで表示
		for(int i = 6; i >= 0; i-=3) {
			for(int j = 3; j >= 1; j--) {
				System.out.print(j + i);
			}
			System.out.println();
		}

		System.out.println("\n-----");
		
		//メソッドの使用
		String num2 = "";
		for(int i = 1; i <= 10; i++) {
			num2 += i + ",";
		}
		System.out.println(num2.substring(0, num2.length() - 1));

		System.out.println("\n-----");
		
		//素数を出す		
		for(int i = 2; i <= 30; i++) {
			boolean result = true;
			for(int j = 2; j < i; j++) {
				if(i % j == 0) {
					result = false;
					break;
				}
			}
			if(result == true) {
				System.out.print(i + ",");
			}
		}
		System.out.println("\n----------");
		
		//50以下で最も大きな素数
		int num_5 = 500000000;
		
		for(int i = num_5; i >= 2; i--) {
			boolean num_min = true;
			for(int j = 2; j < i; j++) {
				if(i % j == 0) {
					num_min = false;
					break;
				}
			}
			if(num_min == true) {
				System.out.println(i);
				break;
			}
		}
		System.out.println("\n----------");
		
		//50以上で最も小さな素数
		while(true) {
			boolean num_max = true;
			for(int j = 2; j < num_5; j++) {
				if(num_5 % j == 0) {
					num_max = false;
					break;
				}
			}
			if(num_max) {
				System.out.println(num_5);
				break;
			}
			num_5++;
		}
		System.out.println("----");

		//縦に数字を並べる
		String[] num3 = new String[3];
		
		for(int i = 1; i <= 7; i+=3) {
			for(int j = 0; j < num.length; j++) {
				if(num3[j] == null) {
					num3[j] = "";
				}
				num3[j] += i + j;
				if(i != 7) {
					num3[j] += ",";
				}
			}
		}
		for(int i = 0; i < num.length; i++) {
			System.out.println(num3[i]);
		}
		
	}

}
