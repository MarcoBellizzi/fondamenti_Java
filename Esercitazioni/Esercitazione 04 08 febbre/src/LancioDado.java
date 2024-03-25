import java.util.Random;
import java.util.Scanner;

public class LancioDado {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		Random a = new Random();
		int b = 1 + a.nextInt(6);
		int c = 1 + a.nextInt(6);
		System.out.print(b + "      ");
		System.out.print(c + "      ");

	}
}