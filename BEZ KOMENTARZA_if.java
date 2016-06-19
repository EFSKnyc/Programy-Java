import java.util.*;

class Program
{
  public static void main(String[] args)
  {
  	Scanner reader = new Scanner(System.in);

  	System.out.println("Wprowadź pierwszą liczbę:");
  	int pierwsza = reader.nextInt();

  	System.out.println("Wprowadź drugą liczbę:");
  	int druga = reader.nextInt();

  	if (pierwsza > druga)
  	System.out.println("Liczba pierwsza jest większa niż druga");
  }
}
