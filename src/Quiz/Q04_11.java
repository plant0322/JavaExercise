package Quiz;

public class Q04_11 {

	public static void main(String[] args) {
		System.out.println("0=0");
		int sum = 0;
		String num = "";
		for(int i = 1; i <= 10; i++) {
			sum = sum += i;
			num = num += i + "+";
			System.out.println("0+" + num + "=" + sum);
		}
		System.out.println("-------------");
		
		//=が+=になってたので別の書き方(0も計算式に入れる)
		for(int i = 0; i <= 10; i++) {
			int total = 0;
			//jをi回数だけ繰り返す
			for(int j = 0; j <= i; j++) {
				System.out.print(j);
				if(i != j) {
					System.out.print("+");
				}
				total += j;
			}
			System.out.println("=" + total);
			
		}
		System.out.println("-------------");
		
		//=が+=になってたので別の書き方(計算式をStringにして1個ずつ足してく)
		String count = "";
		int amount = 0;
		
		for(int i = 0; i <= 10; i++) {
			if(i != 0) {
				count += "+";
			}
			count += i;
			amount += i;
			System.out.println(count + " = " + amount);
		}
		System.out.println("-------------");
		
		//順番を変えるとif文で分岐しなくてよくなる
		String count_2 = "0";
		int amount_2 = 0;
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(count_2 + "=" + amount_2);
			count_2 += "+" + i;
			amount_2 += i;
		}
		

	}

}
