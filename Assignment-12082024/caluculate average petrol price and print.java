package Examples;

public class Example5 {

	public static void main(String[] args) {
		/* Declare an array with petrol prices in six metro cities, 
		 * caluculate average petrol price and print
		 * 
		 * ******************************************************** */
		
		double petrol_price[] = new double[6];
		double a = 0;
		
		petrol_price[0] = 109.99; // Petrol price in New Delhi
		petrol_price[1] = 107.19; // Petrol price in Mumbai
		petrol_price[2] = 103.11; // Petrol price in Kolkatta
		petrol_price[3] = 105.76; // Petrol price in Chennai
		petrol_price[4] = 107.25; // Petrol price in Bangalore
		petrol_price[5] = 110.88; // Petrol price in Hyderabad
		
		for(int i=0; i<petrol_price.length; i++) {
			a += petrol_price[i];
		}
		
		a /= petrol_price.length;
		
		System.out.println("average price of petrol price is " +a);


	}

}
