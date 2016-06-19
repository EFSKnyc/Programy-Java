import java.util.*;
//używamy biblioteki, w której znajduje się definicja typu Scanner
class Program
{
  public static void main(String[] args)
  {
  	Scanner reader = new Scanner(System.in);
  	// Tworzy obiekt typu Scanner, który posłuży nam do wczytywania informacji wpisanych przez użytkownika

  	System.out.println("Wprowadź pierwszą liczbę:");
  	int pierwsza = reader.nextInt();

  	System.out.println("Wprowadź drugą liczbę:");
  	int druga = reader.nextInt();



  	if (pierwsza > druga)
       //liczba pierwsza jest większa od drugiej
  	   System.out.println("Liczba pierwsza jest większa niż druga");

    else
  	//liczba pierwsza nie jest większa od drugiej

  	   if (pierwsza < druga)
         //liczba pierwsza jest mniejsza od drugiej
  	     System.out.println("Liczba pierwsza jest mniejsza od drugiej");

  	   else
  	     //liczba pierwsza nie jest ani większa, ani mniejsza od drugiej
  	     System.out.println("Liczba pierwsza jest równa drugiej");
  }
}
