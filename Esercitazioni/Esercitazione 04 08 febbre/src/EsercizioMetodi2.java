import java.util.Scanner ;
public class EsercizioMetodi2 {
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

public static boolean verificaunpari(int[] primoarray) {
	boolean ceunpari = false ;
	for ( int i=0 ; i<primoarray.length ; i++){
		if ( primoarray[i]%2==0)
			ceunpari = true ;
	}
	return ceunpari ;
}

	public static void main(String[] args) {
		
		int[] primoarray = leggiarray() ;
		boolean unpari = verificaunpari(primoarray);
		
		System.out.println(unpari);
	}}