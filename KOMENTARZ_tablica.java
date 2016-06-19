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

  	int[] tablica = new int[n];
    //deklaruje zmienną tablica, będącą
    //tablicą przechowującą wartości n liczb całkowitych
  	

  	for (int i = 0; i < n; i++)
  		tablica[i] = reader.nextInt();
      //wpisuje podane przez użytkownika n liczb na kolejne miejsca w tablicy


  	for (int i = 0; i < n; i++)
  		System.out.println("Element o indeksie " + i + " ma wartość " + tablica[i]);
      //wypisuje wartości wszystkich n elementów tablicy
  }
}
