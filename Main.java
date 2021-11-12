import java.util.Scanner;
import javax.swing.JOptionPane;

// sistema bancario em java, não tem verificação de dados para gerente, somente arquivo básico de teste e de interface gráfica resumindo. o login e a senha do gerente pode ser qualquer coisa // 

// ficou bem simples, mas só no main já aparece mais de 4 telas e janelas de diálogo, utilizamos a java.swing.joptionpane para isso //

public class Main {
private static int Conta_cliente_cadastro;
private static int Cadastro_conta_cliente;
public static void main(String[] args) {

	Cadastro_conta_cliente = 1;

	Conta_cliente_cadastro = 0;

	JOptionPane.showMessageDialog(null, "Presiona OK para entrar na interface do gerente ");

	Scanner Cadastrar_Usuario = new Scanner(System.in);

	System.out.println("Cadastro Usuario: ");

	String Verificacao_usuario = Cadastrar_Usuario.nextLine();

	System.out.println("Senha do Usuario ");

	String Verificacao_senha = Cadastrar_Usuario.nextLine();

      JOptionPane.showMessageDialog(null, "Dados corretos. Pressione OK para entrar \n na interface do sistema");
      System.out.println(" 1 - Interface de Gerente \n 2 - Interface de cliente \n 3 - Exit");
			int Cadastro_usuario_conta_cliente = Cadastrar_Usuario.nextInt();
			if (Cadastro_usuario_conta_cliente == 1)
        JOptionPane.showMessageDialog(null, "Pressione OK para confirmar operação");
				Funcao_de_apresentacao_gerente_cliente();
			if (Cadastro_usuario_conta_cliente == 2)
        JOptionPane.showMessageDialog(null, "Pressione OK para confirmar operação");
				Interface_gerente_cliente();
		
	}

private static void Funcao_de_apresentacao_gerente_cliente() {
	Scanner Cadastrar_Usuario = new Scanner(System.in);
	System.out.println( "1 - Depositar conta");
	System.out.println( "2 - Sacar da conta");
	System.out.println( "3 - Consultar extrato");
	System.out.println( "4 - Sair");
	int Cadastrar_conta = Cadastrar_Usuario.nextInt();
}

private static void Interface_gerente_cliente() {
	String nome_pessoa_cliente_gerente, endereco, cpf, cadastro_telefone, user, paswd;

	Scanner Cadastrar_Usuario = new Scanner(System.in);
	System.out.println( "1 - Cadastrar cliente");
	System.out.println( "2 - Consultar cliente");
	System.out.println( "3 - Sair");

	int Cadastrar_conta = Cadastrar_Usuario.nextInt();

			System.out.println( "Cadastrar cliente ");
			nome_pessoa_cliente_gerente = Cadastrar_Usuario.nextLine();
			System.out.println( "Endereço do cliente Cliente.: ");
			endereco = Cadastrar_Usuario.nextLine();
			System.out.println( "cadastrar cpf ");
			cpf = Cadastrar_Usuario.nextLine();
			System.out.println( "Telefone celular.: ");
			cadastro_telefone = Cadastrar_Usuario.nextLine();
			System.out.println( "Gerente");
			user = Cadastrar_Usuario.nextLine();
			System.out.println( "Senha.: ");
			paswd = Cadastrar_Usuario.nextLine();

			Cadastro_conta_cliente++;
		
}
}