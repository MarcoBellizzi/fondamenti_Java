public class Personaggio {

	private String nome;
	private String tipo;
	private int level;
	private int[] statistiche = new int[3];
	private String abilit;
	private boolean attivaAbilit;
	
	public Personaggio(){
		nome=" "; 
		tipo=" ";
		level=1;
		statistiche[0]=0;    //vita
		statistiche[1]=0;    //attacco
		statistiche[2]=0;    //difesa
		abilit=" ";
		attivaAbilit=false;
	}
	
	public Personaggio(String n, String t, int l, String a){
		this.nome=n;
		this.tipo=t;
		this.level=l;
		this.abilit=a;
	}
	
	public Personaggio(Personaggio p){
		nome=p.nome;
		tipo=p.tipo;
		level=p.level;
		statistiche=p.statistiche;
		abilit=p.abilit;
		attivaAbilit=p.attivaAbilit;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public String getTipo(){
		return this.tipo;
	}
	
	public int getlevel(){
		return this.level;
	}
	
	public int[] getStatistiche(){
		return this.statistiche;
	}
	
	public String getAbilit(){
		return this.abilit;
	}
	
	public void stampaPersonaggio(){
		System.out.println("Nome: "+this.nome);
		System.out.println("Tipo: "+this.tipo);
		System.out.println("Level: "+this.level);
		System.out.println("Vita: "+this.statistiche[0]);
		System.out.println("Attacco: "+this.statistiche[1]);
		System.out.println("Difesa: "+this.statistiche[2]);
		System.out.println("Abilit�: "+this.abilit);
		
	}
	
	public void levelUp(int i){
		this.level+=i;
		this.incrementoForza(this.level,this.tipo);
	}
	
	public void incrementoForza(int l, String t){
		
		if(t.equals("curatore")){
			for(int i=0; i<l; i++){
				statistiche[0]+=2;
				statistiche[1]+=2;
				statistiche[2]+=2;
			}
		}else if(t.equals("attaccante")){
			for(int i=0; i<l; i++){
				statistiche[0]+=2;
				statistiche[1]+=3;
				statistiche[2]+=1;
			}
		}else if(t.equals("diffensore")){
			for(int i=0; i<l; i++){
				statistiche[0]+=2;
				statistiche[1]+=1;
				statistiche[2]+=3;
			}
		}else
			System.out.println("Sei scemo!!!!!");
	}
	
	public static void duello(Personaggio a, Personaggio b){
		System.out.println("Primo sfidante");
		a.stampaPersonaggio();
		
		System.out.println(("Secondo sfidante"));
		b.stampaPersonaggio();
		
		while(a.statistiche[0]>0 || b.statistiche[0]>0 ){
			if(a.statistiche[1]>b.statistiche[2])
				b.statistiche[0]-=(a.statistiche[1]-b.statistiche[2]);
			else{
				
			}
	}
	
	
	}
}




























