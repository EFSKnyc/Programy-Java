import java.util.*;
//używamy biblioteki, w której znajduje się definicja typu Scanner
class Program
{
  public static void main(String[] args)
  {
  	Scanner reader = new Scanner(System.in);
  	// Tworzy obiekt typu Scanner, który posłuży nam do wczytywania informacji wpisanych przez użytkownika

  	System.out.println("Wpisz liczbę: ");
  	int liczba =  reader.nextInt(); // Wczytuje następną linijkę jako liczbę całkowitą
    System.out.println(liczba);

    System.out.println("Wpisz ciąg znaków: ");
    String ciagznakow = reader.next(); // Wczytuje następną linijkę jako ciąg znaków
    System.out.println(ciagznakow);

    System.out.println("Wpisz liczbę dziesiętną (ewentualny przecinek zastąp kropką): ");
    double liczbazprzecinkiem = reader.nextDouble(); // Wczytuje następną linijkę jako liczbę dziesiętną
    System.out.println(liczbazprzecinkiem);
  }
}
