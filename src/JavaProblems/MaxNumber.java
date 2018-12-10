package JavaProblems;

public class MaxNumber {
	
	static int[] arr = {1,32,4,32,432,1,24,3,2,1,2,6,5,7,4,3,5,67,3,3,5,6,3,35,65};

	public static void main(String[] args){
		
		int max = arr[0];
		int min = arr[0];
		
		for(int i=0;i<arr.length;i++){
			
			if(arr[i]>max){
				
			max = arr[i];	
			
			}
			
			if(arr[i]<min){
				
				min = arr[i];	
				
				}
		}
	
		System.out.println("Maximun number is :" + min);
		System.out.println("Maximum number is :" + max);
		
		
	}
	
	
}
