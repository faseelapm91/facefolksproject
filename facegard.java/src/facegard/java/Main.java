package facegard.java;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
		
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
     String  name;
     String address;
     String contactNumber;
     String email;
     String proofType;
     String proofID;
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     name=br.readLine();
     address=br.readLine();
     contactNumber=br.readLine();
     email=br.readLine();
     proofType=br.readLine();
     proofID=br.readLine();
     Customer cr=new Customer(name,address,contactNumber,email,proofType,proofID);
     //Main customer=new Main(name,address,contactNumber,email,proofType,proofID);
     cr.register(name,address,contactNumber,email,proofType,proofID);
     
	}
	
}
