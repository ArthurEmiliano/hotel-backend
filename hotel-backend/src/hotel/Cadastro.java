package hotel;

import java.util.Date;

public class Cadastro {
	
	String nome;
	String sobrenome;
	int idade;
	String endereco;
	int ddd;
	long telefone;
	long cpf;
	Date dataDeNascimento;
	String email;
	

	public String getNome()
	{
		return nome;
	}
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	public String getSobrenome()
	{
		return sobrenome;
	}
	public void setSobrenome(String sobrenome)
	{
		this.sobrenome = sobrenome;
	}
	public int getIdade()
	{
		return idade;
	}
	public void setIdade(int idade)
	{
		this.idade= idade;
	}
	public long getCpf() {
		return cpf;
	}
	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
}
