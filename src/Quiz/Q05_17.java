package Quiz;

public class Q05_17 {

	public static void main(String[] args) {
		//30以下の素数を表示
		for(int i = 2; i <= 30; i++) {
			boolean result = true;
			for(int j = 2; j < i; j++) {
				if(i % j == 0) {
					result = false;
					//breakなくてもいけた
					break;
				}
			}
			//(result)だけでもいけた
			if(result == true) {
				System.out.print(i + " ");				
			}
		}

	}

}
