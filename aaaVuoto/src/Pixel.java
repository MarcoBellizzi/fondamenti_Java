import java.util.Scanner ;
public class Pixel {

	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("inserire dimensioni matrice");
		int r = input.nextInt();
		int c = input.nextInt();
		
		double matrice[][] = new double[r][c];
		
		double matrice2[][] = new double[r][c];
		
		System.out.println("riempire la matrice");
		
		for (int i=0 ; i<r ; i++) {
			for (int j=0 ; j<c ; j++) {
				System.out.println("dammi un double");
				matrice[i][j]=input.nextInt();
			}
		}
		
		for (int i=0 ; i<r ; i++) {
			for (int j=0 ; j<c ; j++) {
				if (i==0 && j==0){
					matrice2[i][j]= ( 4*matrice[i][j] + 2*matrice[i][j+1] + matrice[i+1][j+1] + 2*matrice[i+1][j] ) /9 ;
				}
				
			}
		}
		
		
		/* 1 ker                   v    4
		 * 2 camb base             v    6
		 * 3 cinese                v    5
		 * 4 geometria             ?    3
		 * 5 bitstring             m    5     20.5
		 * 6 algebral              
		 * 7 calcolocomb           
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
