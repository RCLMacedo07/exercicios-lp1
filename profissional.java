package recursos;


public class profissional {
	
	/*Atributos*/
	private String nome;
	private String profissao;
	private float salario;
	private int carg_horaria;
	private String especializacao;
	
	/*Contrutor*/
	public profissional (String nome, String profissao, float salario, int carg_horaria, String especializacao) {
		
		this.nome = nome;
		this.profissao = profissao;
		this.salario = salario;
		this.carg_horaria = carg_horaria;
		this.especializacao = especializacao;
		
	}
    
    
    /*Metodos Getters e Setters*/
	public String getNome() {
        
        return nome;
    
    }

	public void setNome(String nome) {
    
        this.nome = nome;
    
    }

	public String getprofissao() {
    
        return profissao;
    
    }

	public void setprofissao(String profissao) {
    
        this.profissao = profissao;
    
    }

	public float getsalario() {
    
        return salario;
    
    }

	public void setsalario(float salario) {
    
        this.salario = salario;
    
    }

	public int getcarg_horaria() {
    
        return carg_horaria;
    
    }

	public void setcarg_horaria(int carg_horaria) {
    
        this.carg_horaria = carg_horaria;
    
    }

	public String getespecializacao() {
    
        return especializacao;
    
    }

	public void setespecializacao(String especializacao) {
    
        this.especializacao = especializacao;
    
    }

    
    /*Metodos de Classe*/
	public static void atender() {
		
		System.out.println("O profissional atendeu um cliente!");
		
	}
    
    public static void construir() {
		
		System.out.println("O profissional construiu!");
		
    }
    
    public static void desenvolver() {
		
		System.out.println("O profissional desenvolveu!");
		
    }
    
}

