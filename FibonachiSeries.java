package Shinde;

public class FibonachiSeries {
	public static void main(String[] args) {
		int a=0,b=1,c;
		System.out.println(a);
		for (int i = 5; i <= 10; i++) {
			c=a+b;
			a=b;
			b=c;
			System.out.println(a);
			
			
			
		}
	}

}
