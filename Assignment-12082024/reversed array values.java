package Examples;

public class Example4 {

	public static void main(String[] args) {
		
		int pincome[] = new int[5];
		
		pincome[0] = 32;
		pincome[1] = 11;
		pincome[2] = 45;
		pincome[3] = 56;
		pincome[4] = 96;
		
		int[] ravalues = reverse(pincome);
		
		for(int i=0; i<pincome.length; i++) {
		
		System.out.println("reversed array values " +ravalues[i]);	
		
		}

	}
	
	static int[] reverse(int[] avalues){
		
		int n = avalues.length, tmp;
		
		for(int i=0; i<n/2; i++) {
			
			tmp = avalues[i];
			avalues[i] = avalues[n-i-1];
			avalues[n-i-1] = tmp;
			
		}
	
		return avalues;
		
	}


}
