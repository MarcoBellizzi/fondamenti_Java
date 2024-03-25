import java.util.Scanner;
public class Saltellare {
	static Scanner input = new Scanner(System.in);
	
	public static void saltellare (int[] v ,int x){
		if (v[x]!=-1){
			System.out.println(v[x]);
			x=v[x];
			saltellare(v,x);
		}
	}
	
	public static void main(String[] args) {
		
	int x = input.nextInt();
	int n = input.nextInt();
	int[] v = new int[n];
	saltellare(v,x);
	}
}