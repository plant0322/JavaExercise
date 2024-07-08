package Quiz;

public class Q07_07 {

	public static void main(String[] args) {
		//前後左右を反転させて、講師席から見てわかりやすい座席表を出力
	    String[][] positionAry = { //
    	      { "佐藤", "鈴木", "高橋", "田中" }, //
    	      { "伊藤", "渡辺", "山本", "中村" }, //
    	      { "小林", "加藤", "吉田", "山田" }, //
    	      { "山口", "松本", "井上", "木村" }, //
    	    };
	    System.out.println(" 講師席");
	    for (int i = 0; i < positionAry.length; i++) {
		    for (int j = 0; j < positionAry[i].length; j++) {
		    System.out.print(positionAry[i][j] + " ");
		    }
		    System.out.println();
	    }
		System.out.println("--------------------");
		
		
		for(int i = positionAry.length - 1; i >= 0; i--) {
			for(int j = positionAry[i].length - 1; j >= 0; j--) {
				System.out.print(positionAry[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("講師席");

	}

}
