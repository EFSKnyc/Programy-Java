import java.util.*;

class Program
{
  public static void main(String[] args)
  {
  	Scanner reader = new Scanner(System.in);

  	double a = 0;

  	while(a < 1 || a >= 5)
  	{
  		System.out.println("Wprowadź liczbę z przedziału <1, 5)");
  		a = reader.nextDouble(); //wczytuje liczbę wpisaną przez użytkownika
  	}

  	System.out.println("Wpisana liczba to " + a);
  }
}
