import java.util.*;
//używamy biblioteki, w której znajduje się definicja typu Scanner
class Program
{
  public static void main(String[] args)
  {
  	Scanner reader = new Scanner(System.in);
  	// Tworzy obiekt typu Scanner, który posłuży nam do wczytywania informacji wpisanych przez użytkownika

  	double a = 0;
    //delkaruje zmienną a, do której będą wpisywane wartości podane przez użytkownika

  	while(a < 1 || a >= 5)
  	//podczas, gdy a jest mniejsze od 1 LUB większe lub równe 5, wykonaj:
    //czyli podczas, gdy a NIE należy do przedziału <1, 5), wykonaj:
  	{
  		System.out.println("Wprowadź liczbę z przedziału <1, 5)");
  		a = reader.nextDouble(); //wczytuje liczbę wpisaną przez użytkownika
  	}

  	System.out.println("Wpisana liczba to " + a);
    //wypisuje podaną liczbę z zakresu <1, 5)
  }
}
