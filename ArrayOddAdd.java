package Shinde;

import java.util.Scanner;

public class ArrayOddAdd {
	public static void main(String[] args) {
		
		int result=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		
		
		
		System.out.println("Enter Array element");
		int [] arr=new int[size];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
			
			if (arr[i]%2!=0) {
			
				result=result+arr[i];
				
			}
			
			
		}
		System.out.println("Addition of Odd Number is "+result);
		sc.close();
	}

}
