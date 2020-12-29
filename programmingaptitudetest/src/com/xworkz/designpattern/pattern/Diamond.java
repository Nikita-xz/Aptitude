package com.xworkz.designpattern.pattern;

public class Diamond {

	public static void main(String[] args) {
		int number=7;
		int a=number/2+1;
		int b=1;
		int i,j;
		for(i=1; i<=number; i++) {
			for(j=1;j<=number;j++) {
				if(j==a||j==number-a+1) {
					System.out.println(b);
				}else {
					System.out.println(" ");
				}
			}
			if(i<=number/2) {
				a--;
				b++;
			}else {
				a++;
				b--;
			}
			System.out.println();
		}



	}

}
