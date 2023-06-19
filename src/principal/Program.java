package principal;
import modules.Funcionario;
import modules.Gerente;
import modules.Secretaria;

public class Program {

	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario("Arthur","Financeiro",'M', 20, 1200);
		Funcionario gerente = new Gerente("Reginaldo","Preposto", 'M', 50, 2500);
		Funcionario secretaria = new Secretaria("John","Analista de Sistemas",'M',33, 3200);
		
		funcionario.bonificacaoFuncionarios();
		gerente.bonificacaoGerente();
		
		System.out.println(funcionario+"\n");
		System.out.println(gerente+"\n");
		System.out.println(secretaria+"\n");
	}

}
