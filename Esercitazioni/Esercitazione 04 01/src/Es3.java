import java.util.Scanner;
public class Es3 {
static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Giochiamo a morra cinese");
System.out.println("digitare il stato '1' per scegliere sasso");
System.out.println("digitare il tasto '2' per scegliere carta");
System.out.println("digitare il tasto '3' per scegliere forbici");

int primo = input.nextInt();
int secondo = input.nextInt();

if (primo<1 || primo>3 || secondo<1 || secondo >3)
	System.out.println("errore nella digitazione");
else {
    
if (primo==1) {
	if(secondo==1)
		System.out.println("avete pareggiato");
	if (secondo==2)
		System.out.println("vince il giocatore 2");
	if (secondo==3)
		System.out.println("vince il giocatore 1");}
if (primo==2){
	if (secondo==1)
		System.out.println("vince il giocatore 1");
	if (secondo==2)
		System.out.println("avete pareggiato");
	if (secondo==3)
		System.out.println("vince il giocatore 2");}
if (primo==3){
	if(secondo==1)
		System.out.println("vince il giocatore 2");
	if (secondo==2)
		System.out.println("vince il giocatore 1");
	if (secondo==3)
		System.out.println("avete pareggiato");
}}}}
