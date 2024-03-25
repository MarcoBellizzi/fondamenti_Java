import java.util.Scanner ;
public class StampaMatrice {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		
		int n = input.nextInt();
		for ( int i=0 ; i<n ; i++){
			for ( int j=0 ; j<n ; j++){
				System.out.print(i + " " + j + "  ");
			}
			System.out.println();
		}
		
		
		
	}
}