import java.util.function.Function;


public class Menu {
	private String menuItem ="1.";
	public void ShowMain (){
		System.out.println("***********************");
		System.out.println("*   Menu principal    *");
		System.out.println("***********************");
		System.out.println("* 1) opcion 1         *");
		System.out.println("* 2) opcion 2         *");
		System.out.println("* 3) opcion 3         *");
		System.out.println("***********************");
	}
	public void ShowOpt1 (){
		System.out.println("***********************");
		System.out.println("*   Opcion 1          *");
		System.out.println("***********************");
		menuItem = menuItem.concat("1.");
	}
	public void ShowOpt2 (){
		System.out.println("***********************");
		System.out.println("*   Opcion 2          *");
		System.out.println("***********************");
		menuItem = menuItem.concat("2.");
	}
	public void ShowOpt3 (){
		System.out.println("***********************");
		System.out.println("*   Opcion 3          *");
		System.out.println("***********************");
		menuItem = menuItem.concat("3.");
	}
}
