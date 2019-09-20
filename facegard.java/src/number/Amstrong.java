package number;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Amstrong {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int num,temp;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number");
		num=Integer.parseInt(br.readLine());
		temp=num;
		int sum=0;
		while(temp!=0)
		{
			int t=temp%10;
			sum=sum+(t*t*t);
			temp=temp/10;
			
		}
			
		if(sum==num)
		{
			System.out.println("The given number is amstrong");
		}
		else
			System.out.println("The given number is not amstrong");

	}

}
