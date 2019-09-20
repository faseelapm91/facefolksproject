package sports;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
public class cricket {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int num,n;
		Scanner sc=new Scanner(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of bowlers");
		num=Integer.parseInt(br.readLine());
		System.out.println("Enter the runs conceded by the bowlers");
		int arr[]=new int[num];
		for(n=0;n<num;n++){
			{
				arr[n]=sc.nextInt();
			}
			System.out.println("Enter the number of balls for each bowler");
			int arr1[]=new int[num];
			for(int i=0;i<num;i++)
			{
				arr1[n]=sc.nextInt();
			}
			System.out.println("Economy of the bowlers is");
			double arr2[]=new double[num];
		}
		
	}

}
