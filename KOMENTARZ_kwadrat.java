import java.util.*;
//używamy biblioteki, w której znajduje się definicja typu Scanner
class Program
{
  public static void main(String[] args)
  {
  	Scanner reader = new Scanner(System.in);
  	// Tworzy obiekt typu Scanner, który posłuży nam do wczytywania informacji wpisanych przez użytkownika

  	System.out.println("Wprowadź liczbę:");
  	int n = reader.nextInt();  //wczytuje liczbę wpisaną przez użytkownika


  	for (int i = 0; i < n; i++)
    //dla każdego i całkowitego należąecgo do przedziału <0, n) wykonuje poniższą grupę poleceń,
    //czyli wykonuje poniższą grupę poleceń n razy:
  	{
  		for (int k = 0; k < n; k++)
      //wykonuje poniższe polecenie n razy:
  			System.out.print("#");
        //w sumie to polecenie jest wykonane (n * n) razy

  		System.out.println();
      //przechodzi do następnej linijki w oknie konsoli
      //w sumie to polecenie jest wykonane n razy
  	}


  }
}
