package orders;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;
public class less {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
int num,n;
int temp;
Scanner sc=new Scanner(System.in);
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter a number of students");
num=Integer.parseInt(br.readLine());
System.out.println("Enter the marks of students");
int arr[]=new int[num];
//Scanner sc=new Scanner(System.in);
for(n=0;n<num;n++)
{
	arr[n]=sc.nextInt();
}
	
//System.out.println("The heights in order are");

for(int k=0;k<num;k++)
{
   for(int i=k;i<num;i++)
   {
	   if(arr[k]<arr[i]) {
		   temp=arr[k];
		   arr[k]=arr[i];
		   arr[i]=temp;
		   
		   }
	   
	   }
		   
   }
System.out.println("The priority of marks is");
for(n=0;n<num;n++)
{
   System.out.println(arr[n]+" ");
}
}
}


