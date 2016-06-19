import java.util.*;

class Program
{
  public static void main(String[] args)
  {
  	Scanner reader = new Scanner(System.in);

  	System.out.println("Wprowadź liczbę:");
  	int liczba = reader.nextInt();  

        boolean MaDzielnik = false;


  	for (int i = 2; i < liczba; i++)
  		if (liczba % i == 0)
  			MaDzielnik = true;

  	if (MaDzielnik)
  		System.out.println("Podana liczba nie jest pierwsza");
  	else
  		System.out.println("Podana liczba jest pierwsza");
  }
}
