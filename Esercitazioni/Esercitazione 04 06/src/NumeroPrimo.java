import java.util.Scanner;
public class NumeroPrimo {
static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("inserisci un numero");
boolean �primo = true ;
int numero = input.nextInt(), numero2=numero , numero3=numero , i=1 ;
if (numero%2==0){
	System.out.println("il numero � pari perci� non � primo");
}
else{
	i=i-1;
while (numero3>(numero/2)){
	numero2--;
	if (numero%numero2==0){
		�primo = false ;}
	numero3--;
	i++;
}
if (�primo){
	System.out.println("il numero � primo");
}
else{
	System.out.println("il numero non � primo");
}}
System.out.println("sono stati fatti "+i+" confronti");
				
}}