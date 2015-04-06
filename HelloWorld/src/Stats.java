
public class Stats {
	private static int iCountMain;
	private static int iCountOpt1;
	private static int iCountOpt2;
	private static int iCountOpt3;
	
	private String totalMain (){
		return String.valueOf(iCountMain);
	}
	private String totalOpt1(){
		return String.valueOf(iCountOpt1);
	}
	private String totalOpt2(){
		return String.valueOf(iCountOpt2);
	}
	private String totalOpt3(){
		return String.valueOf(iCountOpt3);
	}
	
	public Stats(){
		iCountMain = 0;
		iCountOpt1 = 0;
		iCountOpt2 = 0;
		iCountOpt3 = 0;
	}
	
	public void CountMain(){
		iCountMain ++;
	}
	public void CountOpt1(){
		iCountOpt1 ++;
	}
	public void CountOpt2(){
		iCountOpt2 ++;
	}
	public void CountOpt3(){
		iCountOpt3 ++;
	}
	
	public void Show(){
		System.out.println("***********************");
		System.out.println("*    Estadisticas     *");
		System.out.println("***********************");
		System.out.printf("* Ventana Principal :%s*\n",this.totalMain());
		System.out.printf("* Opcion 1          :%s*\n",this.totalOpt1());
		System.out.printf("* Opcion 2          :%s*\n",this.totalOpt2());
		System.out.printf("* Opcion 3          :%s*\n",this.totalOpt3());
		System.out.println("***********************");
	}
	
}
