package Shinde;

import java.util.Scanner;

public class FindDistance {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter X1");
		int x1=sc.nextInt();
		System.out.println("Enter Y1");
		int y1=sc.nextInt();
		System.out.println("Enter X2");
		int x2=sc.nextInt();
		System.out.println("Enter Y2");
		int y2=sc.nextInt();
		
		double distance=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		
		System.out.println("Distance is "+distance);
		
		sc.close();
		
	}
	
}