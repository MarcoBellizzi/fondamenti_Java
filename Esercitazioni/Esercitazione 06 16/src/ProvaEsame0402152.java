import java.util.Scanner;
public class ProvaEsame0402152 {
	static Scanner input = new Scanner(System.in);
	
	public static void stampaelementi(int[]v){
		boolean condizione = false ;
		int secondo = 0 ;
		int a =0 ;
		int b =0 ;
		int lunghezza =0;
		if (v.length%2==0){
			lunghezza = v.length/2 ;
		}
		else {
			lunghezza = v.length/2 +1 ;
		}
		for (int i=0 ; i<lunghezza ; i++){
			secondo = v.length - i - 1 ;
			if (i==secondo){
				System.out.println(v[i]);
			}
			else {
				a = v[i];
				b = v[secondo];
				if (a==b){
					condizione = true ;
				}
				System.out.print(a);
				System.out.print(" "+b);
				System.out.println("");
			}
		}
		System.out.println(condizione);
	}
	
	public static void main(String[] args) {
		
		int[] v = {15, 9, 7, 3, 9, 4};
		stampaelementi(v);
		
		
		
		
	}
}