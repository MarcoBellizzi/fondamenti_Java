import java.util.Scanner;
public class EsPasqua5 {
static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("inserire il numero di variabli da confrontare   (max 10)");

int numeroVariabili = input.nextInt();

System.out.println("inserire ogni variabile seguita dal tasto 'enter'");

int a1 = input.nextInt();
int a2 = input.nextInt();
int a3 = 0 ;
int a4 = 0 ;
int a5 = 0 ;
int a6 = 0 ;
int a7 = 0 ;
int a8 = 0 ;
int a9 = 0 ;
int a10 = 0 ;

if (numeroVariabili > 2 ) {
     a3 = input.nextInt(); }
if (numeroVariabili > 3) {
	a4 = input.nextInt(); }
if (numeroVariabili > 4 ) {
	a5 = input.nextInt(); }
if (numeroVariabili > 5 ) {
	a6 = input.nextInt(); }
if (numeroVariabili > 6 ) {
	a7 = input.nextInt(); }
if (numeroVariabili > 7 ) {
	a8 = input.nextInt(); }
if (numeroVariabili > 8 ) {
	a9 = input.nextInt(); }
if (numeroVariabili > 9) {
	a10 = input.nextInt(); }

if (a1<a2&&a1<a3&&a1<a4&&a1<a5&&a1<a6&&a1<a7&&a1<a8&&a1<a9&&a1<a10)
	System.out.println("il primo numero è il minore");
if(a2<a1&&a2<a3&&a2<a4&&a2<a5&&a2<a6&&a2<a7&&a2<a8&&a2<a9&&a2<a10)
	System.out.println("il secondo numero è il minore");
if(a3<a1&&a3<a2&&a3<a4&&a3<a5&&a3<a6&&a3<a7&&a3<a8&&a3<a9&&a3<a10)
	System.out.println("il terzo numero è il minore");
if(a4<a1&&a4<a2&&a4<a3&&a4<a5&&a4<a6&&a4<a7&&a4<a8&&a4<a9&&a4<a10)
	System.out.println("il quarto numero è il minore");
if(a5<a1&&a5<a2&&a5<a3&&a5<a4&&a5<a6&&a5<a7&&a5<a8&&a5<a9&&a5<a10)
	System.out.println("il quinto numero è il minore");
if(a6<a1&&a6<a2&&a6<a3&&a6<a4&&a6<a5&&a6<a7&&a6<a8&&a6<a9&&a6<a10)
	System.out.println("il sento numero è il minore");
if(a7<a1&&a7<a2&&a7<a3&&a7<a4&&a7<a5&&a7<a6&&a7<a8&&a7<a9&&a7<a10)
	System.out.println("il settimo numero è il minore");
if(a8<a1&&a8<a2&&a8<a3&&a8<a4&&a8<a5&&a8<a6&&a8<a7&&a8<a9&&a8<a10)
	System.out.println("l'ottavo numero è il minore");
if(a9<a1&&a9<a2&&a9<a3&&a9<a4&&a9<a5&&a9<a6&&a9<a7&&a9<a8&&a9<a10)
	System.out.println("il nono numero è il minore");
if(a10<a1&&a10<a2&&a10<a3&&a10<a4&&a10<a5&&a10<a6&&a10<a7&&a10<a8&&a10<a9)
	System.out.println("l'ultimo numero è il minore");
	}}