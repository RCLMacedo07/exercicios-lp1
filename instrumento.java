package recursos;


public class instrumento {
	
	/*Atributos*/
	private String nome;
	private String marca;
	private float valor;
	private String tipo;
	private String familia;
	
	/*Contrutor*/
	public instrumento (String nome, String marca, float valor, String tipo, String familia) {
		
		this.nome = nome;
		this.marca = marca;
		this.valor = valor;
		this.tipo = tipo;
		this.familia = familia;
		
	}
    
    
    /*Metodos Getters e Setters*/
	public String getNome() {
        
        return nome;
    
    }

	public void setNome(String nome) {
    
        this.nome = nome;
    
    }

	public String getmarca() {
    
        return marca;
    
    }

	public void setmarca(String marca) {
    
        this.marca = marca;
    
    }

	public float getvalor() {
    
        return valor;
    
    }

	public void setvalor(float valor) {
    
        this.valor = valor;
    
    }

	public String gettipo() {
    
        return tipo;
    
    }

	public void settipo(String tipo) {
    
        this.tipo = tipo;
    
    }

	public String getfamilia() {
    
        return familia;
    
    }

	public void setfamilia(String familia) {
    
        this.familia = familia;
    
    }

    
    /*Metodos de Classe*/
	public static void tocar() {
		
		System.out.println("Uma pessoa tocou o Instrumento!");
		
	}
    
    public static void afinar() {
		
		System.out.println("Uma pessoa afinou o Instrumento!");
		
    }
    
    public static void dedilhar() {
		
		System.out.println("Uma pessoa dedilhou o Instrumento!");
		
    }
    
}
