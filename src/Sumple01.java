import java.util.Scanner;

public class Sumple01 {

	public static void main(String[] args) {

		
		Scanner scanner = new Scanner(System.in);
		
		// 計算モードの選択
		System.out.println("どの計算を行いますか？");
		System.out.println("1：三角形の面積");
		System.out.println("2：四角形の面積");
		System.out.println("3：円の面積");
		int mode = scanner.nextInt();
		
		switch(mode) {
		case 1:
			Logic.sankaku(scanner);
			break;
			
		case 2:
			Logic.shikaku(scanner);
			break;
			
		case 3:
			Logic.maru(scanner);
			break;
		
		default:
			System.out.println("エラー！1～3の中から入力してください！");
		}
		
		scanner.close();
	}

}
