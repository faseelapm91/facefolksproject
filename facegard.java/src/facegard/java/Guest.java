package facegard.java;

public class Guest extends Mains {
	String ac;
	String cot;
	String cable;
	String wifi;
	String laundry;
	int total=0;
	public String getAc() {
		return ac;
	}
	public void setAc(String ac) {
		this.ac = ac;
	}
	public String getCot() {
		return cot;
	}
	public void setCot(String cot) {
		this.cot = cot;
	}
	public String getCable() {
		return cable;
	}
	public void setCable(String cable) {
		this.cable = cable;
	}
	public String getWifi() {
		return wifi;
	}
	public void setWifi(String wifi) {
		this.wifi = wifi;
	}
	public String getLaundry() {
		return laundry;
	}
	public void setLaundry(String laundry) {
		this.laundry = laundry;
	}
	void Book(String ac,String cot,String cable,String wifi,String laundry) {
		
		String str=ac;
		String st="ac";
		String str1="nac";
		if(str.equalsIgnoreCase(st))
		{
			total=1000;
		}
		if(str.equalsIgnoreCase(str1))
		{
			total=750;
		}
	
	String co=cot;
	String c="single";
	String c1="double";
	if(co.equalsIgnoreCase(c))
	{
		total=total;
	}
	if(co.equalsIgnoreCase(c1))
	{
		total=total+350;
	}
	String ca=cable;
	String ca1="c";
	String ca2="nc";
	if(ca.equalsIgnoreCase(ca1))
	{
		total=total+50;
	}
	if(ca.equalsIgnoreCase(ca2))
	{
		total=total;
	}

	String wi=wifi;
	String wi1="w";
	String wi2="nw";
	if(wi.equalsIgnoreCase(wi1))
	{
		total=total+200;
	}
	if(wi.equalsIgnoreCase(wi2))
	{
		total=total;
	}
	String la=laundry;
	String la1="L";
	String la2="nL";
	if(la.equalsIgnoreCase(la1))
	{
		total=total+100;
	}
	if(la.equalsIgnoreCase(la2))
	{
		total=0;
	}
	System.out.println("The total charge is "+total);
}
}


