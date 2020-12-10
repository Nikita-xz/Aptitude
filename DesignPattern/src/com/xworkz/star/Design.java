package com.xworkz.star;

public class Design {

	public static void main(String[] args) {
		for(int i=0; i<5; i++) {
			for(int j=0; j<=i; j++) {
				if(i==0 || i==1 || j==1 || i==2 || j==2 || i==3 || j==3 || i==4 || j==4 ) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
			
	}
	

}

	
		