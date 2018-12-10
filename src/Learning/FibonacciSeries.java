package Learning;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int i= 1,j=2,c;
		int count=10;
		
		System.out.print(i + " " + j);
		
		for(int d=2;d<count;d++){
			
			c=i+j;
			
			System.out.print(" " + c);
			
			i=j;
			j=c;
			
		}
		

	}

}
