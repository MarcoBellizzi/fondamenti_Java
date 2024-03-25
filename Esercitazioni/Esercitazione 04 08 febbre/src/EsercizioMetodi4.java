import java.util.Scanner;
public class EsercizioMetodi4 {
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
	
	public static boolean verificacondizione ( int[] primoarray , int num ){
		boolean condizione = false ;
		for ( int i=0 ; i<primoarray.length ; i++) {
			if (primoarray[i]==num)
				condizione = true ;
		}
		
		return condizione ;
	}

	public static void main(String[] args) {
		int[] primoarray = leggiarray();
		System.out.println("inserisci un altro numero, controllerò se è presente nell array");
		int num = input.nextInt();
		boolean condizione = verificacondizione(primoarray,num);
		
		System.out.println(condizione);
		
	}}