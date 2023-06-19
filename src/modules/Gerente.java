package modules;

public class Gerente extends Funcionario{
	
	public Gerente() {
		super();
	}
	public Gerente(String nome, String departamento, char sexo, int idade, double salario) {
		super(nome, departamento, sexo, idade,salario);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void bonificacaoGerente() {
		// TODO Auto-generated method stub
		super.bonificacaoGerente();
	}
}
