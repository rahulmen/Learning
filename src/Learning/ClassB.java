package Learning;
import com.learningJava.*;


public class ClassB extends ClassA {
	
	public static void main(String[] args){
		
		ClassB obj = new ClassB();
		System.out.println(obj.a);
	/*
	 * Protected member outside package will be accessed through inheritance only and
	 * that too with same child class reference	
	 */
		
	}

}
