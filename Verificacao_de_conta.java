public class Verificacao_de_conta {
private int conta_cliente;
private int ag;
private Cliente dataCliente;
private double saldo;

public Verificacao_de_conta(int Agencia_cliente, int Conta_cliente, Cliente Extrato_conta_cliente) {
	setConta_cliente(Agencia_cliente);
	setConta_cliente01(Conta_cliente);
	setCliente_conta_cliente(Extrato_conta_cliente);
	saldo = 0;
}

public void setConta_cliente(int Agencia_cliente) {
	ag = Agencia_cliente;
}

public int getconta_cliente() {
	return conta_cliente;
}


public int getAg() {
	return ag;
}

public void setConta_cliente01(int Conta_cliente) {
	conta_cliente = Conta_cliente;
}

public void setCliente_conta_cliente(Cliente objCli) {
	dataCliente = objCli;
}

public boolean deposito(double vlr) {
	if (vlr <= 0) {
		return false;
	}
	saldo = saldo + vlr;
	return true;
}

public boolean saque(double vlr) {
	if (vlr > saldo) {
		return false;
	}
	saldo = saldo - vlr;
	return true;
}

public Cliente getCliente() {
	return dataCliente;
}



public double getSaldo() {
	return saldo;
}





}