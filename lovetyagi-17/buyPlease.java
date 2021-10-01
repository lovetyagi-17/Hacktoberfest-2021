// package Hacktoberfest-2021.lovetyagi-17;
import java.util.Scanner;
public class buyPlease {
  public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner input = new Scanner(System.in) ;
		try {
            int a = input.nextInt();
            int b = input.nextInt();
            int x = input.nextInt();
            int y = input.nextInt();

            int result = a * x + b * y;
            System.out.println(result);
		} catch(Exception e) {
	        return;
	    }

	}

}
