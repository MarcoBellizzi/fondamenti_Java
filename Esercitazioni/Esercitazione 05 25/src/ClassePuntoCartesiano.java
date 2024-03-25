import java.util.Scanner ;
import java.lang.Math;
import java.util.Random;

public class ClassePuntoCartesiano {
	static Scanner input = new Scanner(System.in);
		
		private int x , y ;
		
		//COSTRUTTORI
		public ClassePuntoCartesiano() {
			reset();
		}
		
		public ClassePuntoCartesiano(int xf, int yf) {
			x = xf ;
			y = yf ;
		}
		
		//METODI
		public void imponi(int a, int b) {
			x = a ;
			y = b ;
		}
		
		public void setx(int a){
			x = a;
		}
		
		public void sety(int a){
			y = a;
		}
		
		public void reset(){
			x = 0 ;
			y = 0 ;
		}
		
		public int getx() {
			return x ;
		}
		
		public int gety() {
			return y ;
		}
		
		public double distanzada (ClassePuntoCartesiano punto){
			
			int distanzaassex = this.x - punto.getx() ;
			int distanzaassey = this.y - punto.gety() ;
			double distanza = Math.sqrt(Math.pow(distanzaassex,2)+Math.pow(distanzaassey,2));
			return distanza ;
		}
		
		public static ClassePuntoCartesiano riempiunpunto() { 
			Random a = new Random();
			int cx = 1 + a.nextInt(10);
			int cy = 1 + a.nextInt(10);
			return new ClassePuntoCartesiano(cx,cy);
		}
		
		public static void distanzamassima ( ClassePuntoCartesiano [] v){
			double distmax = v[0].distanzada(v[1]) ;
			int i1max = 0 ;
			int i2max = 1 ;
			int j = 0 ;
			for (int i=0 ; i<v.length-1 ; i++){
				for (  ; j<v.length-1 ; j++){
					if (v[i].distanzada(v[j])>distmax){
						distmax = v[i].distanzada(v[i+1]) ;
						i1max = i+1 ;
						i2max = j+1 ;
					}
				}
				j = i+1 ;
			}
			System.out.println("la distanza massima è " + distmax + " tra i punti " + i1max + " e " + i2max);
		}
		
		public static void distanzaorigine (ClassePuntoCartesiano[] array){
			double distmax = 0 ;
			int imax = 0 ;
			for (int i=0 ; i<array.length ; i++){
				if (Math.sqrt(Math.pow(array[i].getx(),2)+ Math.pow(array[i].gety(), 2))>distmax){
					distmax = Math.sqrt(Math.pow(array[i].getx(),2)+ Math.pow(array[i].gety(), 2));
					imax = i+1 ;
				}
			}
			System.out.println("il punto con la maggiore distanza dall origine è il punto " + imax + 
					" con una distanza di " + distmax);
		}
	
	public static void main(String[] args) {
		
		/*
		ClassePuntoCartesiano punto1 = new ClassePuntoCartesiano(0,1);
		ClassePuntoCartesiano punto2 = new ClassePuntoCartesiano(1,0);
		
		System.out.println(punto1.distanzada(punto2));
		*/
		
		int N = input.nextInt();
		ClassePuntoCartesiano[] array = new ClassePuntoCartesiano[N];
		 
		for (int i=0 ; i<N ; i++){
			array[i] = riempiunpunto();
		}
		
		for (int i=0 ; i<N ; i++){
			System.out.print("il punto " + (i+1) + " è " + (array[i].getx()) + " , " + (array[i].gety())); 
			System.out.println();
		}
		System.out.println("------------------");
		distanzaorigine(array);
		System.out.println("------------------");
		distanzamassima(array);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}