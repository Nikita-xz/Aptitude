package com.xworkz.star;

public class LeftAngle {

	public static void main(String[] args) {
		int num = 4;

		for (int i = 0; i <= num; i++) {
			for (int j = 0; j <= num; j++) {
				if (i + j >= num)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

		for (int i = 0; i <= num; i++) {
			for (int j = 0; j <= num; j++) {
				if (j==num || i==num || i+j==num)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
	}

}
}
