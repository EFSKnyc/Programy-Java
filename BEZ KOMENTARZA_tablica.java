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

  	for (int i = 0; i < n; i++)
  		System.out.println("Element o indeksie " + i + " ma wartość " + tablica[i]);
  }
}
