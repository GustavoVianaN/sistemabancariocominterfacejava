public class Login {
	private String Cliente_cadastro_conta;
	private String senha;

	public Login(String Usuario_nome_cadastro, String paswd) {
		Cliente_cadastro_conta = Usuario_nome_cadastro;
		setPaswdUser(paswd);
	}

	public Login(String Usuario_nome_cadastro) {
		Cliente_cadastro_conta = Usuario_nome_cadastro;
	}

	public void setUsuario_nome_cadastro(String nameTmp) {
		Cliente_cadastro_conta = nameTmp;
	}

	public String getNome() {
		return Cliente_cadastro_conta;
	}

	public void setPaswdUser(String senha) {
		this.senha = senha;
	}

	public String getPaswdUser() {
		return senha;
	}
}