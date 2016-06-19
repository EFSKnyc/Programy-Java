import java.util.*;
//używamy biblioteki, w której znajduje się definicja typu Scanner
class Program
{
  //deklaruje funkcje Silnia, która:
  static int Silnia(int n)
  {
  	if (n < 2)
  		return 1;
  	return n * Silnia (n - 1);
  }

  public static void main(String[] args)
  {
  	Scanner reader = new Scanner(System.in);

  	System.out.println("Wprowadź liczbę elementów tablicy:");
  	int liczba = reader.nextInt();  

  	int wynik = Silnia(liczba);

  	System.out.println ("Silnia z podanej liczby jest równa " + wynik);
  }

}
