import java.util.Scanner ;
public class Esame {
	static Scanner input = new Scanner(System.in);
	
	public static boolean met1( int[] v1 , int[] v2, int cont){
		for (int i=0 ; i<v2.length ; i++){
			int a = v1[cont];
			int b = v2[i];
			int c = b/a ;
			if (c*a==b){
				boolean condizione = false ;
				for (int j=0 ; j<v1.length ; j++){
					if (j!=cont){
						if (a==v1[j]){
							condizione = true ;
						}
					}
				}
				if (condizione){
					if (cont==v1.length-1){
						return true ;
					}
					else {
						return met1(v1,v2,cont+1);
					}
				}
				else {
					return false ;
				}
			}
		}
		return true ;
	}
	
	
	public static void main(String[] args) {
		int[] v1 = {3, 5, 6, 5, 5};
		int[] v2 = {1, 20, 8, 16, 21, 1, 13};
		System.out.println(met1(v1,v2,0));
	}
}
