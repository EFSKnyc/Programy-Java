import java.util.*;

class Program
{
  public static void main(String[] args)
  {
  	Scanner reader = new Scanner(System.in);

  	//NWD - Największy Wspólny Dzielnik

  	System.out.println("Wprowadź pierwszą liczbę:");
  	int pierwsza = reader.nextInt();  

  	System.out.println("Wprowadź drugą liczbę:");
  	int druga = reader.nextInt();  /

  	int aktualneNWD = 0;
   

  	for (int i = 1; i <= pierwsza && i <= druga; i++)  	
  		if (pierwsza % i == 0 && druga % i == 0)  		
  			aktualneNWD = i;


  	System.out.println("NWD podanych liczb to: " + aktualneNWD);
  }
}
