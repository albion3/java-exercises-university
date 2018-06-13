
public class TestTrace
{
	public static void main(String[] args) 
	{
		CallEg eg = new CallEg(); // use default constructor
		try 
		{
			eg.methodA();
		} 
		catch (ArithmeticException oops) 
		{
			oops.printStackTrace();
		}
	}
	
	/*
	 * Aufgabe 4a
	 * 
	 * - TestTrace.main
	 * - CallEg.methodA
	 * - java.lang.ArithmeticException
	 */
	
	/*
	 * Aufgabe 4b
	 * 
	 * - TestTrace.main
	 * - CallEg.methodA
	 * - CallEg.methodB
	 * - CallEg.methodC
	 * - java.lang.ArithmeticException
	 */
	
	/*
	 * Aufgabe 4c
	 * 
	 * - TestTrace.main
	 * - CallEg.methodA
	 * - CallEg.methodB
	 * - CallEg.methodC
	 * - java.lang.ArithmeticException
	 * 
	 * F�r alle try-catch-Bl�cke wird der gesamte Stacktrace f�r
	 * die Exception ausgegeben, d.h. die Exception wird durch
	 * das throw in den catch-Bl�cken weitergereicht
	 */
}
