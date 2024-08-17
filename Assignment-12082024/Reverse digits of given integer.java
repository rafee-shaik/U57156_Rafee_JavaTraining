package Examples;

public class Example6 {

	public static void main(String[] args) {
		// Reverse digits of given integer and print. example 6814 = 4186
		
		int num = 6814, reverse_num = 0, i=0;
		int rnum[] = new int[4];  
		System.out.println("the given number   "+num );
		while(num !=0){			
			reverse_num = num%10 ;
			rnum[i] = reverse_num;
			// System.out.println("the reverse number digits "+reverse_num );
			num /= 10;
			i++;
		}
		
		System.out.print("the reverse number ");
		for(i=0; i<rnum.length; i++) {
			System.out.print(""+rnum[i]);
		}
	}
}
