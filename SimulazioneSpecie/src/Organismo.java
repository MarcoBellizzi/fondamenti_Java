
public class Organismo {

	private char animale;
	private char[][] mondo = new char[20][20];
	
	public Organismo(){
		this.animale=' ';
		for(int i=0; i<mondo.length; i++)
			for(int j=0; j<mondo[i].length; j++)
				this.mondo[i][j]=' ';
	}
	
	public Organismo(char animale, char[][] mondo){
		this.animale=animale;
		for(int i=0; i<mondo.length; i++)
			for(int j=0; j<mondo[i].length; j++)
				this.mondo[i][j]=mondo[i][j];
	}
	
	public Organismo(Organismo o){
		this.animale=o.animale;
		for(int i=0; i<mondo.length; i++)
			for(int j=0; j<mondo[i].length; j++)
				this.mondo[i][j]=o.mondo[i][j];
	}

	public static char spostamento(char animale, char[][] mondo){
		char m=' ';
		for(int i=0; i<mondo.length; i++)
			for(int j=0; j<mondo[i].length; j++)
				if(mondo[i][j]==animale){
					if(j-1>=0 && mondo[i][j-1]==' '){
						mondo[i][j-1]=mondo[i][j];
						mondo[i][j]=' ';
						m=mondo[i][j-1];
					}else if(i+1<=mondo.length && mondo[i+1][j]==' '){
						mondo[i+1][j]=mondo[i][j];
						mondo[i][j]=' ';
						m=mondo[i+1][j];
					}else if(j+1<=mondo[i].length && mondo[i][j+1]==' '){
						mondo[i][j+1]=mondo[i][j];
						mondo[i][j]=' ';
						m=mondo[i][j+1];
					}else if(i-1>=0 && mondo[i-1][j]==' '){
						mondo[i-1][j]=mondo[i][j];
						mondo[i][j]=' ';
						m=mondo[i-1][j];
					}
				}
		return m;
	}
	
	public static char generazione(char animale, char[][] mondo){
		char m=' ';
		for(int i=0; i<mondo.length; i++)
			for(int j=0; j<mondo[i].length; j++)
				if(mondo[i][j]==animale){
					if(j-1>=0 && mondo[i][j-1]==' '){
						mondo[i][j-1]=mondo[i][j];
						m=mondo[i][j-1];
					}
					else if(i+1<=mondo.length && mondo[i+1][j]==' '){
						mondo[i+1][j]=mondo[i][j];
						m=mondo[i+1][j];
					}
					else if(j+1<=mondo[i].length && mondo[i][j+1]==' '){
						mondo[i][j+1]=mondo[i][j];
						m=mondo[i][j+1];
					}
					else if(i-1>=0 && mondo[i-1][j]==' '){
						mondo[i-1][j]=mondo[i][j];		
						m=mondo[i-1][j];
					}
				}
		return m;
	}
	
	public static char fame(char animale, char[][] mondo){
		char c=' ';
		for(int i=0; i<mondo.length; i++)
			for(int j=0; j<mondo[i].length; j++)
				if(mondo[i][j]==animale)
					mondo[i][j]=' ';
		return c;
	}
	
	public  char[][] getMondo(){
		return this.mondo;
	}
	
	public void setMondo(char[][] mondo){
		this.mondo=mondo;
	}
}
