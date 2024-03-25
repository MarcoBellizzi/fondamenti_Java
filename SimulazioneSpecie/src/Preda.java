
public class Preda {

	private char preda;
	private Organismo[][] mondo;
	private int contatore;
	
	public Preda(){
		this.preda='O';
		this.contatore=0;
		for(int i=0; i<this.mondo.length; i++)
			for(int j=0; j<this.mondo[i].length; j++)
				this.mondo[i][j].equals(' ');
	}
	public Preda(char p, char[][] m, int cont){
		this.preda=p;
		this.contatore=cont;
		for(int i=0; i<this.mondo.length; i++)
			for(int j=0; j<this.mondo[i].length; j++)
				this.mondo[i][j].equals(m[i][j]);
	}
	public Preda(Preda p){
		this.preda=p.preda;
		this.contatore=p.contatore;
		for(int i=0; i<this.mondo.length; i++)
			for(int j=0; j<this.mondo[i].length; j++)
				this.mondo[i][j]=p.mondo[i][j];
	}
	public int getContatore(){
		return this.contatore;
	}
	public void setContatore(int cont){
		this.contatore=cont;
	}
	public static Preda vitaPreda(char p, char[][] m, int cont){
		Preda preda = new Preda(p,m,cont);
		for(int i=0; i<m.length; i++)
			for(int j=0; j<m[i].length; j++)
				if(m[i][j]==p){
					m[i][j]=Organismo.spostamento(p, m);
					cont++;
					if(cont==3)
						m[i][j]=Organismo.generazione(p, m);
				}
		return preda;
	}
}
