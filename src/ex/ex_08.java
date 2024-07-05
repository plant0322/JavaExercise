package ex;

public class ex_08 {

	public static void main(String[] args) {
		String arr[] = new String[3];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = "";
		}
		
		for(int a = 0; a <= 6; a+=3){
			for(int i = 1; i <= arr.length; i++) {
				arr[i - 1] = arr[i - 1] += i + a;
				if(a == 6) {
					continue;
				}
				arr[i - 1] = arr[i - 1] += ",";
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);		
		}
	}

}
