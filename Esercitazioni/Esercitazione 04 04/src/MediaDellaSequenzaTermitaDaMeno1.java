import java.util.Scanner;
public class MediaDellaSequenzaTermitaDaMeno1 {
static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num = 0 ;
int somma = 0 ;
int cont = 0 ;
while (num!=-1){
	num = input.nextInt();
	somma = somma + num ;
	cont++; }

System.out.println("la media è " + somma/cont);
}}