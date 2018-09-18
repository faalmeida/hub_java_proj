package lambda;

import java.util.concurrent.Callable;

public class LambdaTest {

	public static void main(String[] args) throws Exception {
		
		LambdaTest lt = new LambdaTest();
		String s = lt.invoke(() -> "done");
		System.out.println("s: "+s);
		
	}
	
	<T> T invoke(Callable<T> c) throws Exception {
	    return c.call();
	}

	
}
