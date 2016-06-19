import java.util.*;

class Program
{
  public static void main(String[] args)
  {
  	Scanner reader = new Scanner(System.in);

  	System.out.println("Wprowadź pierwszą liczbę przedziału");
  	int pierwsza = reader.nextInt(); 

  	System.out.println("Wprowadź drugą liczbę przedziału");
  	int druga = reader.nextInt();  


  	for (int i = pierwsza; i <= druga; i++)
  		System.out.println(i);
  }
}
