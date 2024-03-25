import java.util.Scanner;
public class SerieCrescenteDecrescenteMista {
static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("inserie una stringa di almeno due numeri");
boolean crescente = true ;
boolean decrescente = true ;
int prec = input.nextInt() , succ=prec;
while (prec != -1){
	succ=input.nextInt();
	if ((succ<prec)&&(succ!=-1))
		crescente = false ;
	if ((succ>prec)&&(succ!=-1))
		decrescente = false ;
	prec=succ;
}
if (crescente)
	System.out.println("la serie è crescente");
if (decrescente)
	System.out.println("la serie è decrescente");
if ((!crescente)&&(!decrescente))
	System.out.println("la serie è mista");
	
	}}