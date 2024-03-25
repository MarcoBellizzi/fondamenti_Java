import java.util.Scanner;
public class EsPasqua6 {
static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a = 1; //a=massimo
int b = 99999999 ; //b=minimo		
int d = 1;  //d=variabile per while
int primonumero=input.nextInt();
if (primonumero<=0)
	System.out.println("il primonumero non puo essere negativo");
else {	
while (d>0) {
    int c = input.nextInt(); 	
	if (c>=a)
		a=c ;
	if (c<=b && c>0)
		b=c; 
	if (c<0)
		d=c; }
if (primonumero>=a)
	System.out.println("il numero piu grande è " + primonumero );
else
	System.out.println("il numero piu grande è " + a );
if (primonumero<=b)
	System.out.println("il numero piu piccolo e " + primonumero);
else 
	System.out.println("il numero piu picccolo e " + b);	
}}}