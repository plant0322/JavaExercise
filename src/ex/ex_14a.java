package ex;

import java.util.Arrays;

public class ex_14a {

	public static void main(String[] args) {
		//ランダムに数字が格納された配列の中から2番目に小さな数字を表示する
		//数字を入れ替える
		int[] num = {15, 9, 13, 16, 8, 10, 5, 11, 4, 6};
		
		Arrays.sort(num);
		for(int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		System.out.println("2番目に小さな数字 :" +  num[1]);

	}

}
