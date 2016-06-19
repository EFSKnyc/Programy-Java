import java.util.*;
//używamy biblioteki, w której znajduje się definicja typu Scanner
class Program
{
  public static void main(String[] args)
  {
  	Scanner reader = new Scanner(System.in);
  	// Tworzy obiekt typu Scanner, który posłuży nam do wczytywania informacji wpisanych przez użytkownika

  	System.out.println("Wprowadź liczbę liczb ciągu Fibonacciego do wypisania:");
  	int liczba = reader.nextInt();  //wczytuje liczbę wpisaną przez użytkownika

  	if (liczba >= 1)
  		System.out.println(0);
  	if (liczba >= 2)
  		System.out.println(1);
  	if (liczba >= 3)
  		System.out.println(1);
  	//wypisuje pierwsze 3 liczby (numer 0, 1 i 2) ciągu Fibonacciego z definicji

  	int poprzednia = 1;
  	int przedpoprzednia = 1;
    //deklaruje zmienne przechowujące wartości dwóch ostatnich elementów ciągu Fibonacciego

  	for (int i = 4; i <= liczba; i++)
    //jeśli liczba jest większa lub równa 4,
    //dla każdego i całkowitego w przedziale <4, lizcba> wypisuje odpowiednią liczbę z ciągu Fibonacciego
  	{
  		int aktualna = poprzednia + przedpoprzednia;
  		System.out.println(aktualna);
      //wylicza i wypisuje aktualną liczbę z ciągu Fibonacciego

  		przedpoprzednia = poprzednia;
  		poprzednia = aktualna;
      //przenosi wartości poprzednich elementów tak, żeby były aktualne dla następnej liczby ciągu (i + 1)
  	}
  }
}
