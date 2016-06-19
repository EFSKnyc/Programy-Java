import java.util.*;
//używamy biblioteki, w której znajduje się definicja typu Scanner
class Program
{
  public static void main(String[] args)
  {
  	Scanner reader = new Scanner(System.in);
  	// Tworzy obiekt typu Scanner, który posłuży nam do wczytywania informacji wpisanych przez użytkownika

  	System.out.println("Wprowadź liczbę elementów tablicy:");
  	int n = reader.nextInt();  //wczytuje liczbę wpisaną przez użytkownika

  	int[] tablica;

  	tablica = new int[n];
    //deklaruje zmienną tablica, będącą
    //tablicą przechowującą wartości n liczb całkowitych

  	for (int i = 0; i < n; i++)
  		tablica[i] = reader.nextInt();
      //wpisuje podane przez użytkownika n liczb na kolejne miejsca w tablicy

  	int tymczasowa = 0;
    //deklaruje zmienną, która będzie potrzebna do tymczasowego przechowywania wartości innych zmiennych

  	for (int i = 0; i < n; i++)
    //n razy wykonuje poniższe polecenie
  		for (int k = 0; k < n - 1; k++)
      //n - 1 razy wykonuje poniższe polecenie,
      //ponieważ w tablicy n liczb da się utworzyć jedynie n - 1 kolejnych par liczb
  			if (tablica[k] > tablica[k + 1])
        //jeśli elementy w parze są ułożone w kolejności rosnącej,
        //ich wartości są zamieniane
  			{

          //zamienia wartości tablica[k] i tablica[k + 1]
  				tymczasowa = tablica[k + 1];
  				tablica[k + 1] = tablica [k];
  				tablica[k] = tymczasowa;

  			}


  	for (int i = 0; i < n; i++)
  		System.out.println("Element o indeksie " + i + " ma wartość " + tablica[i]);
      //wypisuje wartości wszystkich n elementów tablicy
  }

}
