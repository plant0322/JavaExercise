package Quiz;

public class Q001 {

	public static void main(String[] args) {
//		01.forループを使って、配列arrayの内容を実行結果のとおりに表示してください。
		int[] arr = {1, 2, 3, 4, 5};
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("--------");

//		02.forループを使って、配列arrayの各要素の値を２倍にして表示してください。
		int[] arr2 = {1, 2, 3, 4, 5};
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr2[i] * 2);
		}
		
		System.out.println("--------");

//		03.配列aの各値と配列bの各値の合計を、配列cの各要素に代入する プログラムを作成してください。
//		例えば、 配列aの0番目にある1と配列bの0番目にある6を足した7が 配列cの0番目に入ります。
		int[] arr3 = {1, 2, 3, 4, 5};
		int[] arr4 = {6, 7, 8, 9, 10};
		int[] arr5 = new int[5];
				
		for(int i = 0; i < arr5.length; i++) {
			arr5[i] = arr3[i] + arr4[i];
			System.out.println(arr5[i]);
		}
		
		System.out.println("--------");

//		04.配列arrayのもつ二次元配列を、二重ループを使って表示してください。
		int[][] arr6 = {
			{1, 8, 12, 17, 20},
			{2, 5, 11, 13, 18},
			{4, 6, 9, 19, 21}
		};
		for(int i = 0; i < arr6.length; i++) {
			for(int a = 0; a < arr6[i].length; a++) {
				System.out.print(arr6[i][a] + " ");
			}
			System.out.println();
		}
		
		System.out.println("--------");

//		05.1回目は配列の内容を順番に表示します。2回目は得点の多い順に表示します。配列rankの値を上手く使います。
		int[] score = {45, 90, 75, 60, 80};
		int[] rank = {1, 4, 2, 3, 0};
		
		for(int i = 0; i < score.length; i++) {
			System.out.println(i + 1 + "番目: " + score[i] + "点");
		}
		
		System.out.println("--------");
		
		for(int i = 0; i < score.length; i++) {
			System.out.println(i + 1 + "位: " + score[rank[i]] + "点");
		}
	}

}









