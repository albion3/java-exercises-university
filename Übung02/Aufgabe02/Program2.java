
public class Program2
{
	//Aufgabe 2
	public void vergleiche()
	{
		System.out.println(6.5f == 6.5 ? "6.5f == 6.5" : "6.5f != 6.5");  
		/*
		 * 6.5 l�sst sich endlich in bin�r darstellen (110.1), weshalb der Pr�zisionsunterschied
		 * von double und float beim Vergleich kein Problem darstellt und immer TRUE zur�ckgegeben
		 * wird.
		 */
		System.out.println(6.4f == 6.4 ? "6.4f == 6.4" : "6.4f != 6.4");  
		/*
		 * 6.4 l�sst sich *nicht* endlich in bin�r darstellen (110,0110011...), weshalb
		 * der Pr�zisionsunterschied von double und float beim Vergleich ein Problem darstellt
		 * und immer FALSE zur�ckgegeben wird, da 110.0110(0000...) != 110.0110011... ist.
		 */
	}
}
