import java.util.Scanner ;
public class StampaArray {
static Scanner input = new Scanner(System.in);

public static int[] leggiarray () {
	System.out.println("dimmmi la lunghezza dell' array");
	int n = input.nextInt();
	int[] array = new int[n];
	for ( int i=0 ; i<n ; i++){
		System.out.println("dammi un numero");
		array[i]= input.nextInt();
	}
	return array ;
}

	public static void main(String[] args) {
		
int[] array = leggiarray();		
int n = array.length;
for ( int i=0 ; i<n ; i++) {
	System.out.print(array[i]  + " ");
}
	}}