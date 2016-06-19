import java.util.*;

class Program
{
  public static void main(String[] args)
  {
  	Scanner reader = new Scanner(System.in);

  	System.out.println("Wprowadź liczbę:");
  	int n = reader.nextInt();  

  	for (int i = 0; i < n; i++)
  	{
  	   for (int k = 0; k < n; k++)

		System.out.print("#");
           System.out.println();
  	}


  }
}
