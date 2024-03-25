import java.util.Scanner;
public class NumeroPrimo {
static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("inserisci un numero");
boolean èprimo = true ;
int numero = input.nextInt(), numero2=numero , numero3=numero , i=1 ;
if (numero%2==0){
	System.out.println("il numero è pari perciò non è primo");
}
else{
	i=i-1;
while (numero3>(numero/2)){
	numero2--;
	if (numero%numero2==0){
		èprimo = false ;}
	numero3--;
	i++;
}
if (èprimo){
	System.out.println("il numero è primo");
}
else{
	System.out.println("il numero non è primo");
}}
System.out.println("sono stati fatti "+i+" confronti");
				
}}