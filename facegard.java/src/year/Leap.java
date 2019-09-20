package year;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Leap {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		int num;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number");
		num=Integer.parseInt(br.readLine());
		if(num%400==0 || (num%4==0 &num%100!=0))
		{
			System.out.println(" It is a leap year");
		}
		else
		{
			System.out.println("it is not a leapyear");
		}

	}

}
