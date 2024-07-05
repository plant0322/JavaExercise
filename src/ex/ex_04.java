package ex;

public class ex_04 {

	public static void main(String[] args) {
		// 要素数20の配列を宣言し、要素に0から5ずつ加算して代入させる。[0]~[10]の値の奇数のみカンマ区切りで、[11]~[19]の値は偶数をカンマ区切りで表示させる
		int arr[] = new int[20];
		arr[0] = 0;
		
		for(int i = 1; i < arr.length; i++) {
			arr[i] = arr[i -1] + 5;
		}
		
		String arr_before = "";
		String arr_after = "";
		
		for(int i = 0; i < arr.length; i++) {
			if(i < 11 && i % 2 == 1) {
				arr_before += arr[i] + ",";
				arr_after += arr[i] + ",";
			}
		}
		
		if(!arr_before.isEmpty()) {
			arr_before = arr_before.substring(0, arr_before.length() - 1);
		}
		
		if(!arr_after.isEmpty()) {
			arr_after = arr_after.substring(0, arr_after.length() - 1);
		}
		
		System.out.println(arr_before);
		System.out.println(arr_after);

	}

}
