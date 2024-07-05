
package ex;

public class ex_06 {

	public static void main(String[] args) {
		String[] arr = new String[3];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = "";			
		}
		for(int i = 0; i <= 6; i+=3) {
			for(int a = 1; a <= arr.length; a++) {
				arr[a - 1] = arr[a - 1] += a + i;
				if(i != 6) {
					arr[a - 1] += ",";
				}
			}
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
}










