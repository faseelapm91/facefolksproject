package facegard.java;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mains {

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		String ac;
		String cot;
		String cable;
		String wifi;
		String laundry;
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Guest ne=new Guest();
		System.out.println("please choose the services required");
		System.out.println("Ac/non-Ac");
		ac=br.readLine();
		ne.setAc(ac);
		System.out.println("cot(single/Double)");
		cot=br.readLine();
		ne.setCot(cot);
		System.out.println("with cable connection/without cable connection(c/nc)");
		cable=br.readLine();
		ne.setCable(cable);
		System.out.println("wi-fi needed or not(w/nw)");
		wifi=br.readLine();
		ne.setWifi(wifi);
		System.out.println("Laundry sevice needed or not(L/nL)");
		laundry=br.readLine();
		ne.setLaundry(laundry);
		//Mains obj=new Mains(ac,cot,cable,wifi,laundry);
		
    ne.Book(ac, cot, cable, wifi,laundry);
   
    		
    		
    
	}
}
	


