
import java.util.Scanner;
public class Prova {
	public static void linearizza(int[][] m,int x, int y, int nElementi, int[] v) {
		int conta = 0;
		for (int i = x; i < m.length; i++) {
			for (int j = y; j < m[0].length; j++) {
				if (conta >= nElementi)
					return;
				v[conta++] = m[i][j];
			}
			y=0;
		}
	}
	public static void stampa(int[][] m){
		for(int i=0; i<m.length; i++){
			for(int j=0; j<m[0].length; j++){
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static void leggi(Scanner in , int[][] m){
		for(int i=0; i<m.length; i++)
			for(int j=0; j<m[0].length; j++)
				m[i][j] = in.nextInt();
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int[][] m = new int[4][4];
        leggi(in,m);
        stampa(m);
        int[] a = new int[10];
        linearizza(m,1,1,5,a);
        for(int i=0; i<a.length; i++)
        	System.out.print(a[i] + " ");

	}

}