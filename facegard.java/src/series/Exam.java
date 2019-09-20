package series;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;
public class Exam {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int num;
		System.out.println("Enter the number of students");
		Scanner sc=new Scanner(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		num=Integer.parseInt(br.readLine());
		System.out.println("Enter the marks of students");
		int arr[]=new int[num];
		for(int i=0;i<num;i++)
		{
			arr[i]=sc.nextInt();
		
		}
		 int count=0;
		for(int i=0;i<num;i++)
		{
		if(arr[i]<50)
		{
			 count++;
			//int total=count;
			}
			 
		
		}
		System.out.println("Number of students appearing for retest is"+count);
		
	}
	}


