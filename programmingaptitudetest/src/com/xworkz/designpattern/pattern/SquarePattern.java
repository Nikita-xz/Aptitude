package com.xworkz.designpattern.pattern;

public class SquarePattern {

	public static void main(String[] args) {
		int num=4;
		for(int i=0; i<=num;i++) {
			for(int j=0;j<=num;j++) {
				if(i==0||j==0||i==num||j==num) {
					System.out.println(j);
				}else {
					System.out.println(" ");
				}
			}
		}
		System.out.println();
	}

}

