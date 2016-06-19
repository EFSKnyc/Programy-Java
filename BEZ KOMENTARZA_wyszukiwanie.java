import java.util.*;

class Program
{
  public static void main(String[] args)
  {
  	Scanner reader = new Scanner(System.in);

  	System.out.println("Wprowadź liczbę elementów tablicy:");
  	int n = reader.nextInt();

  	int[] tablica = new int[n];

  	for (int i = 0; i < n; i++)
  		tablica[i] = reader.nextInt();

  	System.out.println("Zakończono wczytywanie tablicy. Podaj szukaną wartość:");
  	int szukana = reader.nextInt();

  	for (int i = 0; i < n; i++)
  		if (tablica[i] == szukana)
  			System.out.println("Element tablicy o indeksie " + i + " ma wartość równą szukanej");
  	}
}
