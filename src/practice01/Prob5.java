package practice01;

public class Prob5 {

	public static void main(String[] args) {

		for (int i = 1; i < 100; i++) {

			String s = String.valueOf(i);// 숫자를 문자로 바꿔주는 함수, 객체랑 상관없이 실행됨

			int count = 0;

			for (int j = 0; j < s.length(); j++) {

				char a = s.charAt(j);

				if (a == '3' || a == '6' || a == '9') {

					count++;
				}

			}
			System.out.print(s + " ");

			// System.out.print(" "+s.length());
			// System.out.print(" "+count);
			for (int n = 0; n < count; n++) {

				System.out.print("짝");
			}

			System.out.println();

		}

	}
}