import java.util.Scanner ;
public class EsercizioMetodi1 {
	static Scanner input = new Scanner(System.in);

	public static int[] leggiarray () {
		
		System.out.println("inserire la lunghezza dell' array");
		int n = input.nextInt();
		int[] array = new int[n];
		for ( int i=0 ; i<n ; i++) {
			System.out.println("dammi un numero");
			array[i]=input.nextInt();
		}
		return array;
	}
	
	public static int numeripari ( int [] primoarray ) {
		int numero = 0;
		for ( int i=0 ; i<primoarray.length ; i++ ){
			if ( primoarray[i] %2==0 )
				numero++;
		}
		return numero ;
	}
	
	public static void main(String[] args) {
		
		int[] primoarray = leggiarray();
		int pari = numeripari(primoarray) ;
		
		System.out.println(pari);

	

}}