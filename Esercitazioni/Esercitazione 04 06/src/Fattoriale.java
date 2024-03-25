import java.util.Scanner;
public class Fattoriale {
static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("inserire un numero positivo");
int num = input.nextInt() , tot = num ;

while (num>=2){
	tot=tot*(num-1);
	num--;
}
System.out.println(tot);
	
	}}