package Quiz;

import java.util.Scanner;

public class Q02_05 {

	public static void main(String[] args) {
		System.out.println("西暦年を整数で入力してください");
		int year = new Scanner(System.in).nextInt();
		
		String value = "";
		if(year % 400 == 0) {
			value = "うるう年";
		} else if(year % 100 == 0) {
			value = "平年";
		} else if(year % 4 == 0) {
			value = "うるう年";
		} else {
			value = "平年";
		}
		
		System.out.println(year + "年は、「" + value + "」です");

	}

}
