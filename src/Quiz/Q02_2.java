package Quiz;

import java.util.Scanner;

public class Q02_2 {

	public static void main(String[] args) {
		System.out.println("1～12の範囲で入力してください。");
		int month = new Scanner(System.in).nextInt();
		
		String season = "";
		if(month <= 2 || month == 12) {
			season = "冬";
		} else if(month <= 5) {
			season = "春";
		} else if(month <= 8) {
			season = "夏";
		} else {
			season = "秋";
		}
		System.out.println("日本の" + month + "月は、" + season + "です。");

	}

}
