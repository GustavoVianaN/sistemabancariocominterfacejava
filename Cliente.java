public class Cliente {
private String nome_cliente;

private String CPF;
private String endereco;
private String Celular_contato;
private Login login;



public Cliente(String n, String l, String tf, String tc, String u, String s) {
  setendereco(l);
	setnome_cliente(n);
  setCelular_contato(tc);
  setCPF(tf);
  setLogin(u, s);



}

public void setnome_cliente(String name) {
	nome_cliente = name;
}

public String getnome_cliente() {
	return nome_cliente;
}


public String getendereco() {
	return endereco;
}


public void setendereco(String log) {
	endereco = log;
}


public void setCelular_contato(String cel) {
	Celular_contato = cel;
}

public void setCPF(String cpf_cadastro) {
	CPF = cpf_cadastro;
}

public String getCPF() {
	return CPF;
}

public void setLogin(String user, String paswd) {
	login = new Login(user, paswd);
}

public String getCelular_contato() {
	return Celular_contato;
}


public String getSenha() {
	return login.getPaswdUser();
}


public String getUser() {
	return login.getNome();
}

}