
public class Funktionswerteraten extends Spiel
{
	public Funktionswerteraten()
	{
		super("Funktionswerteraten");
	}

	@Override
	int spiele()
	{
		java.util.Random r = new java.util.Random();
		Evaluierbar func = r.nextBoolean() ?
				new Efunktion() : new LineareFunktion();
		int rand = Math.abs(r.nextInt() % 50 + 1);
		System.out.println(func.getName());
		System.out.println("Zuf�lliger x-Wert: " + rand);
		System.out.println("Sch�tze den Funktionswert:");
		int guess = -1;
		do
		{
			try
			{
				guess = Integer.parseInt(Casino.sc.nextLine());
			}
			catch (Exception ex)
			{
				System.out.println("Fehlerhafte Angabe. Erneut sch�tzen:");
			}
		} while (guess == -1);
		if (Math.abs(func.evaluate(rand) - guess) < 5)
		{
			System.out.println("Sch�tzung ist gut. Gewinn (abz�glich Einsatz): " + rand);
			return super.getEinsatz() + rand;
		}
		else
		{
			System.out.println("Sch�tzung ist schlecht. Kein Gewinn.");
			return 0;
		}
	}	
}
