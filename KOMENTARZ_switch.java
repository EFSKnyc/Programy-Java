import java.util.*;
//używamy biblioteki, w której znajduje się definicja typu Scanner
class Program
{
  public static void main(String[] args)
  {
  	Scanner reader = new Scanner(System.in);
  	// Tworzy obiekt typu Scanner, który posłuży nam do wczytywania informacji wpisanych przez użytkownika

  	System.out.println("Wprowadź pierwszą liczbę:");
  	int pierwsza = reader.nextInt();

  	System.out.println("Wprowadź drugą liczbę:");
  	int druga = reader.nextInt();

  	System.out.println("Wprowadź nazwę operacji (Obsługiwane operacje to DODAJ, ODEJMIJ, POMNÓŻ, PODZIEL):");
  	String operacja = reader.next();

  	double wynik = 0;
    //delkaruje zmienną wynik, do której będzie wpisany wynik operacji

  	switch (operacja)
    //w zależności od wartości zmiennej operacja, wykonuje różne polecenia
  	{
  		case "DODAJ":
      //jeśli wartość zmiennej to "DODAJ", dodaje liczby
  			wynik = pierwsza + druga;
  			break;

  		case "ODEJMIJ":
      //jeśli wartość zmiennej to "ODEJMIJ", odejmuje liczby
  			wynik = pierwsza - druga;
  			break;

  		case "POMNÓŻ":
      //jeśli wartość zmiennej to "POMNÓŻ", mnoży liczby
  			wynik = pierwsza * druga;
  			break;

  		case "PODZIEL":
      //jeśli wartość zmiennej to "PODZIEL", dzieli liczby
  			wynik = pierwsza / druga;
  			break;
  	}

  	System.out.println("Wynik to " + wynik);
    //wypisuje uzyskany wynik do okna konsoli
  }
}
