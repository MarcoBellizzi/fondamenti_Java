import java.util.Scanner;
public class ElevamentoAPotenza2 {
static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("dammi due numeri");
int primo = input.nextInt() , secondo = input.nextInt() , tot=1 ;
if (primo==0 && secondo==0){
	System.out.println("errore nella digitazione");}
else{
	if (primo==0){
		System.out.println("il risultato è 0");}
	else{
		if (secondo==0){
			System.out.println("il risultato è 1");}
		else{
			if (secondo>0){
			for (int i=0 ; i<secondo ; i++){
				tot=tot*primo;
			}
			System.out.println(tot); }
			if (secondo<0){
				for ( int i=0 ; i>secondo ; i--) {
					tot=tot*primo; }
				System.out.println(" il risultato è 1/" + tot); }
			}
			
		}
    }
	}}