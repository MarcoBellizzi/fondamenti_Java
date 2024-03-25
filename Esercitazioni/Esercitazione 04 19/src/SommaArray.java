import java.util.Scanner ;
public class SommaArray {
	static Scanner input = new Scanner(System.in);
	
	public static int[] leggerearray () {
		System.out.println("dimmmi la lunghezza dell' array");
		int n = input.nextInt();
		int[] array = new int[n];
		for ( int i=0 ; i<n ; i++){
			System.out.println("dammi un numero");
			array[i]= input.nextInt();
		}
		return array ;
	}
	
	public static int[] sommaarray (int []primoarray , int[] secondoarray ) {
		int[] somma = new int[primoarray.length];
		for ( int i=0 ; i<primoarray.length ; i++) {
			somma[i]  = primoarray[i] + secondoarray[i];
		}
		return somma ;
	}
	
	public static void main(String[] args) {	
				
int [] primoarray = leggerearray() ;
int [] secondoarray = leggerearray() ;

if (primoarray.length != secondoarray.length)
	System.out.println("gli array sono diversi");
else{
	int [] somma = sommaarray (primoarray , secondoarray);
	for ( int i=0 ; i<primoarray.length ; i++){
		System.out.println(somma[i]);
	}	
}	
}}
