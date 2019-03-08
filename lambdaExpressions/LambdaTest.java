package lambdaExpressions;

//lambda expressions are added in Java 8 and provide below functionalities.
//
//Enable to treat functionality as a method argument, or code as data.
//A function that can be created without belonging to any class.
//A lambda expression can be passed around as if it was an object and executed on demand.

public class LambdaTest {

	public static void main(String[] args) {
		// lambda expression to implement above 
        // functional interface. This interface 
        // by default implements abstractFun() 
        FuncInterface fobj = (int x)->System.out.println(2*x); 
  
        // This calls above lambda expression and prints 10. 
        fobj.abstractFun(5); 
	}

}
