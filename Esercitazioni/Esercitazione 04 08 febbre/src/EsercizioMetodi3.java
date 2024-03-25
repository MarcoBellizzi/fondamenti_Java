import java.util.Scanner;
public class EsercizioMetodi3 {
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
	
	public static boolean leggicondizione (int[]primoarray){
		boolean condizione = true ;
		for ( int i=0 ; i<primoarray.length ; i++){
			if (primoarray[i]%2==1)
				condizione = false;
		}
		
		
		return condizione ;
	}
	
	public static void main(String[] args) {
		int[] primoarray = leggiarray();
		boolean verificacondizione = leggicondizione(primoarray);
		
		System.out.println(verificacondizione);
		
		
	}}