package Examples;

public class Example10 {

	public static void main(String[] args) {
		// Bubble Sort with flag for ascending order or descending order
		
				 int arr[] ={3,60,35,2,45,320,5};  
		         
		         System.out.println("Array Before Bubble Sort");  
		         for(int i=0; i < arr.length; i++){  
		                 System.out.print(arr[i] + " ");  
		         }  
		         System.out.println();  
		           
		         bubbleSort(arr, true);//sorting array elements using bubble sort in ascending order  
		          
		         System.out.println("Array After Bubble Sort in ascending order");  
		         for(int i=0; i < arr.length; i++){  
		                 System.out.print(arr[i] + " ");  
		         } 
		         		         
		         bubbleSort(arr, false);//sorting array elements using bubble sort in descending order
		         
		         System.out.println("\nArray After Bubble Sort in descending order");  
		         for(int i=0; i < arr.length; i++){  
		                 System.out.print(arr[i] + " ");  
		         }

			}
			
				static void bubbleSort(int[] arr, boolean a) {  
		        int n = arr.length;  
		        int temp = 0; 
		        
		        if (a==true){
		         for(int i=0; i < n; i++){  
		                 for(int j=1; j < (n-i); j++){  
		                          if(arr[j-1] > arr[j]){  
		                                 //swap elements  
		                                 temp = arr[j-1];  
		                                 arr[j-1] = arr[j];  
		                                 arr[j] = temp;  
		                         }  
		                          
		                 }  
		         }  
		  
		    }
		        if (a==false){
			         for(int i=0; i < n; i++){  
			                 for(int j=1; j < (n-i); j++){  
			                          if(arr[j-1] < arr[j]){  
			                                 //swap elements  
			                                 temp = arr[j-1];  
			                                 arr[j-1] = arr[j];  
			                                 arr[j] = temp;  
			  }			                          
			}  
		  }			  
		}		        
	}
}
