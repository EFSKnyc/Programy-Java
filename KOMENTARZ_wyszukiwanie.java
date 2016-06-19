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

  	System.out.println("Zakończono wczytywanie tablicy. Podaj szukaną wartość:");
  	int szukana = reader.nextInt();
    //wczytuje podaną podaną przez użytkownika wartość szukaną

  	for (int i = 0; i < n; i++)
    //dla każdego elementu tablicy
  		if (tablica[i] == szukana)
      //sprawdza, czy jego wartość nie jest równa wartości szukanej
  			System.out.println("Element tablicy o indeksie " + i + " ma wartość równą szukanej");
        //jeśli tak, wypisuje jego indeks
  	}
}
