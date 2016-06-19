import java.util.*;

class Program
{
  public static void main(String[] args)
  {
  	Scanner reader = new Scanner(System.in);

  	System.out.println("Wprowadź liczbę elementów tablicy:");
  	int n = reader.nextInt();

  	int[] tablica;

  	tablica = new int[n];

  	for (int i = 0; i < n; i++)
  		tablica[i] = reader.nextInt();

  	int tymczasowa = 0;

  	for (int i = 0; i < n; i++)
  		for (int k = 0; k < n - 1; k++)
  			if (tablica[k] > tablica[k + 1])
  			{
  				tymczasowa = tablica[k + 1];
  				tablica[k + 1] = tablica [k];
  				tablica[k] = tymczasowa;
  			}

  	for (int i = 0; i < n; i++)
  		System.out.println("Element o indeksie " + i + " ma wartość " + tablica[i]);
  }

}
