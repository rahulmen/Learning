package Learning;

public abstract strictfp class StrictFPClassExample {
	
	strictfp public void m1(){
		System.out.println(10.0/3);
	}
	
	abstract void m2();
	
		
	}



/*   
 * We can never use strictfp with abstract at method level because if method is abstract
 * then we can't provide implementation to that method but strictfp method must have implementation
 * as it talks about implementation.
 * 
 * 
 * Whereas we can use strictfp with abstract as class level because we can create child class for 
 * both types of classes.
 *
 * 
 * */


