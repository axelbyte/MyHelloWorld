
public class Hello {
	public static void main (String[] args){
		if (args.length > 0) {
			System.out.printf("Hello World, %s\n",args[0]);
		}
		else {
			System.out.println("Hello World ");
		}
		Menu mMenu = new Menu();
		int i = 0;
		i = mMenu.ShowMain();
			 
	}
}
