import java.io.*;

public class Hamburger extends Fastfood
{
	//void eat()
	//void eat() throws Exception
	//void eat(int y) throws Exception
	//void eat() throws FileNotFoundException
	void eat() throws RuntimeException
	{
		
	}
}

/*
 * Aufgabe 3
 * 
 * 1. M�glich, da Hamburger.eat() die Methode Fastfood.eat() �berschreibt
 * 2. Nicht m�glich, da eat nicht mit throws Exception deklariert
 *    werden darf, da Fastfood.eat() throws IOException existiert
 * 3. M�glich, da die Methode eat �berladen wurde mit dem
 *    Parameter int y
 * 4. M�glich, da FileNotFoundException eine Unterklasse von
 *    IOException darstellt
 * 5. M�glich, da IOException eine RuntimeException darstellt
 */
