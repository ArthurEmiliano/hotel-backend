package hotel;

import java.sql.Date;

public class Pagamento {
	
	String formaDePagamento;
	Date dataDoPagamento;
	double valorDiaria;
	long numeroCartao;
	String validade;
	int controle;
	String nomeImpresso;
	
	public String getFormaDePagamento() {
		return formaDePagamento;
	}
	public void setFormaDePagamento(String formaDePagamento) {
		this.formaDePagamento = formaDePagamento;
	}
	public Date getDataDoPagamento() {
		return dataDoPagamento;
	}
	public void setDataDoPagamento(Date dataDoPagamento) {
		this.dataDoPagamento = dataDoPagamento;
	}
	public long getNumeroCartao() {
		return numeroCartao;
	}
	public void setNumeroCartao(long numeroCartao) {
		this.numeroCartao = numeroCartao;
	}
	public int getControle() {
		return controle;
	}
	public void setControle(int controle) {
		this.controle = controle;
	}
	public String getValidade() {
		return validade;
	}
	public void setValidade(String validade) {
		this.validade = validade;
	}
	public String getNomeImpresso() {
		return nomeImpresso;
	}
	public void setNomeImpresso(String nomeImpresso) {
		this.nomeImpresso = nomeImpresso;
	}
	public void processaPagamento() {
		
	}
	public void cancelarPagamento() {
		
	}
	public void verificaHistoricoPagamento() {
		
	}

}
