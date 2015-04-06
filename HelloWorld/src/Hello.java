
public class Hello {
	public static void main (String[] args){
		if (args.length > 0) {
			System.out.printf("Hello World %s\n",args[0]);
		}
		else {
			System.out.println("Hello World ");
		}
		Menu mMenu = new Menu();
		int i = 0;
		i = mMenu.ShowMain();
		switch(i){
		case 0:
			System.out.flush();
			i = mMenu.ShowMain();
			break;
		case 1:
			mMenu.ShowOpt1();
			break;
		case 2:
			mMenu.ShowOpt2();
			break;
		case 3:
			mMenu.ShowOpt3();
			break;
		default:
			break;			
		}
		 
	}
}
