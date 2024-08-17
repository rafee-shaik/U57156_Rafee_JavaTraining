package Examples;

public class Example1 {

	public static void main(String[] args) {
		
		// Print Fibonacci series up to 1000
		
		int a=0,  b=1, c=0,  i, count=1000;
		
		System.out.print(a+" "+b);
		
		for(i=2;c<count;i++) {
			
			c = a+b;		
			
			if(c<count) {
				System.out.print(" "+c);
				a=b;
				b=c;				
			}
			else {
				break;
			}
		}
	}
}