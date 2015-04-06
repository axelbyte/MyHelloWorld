import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Menu {
	private String menuItem ="1.";

	public int ShowMain (){
		System.out.flush();
		System.out.println("***********************");
		System.out.println("*   Menu principal    *");
		System.out.println("***********************");
		System.out.println("* 1) opcion 1         *");
		System.out.println("* 2) opcion 2         *");
		System.out.println("* 3) opcion 3         *");
		System.out.println("***********************");
		System.out.print  ("Pulse la opcion deseada:");
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		int i = 0;
		try {
			i = Integer.parseInt(br.readLine());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		switch(i){
		case 0:
			break;
		case 1:
			this.ShowOpt1();
			this.ShowMain();
			break;
		case 2:
			this.ShowOpt2();
			this.ShowMain();
			break;
		case 3:
			this.ShowOpt3();
			this.ShowMain();
			break;
		default:
			this.ShowMain();
			break;			
		}
		return i;
	}
	private int ShowOpt1 (){
		System.out.println("***********************");
		System.out.println("*   Opcion 1          *");
		System.out.println("***********************");
		menuItem = menuItem.concat("1.");
		return 0;
		
	}
	private int ShowOpt2 (){
		System.out.println("***********************");
		System.out.println("*   Opcion 2          *");
		System.out.println("***********************");
		menuItem = menuItem.concat("2.");
		return 0;
		
	}
	private int ShowOpt3 (){
		System.out.println("***********************");
		System.out.println("*   Opcion 3          *");
		System.out.println("***********************");
		menuItem = menuItem.concat("3.");
		return 0;
	}
}
