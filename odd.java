import java.util.*;
import java.lang.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	int a;
      Scanner in = new Scanner(System.in);
      a = in.nextInt();
      if(a>0)
     {
      if (a % 2 == 0)
      {
         System.out.println("even");
      }
      else
      {
         System.out.println("odd");
      }
	}
	else
	{
		System.out.println("invalid");
	}
   }
}
