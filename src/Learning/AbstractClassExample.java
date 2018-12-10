


package Learning;

public abstract class AbstractClassExample {

	public abstract void m1();
	
	public  void m2(){
		System.out.println("This is the public method");
	}
	
	//Inside abstract Class we can define final method
	
	 final void m3(){
		System.out.println("This is the final  method");
	}
}

/*
 * If a class is having 0 or more than 0 abstract method then we can define class as abstract
 * using this we will block user to create object of that class as that class is not completed
 * 
 * 
 * Final Class can't contain abstract method because if class is final then we can't create 
 *child class for that Class but if final class contain abstract method then we wont be able to
 *provide implementation to that abstract method
 *
 * 
 * Where as abstract class can contain final method because when we will create child class for that
 * we will not override final method else all method we can override and also will provide implementation
 * to abstract method
 * 
 * We can never use final and abstract modifier together both at class and method level.
 * 
 * 
 * 
 */




