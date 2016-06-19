import java.util.*;
//używamy biblioteki, w której znajduje się definicja typu Scanner
class Program
{
  public static void main(String[] args)
  {
  	Scanner reader = new Scanner(System.in);
  	// Tworzy obiekt typu Scanner, który posłuży nam do wczytywania informacji wpisanych przez użytkownika

  	System.out.println("Wprowadź liczbę:");
  	int liczba = reader.nextInt();  //wczytuje liczbę wpisaną przez użytkownika

	  boolean MaDzielnik = false;
    //deklarujemy zmienną, która zapisuje odpowiedź na pytanie:
    //Czy znamy jakikolwiek dzielnik liczby oprócz 1 i jej samej?


  	for (int i = 2; i < liczba; i++)
  	//dla i większego od 1 i mniejszego od liczby, wykonuje polecenie:
  		if (liczba % i == 0)
  		//jeśli liczba jest podzielna przez i, to
      //i jest jej dzielnikiem
  			MaDzielnik = true;

  	if (MaDzielnik)
  		System.out.println("Podana liczba nie jest pierwsza");
  	else
  		System.out.println("Podana liczba jest pierwsza");
  }
}
