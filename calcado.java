package recursos;


public class calcado {
	
	/*Atributos*/
	private String nome;
	private String marca;
	private String modelo;
	private int numero;
	private String material;
	
	/*Contrutor*/
	public calcado (String nome, String marca, String modelo, int numero, String material) {
		
		this.nome = nome;
		this.marca = marca;
		this.modelo = modelo;
		this.numero = numero;
		this.material = material;
		
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

	public String getmodelo() {
    
        return modelo;
    
    }

	public void setmodelo(String modelo) {
    
        this.modelo = modelo;
    
    }

	public int getnumero() {
    
        return numero;
    
    }

	public void setnumero(int numero) {
    
        this.numero = numero;
    
    }

	public String getmaterial() {
    
        return material;
    
    }

	public void setmaterial(String material) {
    
        this.material = material;
    
    }

    
    /*Metodos de Classe*/
	public static void calcar() {
		
		System.out.println("Uma pessoa calçou o calçado!");
		
	}
    
    public static void amarrar() {
		
		System.out.println("Uma pessoa amarrou o calçado!");
		
    }
    
    public static void tirar() {
		
		System.out.println("Uma pessoa tirou o calcado!");
		
    }
    
}
