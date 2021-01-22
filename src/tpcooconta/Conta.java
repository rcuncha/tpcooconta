package tpcooconta;

public class Conta {
private int numConta;
private String nome;
private double saldo;

public Conta () {
	
}

public Conta (int numConta,String nome) {
	this.numConta=numConta;
	this.nome=nome;
	this.saldo=0;
}
public int getNumConta() {return numConta;}
public void setNumConta(int numConta) {this.numConta=numConta;}
public String getNome() {return nome;}
public void setNome(String nome) {this.nome=nome;}
public double getSaldo() {return saldo;}

public  void depositar (double valor) {
	this.saldo=this.saldo +valor;
}
public boolean levantar(double valor) {
	if (saldo < valor) {
		return false;
	}
	else {
		this.saldo=this.saldo-valor;
		return true;
	}
	public String toString() {
		return numConta+"-"+nome+"-"+saldo;
	}
public boolean equals(conta obj) {
	if (this.numConta== obj.numConta)return true;
	else return false;
}
System.out.println("Ruchia Maria");
}
	
}

