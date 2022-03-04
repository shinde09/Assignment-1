package Shinde;


import java.util.Scanner;

public class ArrayExample {
	public static void main(String[] args) {
		int result=0;
	int	remender=0,reverse=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int number=sc.nextInt();
		
		int [] arr = {10,15,20,25,30,100};
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]>number) {
				result=result+arr[i];
				
				
			}
			
			
		}
		System.out.println(result);
		while(result>0) {
			remender=result%10;
			reverse=reverse*10+remender;
			result/=10;
			
		}
		System.out.println("reverse number is "+reverse);

		sc.close();
	}

}
