package Quiz;

public class Q05_16 {

	public static void main(String[] args) {
		//5億以下で最も大きな素数
		int num_1 = 500000000;
		for(int i = num_1; i >= 2; i--) {
			boolean max = true;
			for(int j = 2; j < i; j++) {
				if(i % j == 0) {
					max = false;
					break;
				}
			}
			if(max == true) {
				System.out.println("5億以下で最も大きな素数は" + i);
				break;
			}
		}
		
		//5億以上で最も小さな素数
		int num_2 = 500000000;
		for(int i = 500000000; i <= num_2; i++) {
			boolean min = true;
			for(int j = 2; j < i; j++) {
				if(i % j == 0) {
					min = false;
					num_2 ++;
					break;
				}
			}
			if(min == true) {
				System.out.println("5億以上で最も小さな素数は" + i);
			}
		}

	}

}
