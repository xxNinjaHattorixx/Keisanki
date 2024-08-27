import java.util.Scanner;

public class Keisanki {

	public static void main(String[] args) {

		
		Scanner scanner = new Scanner(System.in);
		
		// 計算モードの選択
		System.out.println("どの計算を行いますか？");
		System.out.println("1：三角形の面積");
		System.out.println("2：四角形の面積");
		System.out.println("3：円の面積");
		
		// 実装したいもの
		// 年齢計算機（西暦・和暦）
		// 日にち逆算
		
		int mode = scanner.nextInt();
		
		switch(mode) {
		case 1:
			Logic.triangleArea(scanner);
			break;
			
		case 2:
			Logic.squareArea(scanner);
			break;
			
		case 3:
			Logic.circleArea(scanner);
			break;
		
		default:
			System.out.println("エラー！1～3の中から入力してください！");
		}
		
		scanner.close();
	}

}
