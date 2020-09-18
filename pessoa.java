package recursos;


public class pessoa {
	
	//	Atributos
	private String nome;
	private int idade;
	private String nacionalidade;
	private String est_civil;
	private String escolaridade;
	
	//Contrutor
	public pessoa (String nome, int idade, String nacionalidade, String est_civil, String escolaridade) {
		
		this.nome = nome;
		this.idade = idade;
		this.nacionalidade = nacionalidade;
		this.est_civil = est_civil;
		this.escolaridade = escolaridade;
		
	}
    
    
    /*Metodos Getters e Setters*/
	public String getNome() {
        
        return nome;
    
    }

	public void setNome(String nome) {
    
        this.nome = nome;
    
    }

	public int getidade() {
    
        return idade;
    
    }

	public void setidade(int idade) {
    
        this.idade = idade;
    
    }

	public String getnacionalidade() {
    
        return nacionalidade;
    
    }

	public void setnacionalidade(String nacionalidade) {
    
        this.nacionalidade = nacionalidade;
    
    }

	public String getest_civil() {
    
        return est_civil;
    
    }

	public void setest_civil(String est_civil) {
    
        this.est_civil = est_civil;
    
    }

	public String getescolaridade() {
    
        return escolaridade;
    
    }

	public void setescolaridade(String escolaridade) {
    
        this.escolaridade = escolaridade;
    
    }

    
    /*Metodos de Classe*/
	public static void andar() {
		
		System.out.println("A pessoa andou!");
		
	}
    
    public static void falar() {
		
		System.out.println("A pessoa falou!");
		
    }
    
    public static void correr() {
		
		System.out.println("A pessoa correu!");
		
    }
    
}

