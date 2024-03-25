import java.util.Scanner ;
public class Libreria {
	static Scanner input = new Scanner (System.in);
	
	private String[][] libro = new String [3][20];
	
	//COSTRUTTORI
	public Libreria(){
		svuotalibreria();
	}
	
	public Libreria(String[] a , String[] b , String[] c){      //questi array devi essere già inizializzati a venti elementi
		libro[0]=a;
		libro[1]=b;
		libro[2]=c;
	}
	
	//METODI
	public void svuotalibreria(){
		for ( int i=0 ; i<libro.length ; i++){
			for ( int j=0 ; j<libro[0].length ; j++){
				libro[i][j]="";
			}
		}
	}
	
	public String[] creascaffale(){
		String[] libro = new String[20];
		for (int i=0 ; i<libro.length ; i++){
			System.out.println("dammi il libro in posizione " +i);
			libro[i]= input.nextLine();
		}
		return libro ;
	}
	
	public void inseriscilibro(int a , int b, String c){
		libro[a][b]=c;                                         //a e b sono la posizione in cui inserire ilbro
	}
	
	public String getlibro(int a, int b){
		return libro[a][b];
	}
	
	
	public static void main(String[] args) {
		
		String[] a = new String[20];
		String[] b = new String[20];
		String[] c = new String[20];
		
		c[15]="libro marco";
		
		Libreria primalibreria = new Libreria(a,b,c);
		
		System.out.println(primalibreria.getlibro(2,15));
		
		
		
		
	}
}