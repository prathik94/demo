package appleusa;

public class partentclass extends childclass{
int a=10;
public void name() {
	
	System.out.println(super.name);
}

public void supernova()
{int a=25;

	System.out.println(a);
	int c=this.a;
	System.out.println(c);
}
	public static void main(String[] args) {
		int a=3;
		partentclass g=new partentclass();
		g.engine();
		g.audiosystem();
		System.out.println(a);
	int b=	g.amount();
	System.out.println(b);
	g.supernova();
g.name();

	}

	@Override
	public void audiosystem() {
		// TODO Auto-generated method stub
		
	}

	
	public int amount()
	{
		int a=5;
		return a;
		
	}
}
