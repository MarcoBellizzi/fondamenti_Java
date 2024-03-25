import java.util.Scanner ;
public class Es2 {
static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("inserisci due numeri");
int i = input.nextInt();
int j = input.nextInt();
for ( int x=0 ; x<i ; x++ ) {
	System.out.println();
	for ( int y=0 ; y<j ; y++)
		System.out.print("*");
}}}