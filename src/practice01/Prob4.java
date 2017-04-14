package practice01;

import java.util.Scanner;

public class Prob4 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("문자열을 입력하세요.:");

		String text = scanner.nextLine(); // 스트링은 객체 타입

		int length = text.length();

		// System.out.println(length);

		for (int i = 0; i < length; i++) {

			for (int j = 0; j <= i; j++) {
				char a = text.charAt(j);
				System.out.print(a);
			}

			System.out.println();

		}

		scanner.close();

	}
}