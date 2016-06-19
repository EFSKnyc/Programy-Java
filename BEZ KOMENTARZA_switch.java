import java.util.*;

class Program
{
  public static void main(String[] args)
  {
  	Scanner reader = new Scanner(System.in);


  	System.out.println("Wprowadź pierwszą liczbę:");
  	int pierwsza = reader.nextInt();

  	System.out.println("Wprowadź drugą liczbę:");
  	int druga = reader.nextInt();

  	System.out.println("Wprowadź nazwę operacji (Obsługiwane operacje to DODAJ, ODEJMIJ, POMNÓŻ, PODZIEL):");
  	String operacja = reader.next();

  	double wynik = 0;

  	switch (operacja)
  	{
  		case "DODAJ":
  			wynik = pierwsza + druga;
  			break;

  		case "ODEJMIJ":
  			wynik = pierwsza - druga;
  			break;

  		case "POMNÓŻ":
  			wynik = pierwsza * druga;
  			break;

  		case "PODZIEL":
  			wynik = pierwsza / druga;
  			break;
  	}

  	System.out.println("Wynik to " + wynik);
  }
}
