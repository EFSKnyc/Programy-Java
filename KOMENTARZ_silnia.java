import java.util.*;
//używamy biblioteki, w której znajduje się definicja typu Scanner
class Program
{
  //deklaruje funkcje Silnia, która:
  static int Silnia(int n)
  {
  	if (n < 2)
  		return 1;
      //dla n równego 0 lub 1, zwraca wartość 1 (z definicji)

  	return n * Silnia (n - 1);
    //dla n większego od 1, zwraca wartość n * (wartość funkcji Silnia dla (n - 1))
  }

  public static void main(String[] args)
  {
  	Scanner reader = new Scanner(System.in);
  	// Tworzy obiekt typu Scanner, który posłuży nam do wczytywania informacji wpisanych przez użytkownika

  	System.out.println("Wprowadź liczbę elementów tablicy:");
  	int liczba = reader.nextInt();  //wczytuje liczbę wpisaną przez użytkownika

  	int wynik = Silnia(liczba);
    //wywołuje zadeklarowaną powyżej funkcję Silnia dla wartości liczba

  	System.out.println ("Silnia z podanej liczby jest równa " + wynik);
  }

}
