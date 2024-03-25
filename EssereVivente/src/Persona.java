import java.util.Scanner;

public class Persona {
	
	static Scanner input = new Scanner(System.in);
	
	private String nome;
	
	public Persona(){
		nome=" ";
	}
	
	public Persona(String n){          
		this.nome=n;                   
	}
	
	public Persona(Persona p){
		this.nome=p.nome;
	}
	
	public String getNome(){
		return nome;
	}
	
	public String toString(){
		return (nome);
	}
	
	public void inserisciNome(Scanner input){
		nome=input.next();
	}
	
	public boolean hannoLoStessoNome(Persona p){
		return this.nome.equalsIgnoreCase(p.nome);
	}
	
	public void setNome(String n){
		this.nome=n;
	}
	

}
