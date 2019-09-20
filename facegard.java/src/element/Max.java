package element;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;
public class Max {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int num,n;
		
		Scanner sc=new Scanner(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number of applications");
		num=Integer.parseInt(br.readLine());
		System.out.println("Enter the amount");
		int arr[]=new int[num];
		for(n=0;n<num;n++)
		{
			arr[n]=sc.nextInt();
		}
		int max = arr[0];
		for(int k=1;k<num;k++)
	       {
			if(arr[k]>max)
			{
				max=arr[k];
			}
	       }
       System.out.println("The winning bid is:" +max);

}
}
