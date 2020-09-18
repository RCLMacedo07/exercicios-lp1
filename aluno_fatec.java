package recursos;


public class aluno_fatec {
	
	//	Atributos
	private String nome;
	private int idade;
    private String curso;
	private int semestre;
    private int ra;
	
	/*Contrutor*/
	public aluno_fatec (String nome, int idade, String curso, int semestre, int ra) {
		
		this.nome = nome;
		this.idade = idade;
		this.curso = curso;
		this.semestre = semestre;
		this.ra = ra;
		
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

	public String getcurso() {
    
        return curso;
    
    }

	public void setcurso(String curso) {
    
        this.curso = curso;
    
    }

	public int getsemestre() {
    
        return semestre;
    
    }

	public void setsemestre(int semestre) {
    
        this.semestre = semestre;
    
    }

	public int getra() {
    
        return ra;
    
    }

	public void setra(int ra) {
    
        this.ra = ra;
    
    }

    
    /*Metodos de Classe*/
	public static void estudar() {
		
		System.out.println("O aluno está estudando!");
		
	}
    
    public static void desenvolver() {
		
		System.out.println("O aluno está desenvolvendo");
		
    }
    
    public static void assistir() {
		
		System.out.println("O aluno está assistindo aula!");
		
    }
    
}

