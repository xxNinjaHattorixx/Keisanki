// 計算ロジック

import java.util.Scanner;

public class Logic {

	public static void triangleArea(Scanner scanner) {
		// 三角形面積計算機
		int base = getInput(scanner, "底辺を入力してください");
		int height = getInput(scanner, "高さを入力してください");
		
		double area = (double)(base * height) / 2;
		
		System.out.println("------------------------------------------------------");
		System.out.println("底辺 " + base + " 高さ " + height + " の三角形の面積は " + area);
	}
	
	public static void squareArea(Scanner scanner) {
		// 四角形面積計算機
		int base = getInput(scanner, "底辺を入力してください");
		int height = getInput(scanner, "高さを入力してください");
		
		int area = base * height;
		
		System.out.println("------------------------------------------------------");
		System.out.println("縦幅 " + base + " 横幅 " + height + " の四角形の面積は " + area);
	}
	
	public static void circleArea(Scanner scanner) {
		// 円面積計算機
		int radius = getInput(scanner, "半径を入力してください");
				
		double area = (double)(radius * radius) * 3.14;
		
		System.out.println("------------------------------------------------------");
		System.out.println("半径 " + radius  + " の円の面積は " + area);
	}

	private static int getInput(Scanner scanner, String question) {
		System.out.println(question);
		while(!scanner.hasNextInt()) {
			System.out.println("無効な入力です。整数を入力してください");
			scanner.next();
		}
		return scanner.nextInt();
	}
}
