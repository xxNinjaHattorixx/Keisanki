import java.util.Scanner;

public class Sumple01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// 面積計算に使う変数達
		int a;
		int b;
		int c;
		int mode;
		
		// 計算モードの選択
		System.out.println("どの計算を行いますか？");
		System.out.println("1：三角形の面積");
		System.out.println("2：四角形の面積");
		System.out.println("3：円の面積");
		mode = scanner.nextInt();
		
		switch(mode) {
		case 1:
			// 三角形面積計算機
			System.out.println("底辺を入力してください");
			a = scanner.nextInt();
			
			System.out.println("高さを入力してください");
			b = scanner.nextInt();
			
			c = (a * b) / 2;
			
			System.out.println("底辺 " + a + " 高さ " + b + " の三角形の面積は " + c);
			break;
			
		case 2:
			// 四角形面積計算機
			System.out.println("縦幅を入力してください");
			a = scanner.nextInt();
			
			System.out.println("横幅を入力してください");		
			b = scanner.nextInt();
			
			c = a * b;
			
			System.out.println("縦幅 " + a + " 横幅 " + b + " の四角形の面積は " + c);
			break;
			
		case 3:
			// 円面積計算機
			System.out.println("半径を入力してください");
			a = scanner.nextInt();
					
			c = a * a * 3;
			
			System.out.println("半径 " + a  + " の円の面積は " + c);
			break;
		
		default:
			System.out.println("エラー！1～3の中から入力してください！");
		}

	}

}
