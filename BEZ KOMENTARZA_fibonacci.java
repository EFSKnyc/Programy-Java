import java.util.*;

class Program
{
  public static void main(String[] args)
  {
  	Scanner reader = new Scanner(System.in);

  	System.out.println("Wprowadź liczbę liczb ciągu Fibonacciego do wypisania:");
  	int liczba = reader.nextInt(); 

  	if (liczba >= 1)
  		System.out.println(0);
  	if (liczba >= 2)
  		System.out.println(1);
  	if (liczba >= 3)
  		System.out.println(1);


  	int poprzednia = 1;
  	int przedpoprzednia = 1;

  	for (int i = 4; i <= liczba; i++)
  	{
  		int aktualna = poprzednia + przedpoprzednia;
  		System.out.println(aktualna);

  		przedpoprzednia = poprzednia;
  		poprzednia = aktualna;
  	}
  }
}
