import java.util.*;

class Program
{
  public static void main(String[] args)
  {
  	Scanner reader = new Scanner(System.in);


  	System.out.println("Wpisz liczbę: ");
  	int liczba =  reader.nextInt(); 
        System.out.println(liczba);

        System.out.println("Wpisz ciąg znaków: ");
        String ciagznakow = reader.next();
        System.out.println(ciagznakow);

        System.out.println("Wpisz liczbę dziesiętną (ewentualny przecinek zastąp kropką): ");
        double liczbazprzecinkiem = reader.nextDouble();
        System.out.println(liczbazprzecinkiem);
  }
}
