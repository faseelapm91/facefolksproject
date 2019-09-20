package marks;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;
public class Average {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int n,total=0,average=0;
		Scanner sc=new Scanner(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number of students");
		n=Integer.parseInt(br.readLine());
		System.out.println("Enter the marks of students");
		int arr[]=new int[n];
		
		
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		
		}
		for(int i=0;i<n;i++)
		{
			total = total + arr[i];
					
		
		}
		 average=total/n;
		System.out.println("The average is"+average);
			}
	}




