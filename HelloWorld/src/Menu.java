import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;






public class Menu {


	private String menuItem ="1.";

	public int ShowMain (){
		System.out.println("***********************");
		System.out.println("*   Menu principal    *");
		System.out.println("***********************");
		System.out.println("* 1) opcion 1         *");
		System.out.println("* 2) opcion 2         *");
		System.out.println("* 3) opcion 3         *");
		System.out.println("***********************");
		
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
		return i;
	}
	public int ShowOpt1 (){
		System.out.println("***********************");
		System.out.println("*   Opcion 1          *");
		System.out.println("***********************");
		menuItem = menuItem.concat("1.");
		return 0;
		
	}
	public int ShowOpt2 (){
		System.out.println("***********************");
		System.out.println("*   Opcion 2          *");
		System.out.println("***********************");
		menuItem = menuItem.concat("2.");
		return 0;
		
	}
	public int ShowOpt3 (){
		System.out.println("***********************");
		System.out.println("*   Opcion 3          *");
		System.out.println("***********************");
		menuItem = menuItem.concat("3.");
		return 0;
	}
}
