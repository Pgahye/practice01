package practice01;

import java.util.Scanner;

public class Prob3 {

	public static void main(String[] args) {

		while (true) {

			Scanner scanner = new Scanner(System.in); // 표준입력

			System.out.print("숫자를 입력하세요:");

			int number = scanner.nextInt();
			int sum = 0;

			if (number % 2 == 0) {

				for (int i = 0; i <= number; i = i + 2) {

					sum = sum + i;

				}

			} else {
				for (int i = 1; i <= number; i = i + 2) {

					sum = sum + i;

				}

			}

			System.out.println("결과값:" + sum);
			System.out.println();
			scanner.close();
		}
		
	

	}
}
