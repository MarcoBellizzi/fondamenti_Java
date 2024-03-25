import java.util.Scanner;
import java.util.Random;
import java.lang.Math;
public class Cerchio {
	static Scanner input = new Scanner(System.in);
	static Random casuale = new Random();
	
	private double raggio ;
	private ClassePuntoCartesiano centro ;
	
	//COSTRUTTORI
	
	public Cerchio(){
		centro = new ClassePuntoCartesiano();
		reset();
	}
	
	public Cerchio(double a){
		raggio = a;
	}
	
	public Cerchio(ClassePuntoCartesiano a){
		centro = a;
	}
	
	public Cerchio(ClassePuntoCartesiano a, double b){
		centro = a;
		raggio = b;
	}
	
	//METODI
	
	public void reset(){
		raggio = 0;
	}
	
	public double getraggio(){
		return raggio;
	}
	
	public ClassePuntoCartesiano getcentro(){
		return centro;
	}
	
	public void setcentro(ClassePuntoCartesiano a){
		centro = a;
	}
	
	public void setraggio(double a){
		raggio = a;
	}
	
	public double calcolacirconferenza(){
		double circonferenza = this.getraggio() * 3.14 ;
		return circonferenza;
	}
	
	public double calcolaarea(){
		double area = Math.pow(this.getraggio(),2) * 3.14 ;
		return area;
	}
	
	public void riempicerchio(){
		raggio = 1+casuale.nextInt(10);
		int x = casuale.nextInt(10);
		int y = casuale.nextInt(10);
		centro = new ClassePuntoCartesiano(x,y);
	}
	
	public boolean siintersecano (Cerchio a){
		double distanzacentri = this.centro.distanzada(a.centro) ;
		double sommaraggi = this.getraggio() + a.getraggio();
		if (distanzacentri < sommaraggi)
			return true;
		else 
			return false ;
	}
	
	public static void main(String[] args) {
		
		
		ClassePuntoCartesiano origine = new ClassePuntoCartesiano();
		/*
		double r1 = 10 ;
		Cerchio cerchio1 = new Cerchio(origine,r1 );
		System.out.println(cerchio1.calcolacirconferenza());
		System.out.println(cerchio1.calcolaarea());
		*/
		
		
		System.out.println("Dammi N");
		int N = input.nextInt();
		Cerchio[] cerchi = new Cerchio[N];
		
		for(int i=0 ; i<N ; i++)
			cerchi[i]=new Cerchio();
		
		for(int i=0 ; i<N ; i++)
			cerchi[i].riempicerchio();
		
		double[] circonferenze = new double[N];
		double[] aree = new double[N];
		
		for (int i=0 ; i<N ; i++){
			circonferenze[i]=cerchi[i].calcolacirconferenza();
			aree[i]=cerchi[i].calcolaarea();
		}
		
		for (int i=0 ; i<N ; i++){
			System.out.println("il cerchio " +i+ " ha");
			System.out.println("centro = " +cerchi[i].centro.getx()+","+cerchi[i].centro.gety());
			System.out.println("raggio = "+cerchi[i].getraggio() );
			System.out.println("circonferenza = " + circonferenze[i]);
			System.out.println("area = " + aree[i]);
			System.out.println("----------");
		}
		
		Cerchio cerchio1 = new Cerchio(origine,1);
		
		ClassePuntoCartesiano centro2 = new ClassePuntoCartesiano(1,1);
		
		Cerchio cerchio2 = new Cerchio(centro2,1);
		
		System.out.println(cerchio1.siintersecano(cerchio2));
		
		
		
		
		
		
		
	}
}