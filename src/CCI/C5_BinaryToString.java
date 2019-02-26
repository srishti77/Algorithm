package CCI;

import java.util.Scanner;

public class C5_BinaryToString {

	public static void main(String s[]) {

		Scanner inp = new Scanner(System.in);
		System.out.println("Enter the number");
		float n = inp.nextFloat();
		StringBuilder str = new StringBuilder();

		str.append(".");
		if (n < 0 || n > 1)
			System.out.println("ERROR");

		else {

			while (n > 0) {

				if (str.length() == 32)
					break;
				float p = n * 2;
				if (p >= 1) {
					str.append("1");
					n = p - 1;

				}

				else {
					str.append("0");
					n = p;
				}
			}
		}

		System.out.println(str);

	}

}
