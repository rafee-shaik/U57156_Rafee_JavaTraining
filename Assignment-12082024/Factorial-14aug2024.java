package Examples;

public class Example8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 5; 
				
	/*	int result=1 ;
		
		for(int i=1; i<= num; i++) {
			
			result *= i;
		}
		
		System.out.println("the factorial value for the number "+num+" is " +result); */
		
		int factresult = factorial(num);
		
		System.out.println("the factorial value for the number "+num+" is " +factresult);
		
	}
	
	static int factorial(int number) {
		
		int fact = 1;
		
		for(int i=1; i<= number; i++) {
			
			fact *= i;
		}
		
		return fact;
		
	}

}
