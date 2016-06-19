import java.util.*;

class Program
{
  public static void main(String[] args)
  {
  	Scanner reader = new Scanner(System.in);

  	System.out.println("Jak Ci na imię?");
  	String imie = reader.next();

  	System.out.println("Ile masz lat?");
  	String wiek = reader.next();

  	System.out.println("Użytkownik " + imie + " ma " + wiek + " lat");
  }
}
