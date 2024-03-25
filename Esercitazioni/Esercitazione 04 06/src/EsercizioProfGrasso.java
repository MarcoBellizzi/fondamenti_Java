import java.util.Scanner ;
public class EsercizioProfGrasso {
static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("inserisci due numeri");
int a = input.nextInt();
int b = input.nextInt();
int tot = 0;

if (a>0)
for ( int i=0 ; i<a ; i++) 
	tot = tot + b ; 

if (a<0)
for ( int i=0 ; i>a ; i--) 
	tot = tot - b ; 

System.out.println(tot);
		
}}