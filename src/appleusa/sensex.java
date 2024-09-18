package appleusa;

public class sensex {

	String name;
	String   age;
	String address;
	
	
	public sensex(String name , String address, String age)
	{
		this.name=name;
		this.age=age;
		this.address=address;
		
	}

	public void getaddress()
	{
		System.out.println(address);
	}

	public static void main(String[] args) {
		
		
		sensex gh=new sensex("prathik","twenty","Bangalore");
				gh.getaddress();
		
	}
}