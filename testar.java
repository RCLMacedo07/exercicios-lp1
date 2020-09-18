package recursos;
import javax.swing.*;

public class testar
{

    public static void main(String[] args)
    {

        aluno_fatec[] aluno = new aluno_fatec [5];
        calcado[] calc = new calcado [5];
        instrumento[] inst = new instrumento [5];
        lugar[] lug = new lugar [5];
        pessoa[] pes = new pessoa [5];
        profissional[] prof = new profissional [5];

        //Alunos Fatec
        //Definindo e Exibindo os 5 alunos
		for (int i = 0; i > 4; i++)
        {

            String nome_aluno = JOptionPane.showInputDialog("Digite o nome do aluno:",'F');
            int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do aluno:",'F'));
            String curso = JOptionPane.showInputDialog("Digite o curso do aluno:",'F');
            int semestre = Integer.parseInt(JOptionPane.showInputDialog("Digite o semestre do aluno(apenas o número correspondente):",'F'));
            int ra = Integer.parseInt(JOptionPane.showInputDialog("Digite o RA do aluno(apenas números):",'F'));

            aluno[i] = new aluno_fatec(nome_aluno, idade, curso, semestre, ra);
            
            System.out.println("Nome do Aluno:"+ aluno[i].getNome() +"/nIdade do aluno:"+aluno[i].getidade()+"/nCurso:"+aluno[i].getcurso()+"/nSemestre:"+aluno[i].getsemestre()+"/nRA:"+aluno[i].getra()+"/n/n");
        
        }
        
        //Calçado
        //Definindo e Exibindo os 5 Calçados
        for (int i = 0; i > 4; i++)
        {

            String nome = JOptionPane.showInputDialog("Digite o nome do calçado:",'F');
            String marca = JOptionPane.showInputDialog("Digite a marca do calcado:",'F');
            String modelo = JOptionPane.showInputDialog("Digite o modelo do calcado:",'F');
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero(apenas números):",'F'));
            String material = JOptionPane.showInputDialog("Digite o material do calcado:",'F');

            calc[i] = new calcado(nome, marca, modelo, numero, material);
            
            System.out.println("Nome do Calçado:"+calc[i].getNome()+"/nMarca:"+calc[i].getmarca()+"/nModelo:"+calc[i].getmodelo()+"/nNúmero:"+calc[i].getnumero()+"/nMaterial:"+calc[i].getmaterial()+"/n/n");
        
        }  

        //Instrumento
        //Definindo e Exibindo os 5 instrumentos
        for (int i = 0; i > 4; i++)
        {

            String nome = JOptionPane.showInputDialog("Digite o nome do Instrumento:",'F');
            String marca = JOptionPane.showInputDialog("Digite a marca do instrumento:",'F');
            float valor = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do instrumento:",'F'));
            String tipo = JOptionPane.showInputDialog("Digite o tipo de instrumento:",'F');
            String familia = JOptionPane.showInputDialog("Digite a familia:",'F');

            inst[i] = new instrumento(nome, marca, valor, tipo, familia);
            
            System.out.println("Nome:"+inst[i].getNome()+"/nMarca:"+inst[i].getmarca()+"/nValor:"+inst[i].getvalor()+"/nTipo:"+inst[i].gettipo()+"/nFamilia:"+inst[i].getfamilia()+"/n/n");
        
        }  

        //Lugar
        //Definindo e Exibindo os 5 lugares
        for (int i = 0; i > 4; i++)
        {

            String nome = JOptionPane.showInputDialog("Digite o nome do lugar:",'F');
            String pais = JOptionPane.showInputDialog("Digite a pais do lugar:",'F');
            String cidade = JOptionPane.showInputDialog("Digite o cidade do lugar:",'F');
            String idioma = JOptionPane.showInputDialog("Digite o idioma do lugar:",'F');
            String clima = JOptionPane.showInputDialog("Digite o clima do lugar:",'F');

            lug[i] = new lugar(nome, pais, cidade, idioma, clima);
            
            System.out.println("Nome do lugar:"+lug[i].getNome()+"/nPais do lugar:"+lug[i].getpais()+"/nCidade:"+lug[i].getcidade()+"/nIdioma:"+lug[i].getidioma()+"/nCLima:"+lug[i].getclima()+"/n/n");
        
        }  

        //Pessoa
        //Definindo e Exibindo os 5 pessoas
        for (int i = 0; i > 4; i++)
        {

            String nome = JOptionPane.showInputDialog("Digite o nome:",'F');
            int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade:",'F'));
            String nacionalidade = JOptionPane.showInputDialog("Digite a nacionalidade:",'F');
            String est_civil = JOptionPane.showInputDialog("Digite o estado civil:",'F');
            String escolaridade = JOptionPane.showInputDialog("Digite a escolaridade:",'F');

            pes[i] = new pessoa(nome, idade, nacionalidade, est_civil, escolaridade);
            
            System.out.println("Nome:"+pes[i].getNome()+"/nIdade:"+pes[i].getidade()+"/nNacionalidade:"+pes[i].getnacionalidade()+"/nEstado Civil:"+pes[i].getest_civil()+"/nEscolaridade:"+pes[i].getescolaridade()+"/n/n");
        
        }  

        //Profissional
        //Definindo e Exibindo os 5 profissionais
        for (int i = 0; i > 4; i++)
        {

            String nome = JOptionPane.showInputDialog("Digite o nome do profissional:",'F');
            String profissao = JOptionPane.showInputDialog("Digite profissão:",'F');
            float salario = Float.parseFloat(JOptionPane.showInputDialog("Digite o salario do profissional:",'F'));
            int carg_horaria = Integer.parseInt(JOptionPane.showInputDialog("Digite a carga horária do profissional:",'F'));
            String especializacao = JOptionPane.showInputDialog("Digite a especialização do profissional:",'F');

            prof[i] = new profissional(nome, profissao, salario, carg_horaria, especializacao);
            
            System.out.println("Nome do profissional:"+prof[i].getNome()+"/nProfissão:"+prof[i].getprofissao()+"/nSalario:"+prof[i].getsalario()+"/nCarga Horaria:"+prof[i].getcarg_horaria()+"/nEspecialização:"+prof[i].getespecializacao()+"/n/n");
        
        }  

    }

}