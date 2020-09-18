package recursos;


public class lugar {
	
	/*Atributos*/
	private String nome;
	private String pais;
	private String cidade;
	private String idioma;
	private String clima;
	
	/*Contrutor*/
	public lugar (String nome, String pais, String cidade, String idioma, String clima) {
		
		this.nome = nome;
		this.pais = pais;
		this.cidade = cidade;
		this.idioma = idioma;
		this.clima = clima;
		
	}
    
    
    /*Metodos Getters e Setters*/
	public String getNome() {
        
        return nome;
    
    }

	public void setNome(String nome) {
    
        this.nome = nome;
    
    }

	public String getpais() {
    
        return pais;
    
    }

	public void setpais(String pais) {
    
        this.pais = pais;
    
    }

	public String getcidade() {
    
        return cidade;
    
    }

	public void setcidade(String cidade) {
    
        this.cidade = cidade;
    
    }

	public String getidioma() {
    
        return idioma;
    
    }

	public void setidioma(String idioma) {
    
        this.idioma = idioma;
    
    }

	public String getclima() {
    
        return clima;
    
    }

	public void clima(String clima) {
    
        this.clima = clima;
    
    }

    
    /*Metodos de Classe*/
	public static void viajar() {
		
		System.out.println("Uma pessoa viajou para o lugar!");
		
	}
    
    public static void hospedar() {
		
		System.out.println("Uma pessoa se hospedou no lugar!");
		
    }
    
    public static void atender() {
		
		System.out.println("Uma pessoa foi atendida no lugar!");
		
    }
    
}

