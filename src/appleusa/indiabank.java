package appleusa;

public class indiabank implements centralbanking{

	public static void main(String[] args) {
		centralbanking k=new indiabank();
		k.homeloans();
		k.netbanking();
		k.vehicleloans();
		indiabank b=new indiabank();
		b.getdata();
		

	}

	@Override
	public void netbanking() {
		System.out.println("homebanking");
		
	}

	@Override
	public void homeloans() {
		System.out.println("homeloans");		
	}

	@Override
	public void vehicleloans() {
		System.out.println("vehicleloans");
		
	}
	public void getdata()
	{
		int a=2;
		int b=3;
		int c=a+b;
		System.out.println(c);
	}

}
