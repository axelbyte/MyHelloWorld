
public class Hello {
	private static Menu mMenu;
	public Hello()
	{
		mMenu = new Menu();
	}
	public static void main (String[] args){
		if (args.length > 0) {
			System.out.printf("Hello World %s ",args[0]);
		}
		else {
			System.out.println("Hello World ");
		}
		mMenu.ShowMain();
	}
	
}
