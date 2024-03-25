import java.util.Scanner ;
public class MatriciProfGrasso {
	static Scanner input = new Scanner (System.in);
	
	public static int[][] leggimatrice(int[][] matrice){
		for (int i=0 ; i<matrice.length ; i++){
			for (int j=0 ; j<matrice[0].length ; j++){
				System.out.println("dammi l'elemento in posizione " + i + " " + j );
				matrice[i][j] = input.nextInt();
			}
		}
		return matrice;
	}
	
	public static void stampamatrice(int[][] matrice){
		for (int i=0 ; i<matrice.length ; i++){
			for (int j=0 ; j<matrice[0].length ; j++){
				System.out.print(matrice[i][j]+" ");;
			}
			System.out.println();
		}
	}

	public static void stampadiagonaleprincipale(int[][] matrice){
		for (int i=0 ; i<matrice.length ; i++){
			for (int j=0 ; j<matrice[0].length ; j++){
				if (i==j)
					System.out.print(matrice[i][j]+" ");
			}
		}
	}
	
	public static void stampadiagonaleprincipale2 (int[][] matrice){
		int i=0 ;
		while (matrice.length>i){
			System.out.println(matrice[i][i]);
			i++;
		}
	}
	
	public static int[][] calcolasomma (int[][] matrice , int[][] matrice2){
		int[][] matricesomma = new int[matrice.length][matrice[0].length];
		for (int i=0 ; i<matrice.length ; i++){
			for (int j=0 ; j<matrice[0].length ; j++){
				matricesomma[i][j] = matrice[i][j] + matrice2[i][j];
			}
		}
		return matricesomma;
	}
	
	public static boolean verificatriangolare (int[][] matrice){
		boolean triangolare = true ;
		for (int i=0 ; i<matrice.length ; i++){
			for (int j=0 ; j<matrice[0].length ; j++){
				if (i>=j)
					if (matrice[i][j]!=0)
						triangolare = false ;
			}
		}
		
		return triangolare ;
	}
	
	public static int[][] calcolatrasposta ( int [][] matrice){
		int[][] matricetrasposta = new int[matrice[0].length][matrice.length];
		for (int i=0 ; i<matrice[0].length ; i++){
			for (int j=0 ; j<matrice.length ; j++){
				matricetrasposta[i][j]=matrice[j][i];
			}
		}
		return matricetrasposta ;
	}
	
	public static int[][] cambiacolonna (int[][] matrice , int[] v , int k){
		int[][] matricecambiata = matrice;
		for (int i=0 ; i<matrice.length ; i++){
			matricecambiata[i][k] = v[i];
		}
		return matricecambiata ;
	}
	
	public static int[][] calcolacornice (int[][] matrice){
		int[][] cornice = new int[matrice.length][matrice[0].length] ;
		for (int i=0 ; i<matrice.length ; i++){
			for (int j=0 ; j<matrice[0].length ; j++){
				if (i==0 || i==matrice.length-1 || j ==0 || j == matrice[0].length-1)
					cornice[i][j]=matrice[i][j];
				else
					cornice[i][j]=0;
			}
		}
		return cornice ;
	}
	
	public static boolean verificamassimi (int[][] matrice , int[] v){
		boolean condizione =  true ;
		for ( int i=0 ; i<matrice.length ; i++){
			int max = 0 ;
			for ( int j=0 ; j<matrice.length ; j++){
				if (matrice[i][j]>max)
					max = matrice[i][j]; 
			}
			if (max!=v[i])
				condizione = false ;
		}
		return condizione ;
	}
	
	public static boolean verificamassimisulladiagonaleprincipale (int[][] matrice){
		boolean condizione = true ;
		for (int i=0 ; i<matrice.length ; i++){
			int max = matrice [i][0] ;
			for ( int j=0 ; j<matrice.length ; j++){
				if (matrice[i][j]>max)
					max = matrice[i][j];
			}
			if (matrice[i][i]!=max)
				condizione = false ;
		}
		return condizione ;
	}
	
	public static boolean verificacrescente (int[][] matrice){
		int max = (matrice[0][0]-1);
		for (int i=0 ; i<matrice.length ; i++){
			for (int j=0 ; j<matrice.length ; j++){
				if (matrice[i][j]<=max)
					return false ;
				max = matrice [i][j];
			}
		}
		return true ;
	}
	
	public static void main(String[] args) {
		System.out.println("dammi il numero di righe");
		int r = input.nextInt();
		System.out.println("dammi il numero di colonne");
		int c = input.nextInt();
		int[][] matrice02 = new int[r][c];
		int[][] matrice = leggimatrice(matrice02);
		//int[][] matrice2 = leggimatrice(matrice02);
		System.out.println("----------");
		stampamatrice(matrice);
		System.out.println("----------");
		/*
		stampamatrice(matrice2);
		System.out.println("----------");
		stampadiagonaleprincipale2(matrice);
		System.out.println("----------");
		int [][] matricesomma = calcolasomma(matrice,matrice2);
		stampamatrice(matricesomma);
		boolean triangolare = verificatriangolare(matrice);
		if (triangolare)
			System.out.println("la matrice è triangolare");
		else
			System.out.println("la matrice non è triangolare");
		int [][] matricetrasposta = calcolatrasposta(matrice);
		stampamatrice(matricetrasposta);
		
		int[] v = new int[matrice.length];
		for (int i=0 ; i<matrice.length ; i++){
			System.out.println("dammi un numero (array");
			v[i]=input.nextInt();
		}
		System.out.println("dammi k");
		int k = input.nextInt();
		int[][] matricecambiata = cambiacolonna(matrice,v,k);
		stampamatrice(matricecambiata);
		int[][] cornice = calcolacornice(matrice);
		stampamatrice(cornice);
		
		int v[] = new int[r];
		for (int i=0 ; i<r ; i++){
			System.out.println("dammi un numero (array)");
			v[i]=input.nextInt();
		}
		
		System.out.println(verificacrescente(matrice));
		*/
		int [][] matricetrasposta = calcolatrasposta(matrice);
		stampamatrice(matricetrasposta);
			
	}
}







