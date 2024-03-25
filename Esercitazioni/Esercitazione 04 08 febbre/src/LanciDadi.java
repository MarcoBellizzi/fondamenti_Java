import java.util.Scanner;
import java.util.Random;
public class LanciDadi {
static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("inserire un numero");
int numero = input.nextInt();
int esecuzione = 0;
int num1=0, num2=0, num3=0, num4=0, num5=0, num6=0;
Random a = new Random();
while (numero>0) {
	esecuzione = 1 + a.nextInt(6);
	if (esecuzione==1) 
		num1++;
	if (esecuzione==2) 
		num2++;
	if (esecuzione==3)
		num3++;
	if (esecuzione==4)
		num4++;
	if (esecuzione==5)
		num5++;
	if (esecuzione==6)
		num6++;
	numero--;
}
System.out.println("il numero 1 è uscito " + num1 + " volte");
System.out.println("il numero 2 è uscito " + num2 + " volte");
System.out.println("il numero 3 è uscito " + num3 + " volte");
System.out.println("il numero 4 è uscito " + num4 + " volte");
System.out.println("il numero 5 è uscito " + num5 + " volte");
System.out.println("il numero 6 è uscito " + num6 + " volte");
}}
