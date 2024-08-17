
package Examples;

public class Example3 {

	public static void main(String[] args) {
		// Excercise in class on 13AUG2024
    
		int pincome[] = new int[5];
		
		pincome[0] = 32;
		pincome[1] = 11;
		pincome[2] = 45;
		pincome[3] = 56;
		pincome[4] = 96;
		
		print(pincome);
		

	int min_pincome = pincome[0];
	for(int i=1; i<pincome.length; i++){
		
		if(min_pincome>pincome[i]){
			min_pincome = pincome[i];
		}
		
	}
	
	System.out.println("minimum Per Capita income of city "+min_pincome);
	
	int mn_pincome = minincome(pincome);
	
	System.out.println("minimum Per Capita income of city "+mn_pincome);
	}

	static int minincome (int[] avalues) {
		
		int min_pincome = avalues[0];
		for(int i=1; i<avalues.length; i++){
			
			if(min_pincome>avalues[i]){
				min_pincome = avalues[i];
			}
			
		}
		
		return min_pincome;
		
	}
	
	static void print(int[] arr) {
		System.out.println("Display Begin.........");
		
for(int i=0; i<arr.length; i++) {
			
			System.out.println("(from last) Per Capita income of city "+i+ " is " +arr[i]);			
		
		}

System.out.println("Display Ends.........");
	}
}
