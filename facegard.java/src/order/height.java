package order;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

public class height 
{

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int num,n;
		double temp;
		Scanner sc=new Scanner(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number of students");
		num=Integer.parseInt(br.readLine());
		System.out.println("Enter the heights of students");
		double arr[]=new double[num];
		//Scanner sc=new Scanner(System.in);
		for(n=0;n<num;n++)
		{
			arr[n]=sc.nextDouble();
		}
			
		//System.out.println("The heights in order are");
		
       for(int k=0;k<num;k++)
       {
    	   for(int i=k;i<num;i++)
    	   {
    		   if(arr[k]>arr[i]) {
    			   temp=arr[k];
    			   arr[k]=arr[i];
    			   arr[i]=temp;
    			   
    			   }
    		   
    		   }
    			   
    	   }
       System.out.println("The heights in order are");
       for(n=0;n<num;n++)
       {
    	   System.out.println(arr[n]+" ");
       }
       }
	}


