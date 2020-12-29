package com.xworkz.designpattern.pattern;

import java.util.Scanner;

public class Triangle {
	public static void main(String[] args) {
		int i,j;
		Scanner scanner=new Scanner(System.in);
		System.out.println("number of rows you want enter");
		
	int number=scanner.nextInt();
	
		for(i=1;i<=number;i++) {
			for(j=1; j<=i;j++) {
				System.out.println(j+ "");
			}
			System.out.println();
		}
		for(i=number-1;i>=1; i--) {
			for(j=1;j<=i;j++) {
				System.out.println(j+ "");
			}
			System.out.println();
		}
		Scanner.close();
	}
}


}
