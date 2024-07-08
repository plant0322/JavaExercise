package Quiz;

import java.util.Scanner;

public class Q06_02 {

	public static void main(String[] args) {
		//西暦を入力して干支を表示
//		String[] value = {"子", "丑", "寅", "卯", "辰", "巳", "午", "未", "申", "酉", "戌", "亥"};
//		System.out.println("干支を知りたい年を、西暦で入力");
//		int year = new Scanner(System.in).nextInt();
//		
//		String result = "";
//		for(int i = 1; i <= year; i++) {
//			if(year % 12 + 8 < 12) {
//				result = value[year % 12 + 8];				
//			} else {
//				result = value[year % 12 + 8 - 12];
//			}
//		}
//		System.out.println("西暦" + year + "年は" + result + "年です");
		
		//yearに8足して12で割るだけで出せる
		String[] value = {"子", "丑", "寅", "卯", "辰", "巳", "午", "未", "申", "酉", "戌", "亥"};
		System.out.println("干支を知りたい年を、西暦で入力");
		int year = new Scanner(System.in).nextInt();
		
//		String result = year + 8 %
		System.out.println(value[(year + 8) % value.length] + "年");
		

	}

}
