import java.util.*;
//używamy biblioteki, w której znajduje się definicja typu Scanner
class Program
{
  public static void main(String[] args)
  {
  	Scanner reader = new Scanner(System.in);
  	// Tworzy obiekt typu Scanner, który posłuży nam do wczytywania informacji wpisanych przez użytkownika

  	//NWD - Największy Wspólny Dzielnik

  	System.out.println("Wprowadź pierwszą liczbę:");
  	int pierwsza = reader.nextInt();  //wczytuje liczbę wpisaną przez użytkownika

  	System.out.println("Wprowadź drugą liczbę:");
  	int druga = reader.nextInt();  //wczytuje liczbę wpisaną przez użytkownika

  	int aktualneNWD = 0;
    //deklaruje zmienną, która przechowuje największy dotychczas znaleziony NWD

  	for (int i = 1; i <= pierwsza && i <= druga; i++)
  	//tak długo, jak i jest mniejsze lub równe obu liczbom, wykonuje polecenie:
  		if (pierwsza % i == 0 && druga % i == 0)
      //pierwsza % i to wyrażenie, które oznacza resztę z dzielenia pierwsza przez i
      //jeśli pierwsza % i jest równe 0, to i dzieli pierwsza

  		//jeżeli i dzieli obie liczby, to jest ich wspólnym dzielnikiem
  		//ponieważ i wzrasta, jest to zarazem najwyższy dotychczas znaleziony wspólny dzielnik
  			aktualneNWD = i;


  	System.out.println("NWD podanych liczb to: " + aktualneNWD);
  	//przy i równym mniejszej z dwóch liczb, aktualne NWD jest faktycznym NWD.
  }
}
