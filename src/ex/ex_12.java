package ex;

public class ex_12 {

	public static void main(String[] args) {
		//1〜10までの数字のうち偶数のみを昇順で表示させる
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println("\n-------------");
		
		//1〜10までに偶数が何個あるか、また偶数の合計は幾つになるか表示させる
		int sum = 0;
		int count = 0;
		
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 0) {
				sum += i;
				count ++;
			}
		}
		System.out.println(sum);
		System.out.println(count);
		
		System.out.println("\n-------------");
		
		//1〜10までの整数をカンマ区切りで横並びで表示させる
		for(int i = 1; i <= 10; i++) {
			System.out.print(i);
			if(i != 10) {
				System.out.print(",");
			}
		}

		System.out.println("\n-------------");
		
		//要素数20の配列を宣言し、要素に0から5ずつ加算して代入させる。
		int[] arr = new int[20];
		arr[0] = 0;
		
		String arr_before = "";
		String arr_after = "";
		for(int i = 1; i < arr.length; i++) {
			arr[i] = arr[i - 1] + 5;
			if(arr[i] % 2 == 0 && i < 11) {
				arr_before += arr[i] + ",";
			} else if(arr[i] % 2 == 1 && i > 10) {
				arr_after += arr[i] + ",";
			}
		}
		System.out.println(arr_before.substring(0, arr_before.length() - 1));
		System.out.println(arr_after.substring(0, arr_before.length() - 1));

		System.out.println("\n-------------");
		
		//3*3で数字を並べる
		for(int i = 0; i <= 6; i+=3) {
			for(int j = 1; j <= 3; j++) {
				System.out.print(i + j);
				if(j != 3) {
					System.out.print(",");
				}
			}
			System.out.println();
		}
		System.out.println("------------");

		//3*3で数字を並べる
		String[] arr3 = new String[3];
		for(int i = 1; i <= 7; i+=3) {
			for(int j = 0; j < arr3.length; j++) {
				if(arr3[j] == null) {
					arr3[j] = "";
				}
				arr3[j] += (i + j);
				if(i != 7) {
					arr3[j] += ",";
				}
			}
		}
		for(int i = 0; i < 3; i++) {
			System.out.println(arr3[i]);
		}
		System.out.println("------------");

		//50までの平方根を求める
		int heiho = 50;
		for(int i = 1; i*i <= heiho; i++) {
			System.out.print(i + " ");
		}

	}

}
