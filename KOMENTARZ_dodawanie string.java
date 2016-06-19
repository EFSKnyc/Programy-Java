import java.util.*;
//używamy biblioteki, w której znajduje się definicja typu Scanner
class Program
{
  public static void main(String[] args)
  {
  	Scanner reader = new Scanner(System.in);
  	// Tworzy obiekt typu Scanner, który posłuży nam do wczytywania informacji wpisanych przez użytkownika

  	System.out.println("Jak Ci na imię?");
  	String imie = reader.next();

  	System.out.println("Ile masz lat?");
  	String wiek = reader.next();

  	System.out.println("Użytkownik " + imie + " ma " + wiek + " lat");
    //Łączy ciągi znaków w nawiasie w jeden, np. "Użytkownik Jasiu ma 5 lat"
    //Powstały ciąg znaków wypisuje do okna konsoli
  }
}
