import java.util.*;
//używamy biblioteki, w której znajduje się definicja typu Scanner
class Program
{
  public static void main(String[] args)
  {
  	Scanner reader = new Scanner(System.in);
  	// Tworzy obiekt typu Scanner, który posłuży nam do wczytywania informacji wpisanych przez użytkownika

  	System.out.println("Wprowadź pierwszą liczbę przedziału");
  	int pierwsza = reader.nextInt();  //wczytuje liczbę wpisaną przez użytkownika

  	System.out.println("Wprowadź drugą liczbę przedziału");
  	int druga = reader.nextInt();  //wczytuje liczbę wpisaną przez użytkownika


  	for (int i = pierwsza; i <= druga; i++)
    //deklaruje zmienną i, nadaje jej wartość pierwszej liczby przedziału
    //podczas, gdy i jest mniejsze lub równe druga, wykonuje poniższe polecenie oraz zwiększa i o 1 (operacja i++)
  		System.out.println(i);
      //wypisuje aktualną wartość i
  }
}
