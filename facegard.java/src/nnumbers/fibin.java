package nnumbers;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class fibin {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int num=0,t1=0,t2=1,i,c;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number");
		num=Integer.parseInt(br.readLine());
		System.out.print("series  " + t1+" "+t2);
		for(i=2;i<num;i++)
		{
			
		c=t1+t2;
		t1=t2;
		t2=c;
		System.out.print(" "+c);
		
		}
		
		
		
		
	
			

	}

}
