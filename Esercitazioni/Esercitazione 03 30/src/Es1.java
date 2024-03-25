import java.util.Scanner ;
public class Es1 {
static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("inserire il numero di variabili da inserire");
int k = input.nextInt();
System.out.println("inserire le variabili seguite dal tasto 'enter'");
int max = -9999999 ;
int inum = 0 ;
int imax = 0 ;
for ( int i = 0 ; i < k ; i++ ) {
	int num = input.nextInt();
	inum ++ ;
	if ( num > max ) {
		max = num ;
		imax = inum ; }}
System.out.println("il numero piu alto è " + max + " ed e stato inserito alla posizione " + imax); }}