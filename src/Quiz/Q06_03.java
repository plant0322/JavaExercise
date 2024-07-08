package Quiz;

import java.util.Scanner;

public class Q06_03 {

	public static void main(String[] args) {
		String[] str = {"black","white","red","blue","green","yellow"};
		System.out.println("配列の中に存在するか調べる文字列を入力");
		
		String value = new Scanner(System.in).next();
		String result = "存在していません";
		for(int i = 0; i < str.length; i++) {
			if(str[i].equals(value)) {
				result = "存在しています";
				break;
			}
		}
		System.out.println(value + "は、配列の中に" + result);

	}

}
