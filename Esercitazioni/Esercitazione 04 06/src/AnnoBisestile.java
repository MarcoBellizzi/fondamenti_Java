import java.util.Scanner;
public class AnnoBisestile {
static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("immettere l anno");
int anno = input.nextInt();
if (anno%4==0){
	if (anno%100==0){
		if (anno%400==0){
			System.out.println("l'anno è bisestile");
		}
		else {
			System.out.println("l'anno non è bisestile");
		}
	}
}
else {
	System.out.println("l'anno non è bisestile");
}
		
		

}}