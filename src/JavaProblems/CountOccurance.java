package JavaProblems;

public class CountOccurance {
	
	static int[] arr = {1,32,4,32,432,1,24,3,2,1,2,6,5,7,4,3,5,67,3,3,5,6,3,35,65};
	static int count;
	
	public static void main(String[] args){
		
		
		
		for(int i=0;i<arr.length;i++){
			
			for(int j=i;j<arr.length;j++){
			if(arr[i]==arr[j]){
				count = count+1;
			}
			}
			System.out.println("Count of occurance of "+arr[i] + " is " + count);	
			count =0;
			
		}
		
	}

}
    