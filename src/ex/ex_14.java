package ex;

public class ex_14 {

	public static void main(String[] args) {
		//ランダムに数字が格納された配列の中から2番目に大きな数字を表示する
		//数字を入れ替える
		int[] num = {15, 9, 13, 16, 8, 10, 5, 11, 4, 6};
		
//		int[] num_asc = new int[num.length];
		for(int i = 0; i < num.length; i++) {
			for(int j = i + 1; j < num.length; j++) {
				int compare = 0;
				if(num[i] < num[j]) {
					compare = num[i];
					num[i] = num[j];
					num[j] = compare;
				}
//				System.out.println("j:" + num[j]);
//				System.out.println("num_asc i" + num_asc[i]);
//				System.out.println("---------------------------");
			}
			System.out.println(num[i]);
//			System.out.println(num_asc[i]);
		}
		System.out.println("2番目に大きな数字 :" +  num[1]);

	}

}
