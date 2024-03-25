import java.util.Scanner;
public class Esame2010 {
public static boolean verificaArray(int i , char[] v){
	int dim = v.length/2;
	if(i<dim){
		if(v[i]<'0' || v[i]>'9'){
			if(v[i]!=v[dim+i])
				return false;
		}
		else{
			if(v[dim+i]<'0' || v[dim+i]>'9')
				return false;
		}
		return verificaArray(i+1,v);
	}
	return true;
}
public static void stampa(char[] v){
	for(int i=0; i<v.length; i++)
        System.out.print(v[i] + " ");
}
public static void leggi(Scanner in , char[] v){
	for(int i=0; i<v.length; i++)
        v[i] = in.next().charAt(0);
}
	public static void main(String[] args) {
		char[] a = new char[12];
		Scanner in = new Scanner(System.in);
		System.out.println("leggi elementi");
		leggi(in,a);
		stampa(a);
		System.out.println(verificaArray(0,a));
		

	}

}
