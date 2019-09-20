package details.java;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Student {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String name;
		int age;
		String Degree;
		String Branch;
		int contactno;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your Name");
		name=br.readLine();
		System.out.println("Enter your age");
		age=Integer.parseInt(br.readLine());
		System.out.println("Enter your Degree");
		Degree=br.readLine();
		System.out.println("Enter your branch");
		Branch=br.readLine();
		System.out.println("Enter your contact Number");
		contactno=Integer.parseInt(br.readLine());
     System.out.println("Name:"+ name+"\n"+"Age:"+age+"\n"+"Degree:"+Degree+"\n"+"Branch:"+Branch+"\n"+"Contact:"+contactno);
	}

}
