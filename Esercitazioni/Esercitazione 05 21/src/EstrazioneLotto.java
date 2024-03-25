import java.util.Random; 
public class EstrazioneLotto {
	static Random a = new Random();
	
	public static int estrainumero(){
		int b = 1 + a.nextInt(90);
		return b ;
	}
	
	public static void verificaestrazione( int[] v , int i){
		for ( int j=0 ; j<i ; j++){
			if (v[i]==v[j]){
				v[i]=estrainumero();
				verificaestrazione(v,i);
			}
		}
	}
	
	public static void main(String[] args) {
		
		int[] v = {0,0,0,0,0} ;	
		
		for ( int i=0 ; i<5 ; i++){
			v[i]=estrainumero();
			verificaestrazione(v,i);
		}
		
		System.out.print("i numeri estratti sono ");
		for ( int i=0 ; i<5 ; i++){
			System.out.print(v[i]+ " , ");
		}
	}
}