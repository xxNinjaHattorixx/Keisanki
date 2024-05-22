// 計算ロジック

import java.util.Scanner;

public class Logic {

	public static void sankaku(Scanner scanner) {
		// 三角形面積計算機			
		System.out.println("底辺を入力してください");
		int a = scanner.nextInt();
		
		System.out.println("高さを入力してください");
		int b = scanner.nextInt();
		
		int c = (a * b) / 2;
		
		System.out.println("------------------------------------------------------");
		System.out.println("底辺 " + a + " 高さ " + b + " の三角形の面積は " + c);
	}
	
	public static void shikaku(Scanner scanner) {
		// 四角形面積計算機
		System.out.println("縦幅を入力してください");
		int a = scanner.nextInt();
		
		System.out.println("横幅を入力してください");		
		int b = scanner.nextInt();
		
		int c = a * b;
		
		System.out.println("------------------------------------------------------");
		System.out.println("縦幅 " + a + " 横幅 " + b + " の四角形の面積は " + c);
	}
	
	public static void maru(Scanner scanner) {
		// 円面積計算機
		System.out.println("半径を入力してください");
		int a = scanner.nextInt();
				
		int c = a * a * 3;
		
		System.out.println("------------------------------------------------------");
		System.out.println("半径 " + a  + " の円の面積は " + c);
	}

}
