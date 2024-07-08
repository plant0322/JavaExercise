package Quiz;

public class Q06_01 {

	public static void main(String[] args) {
		//おみくじ
		String[] result = {"大吉", "中吉", "凶"};
		int rand = new java.util.Random().nextInt(3);
		System.out.println(result[rand]);

	}

}
