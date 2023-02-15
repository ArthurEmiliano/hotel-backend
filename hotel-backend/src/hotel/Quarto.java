package hotel;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;

public class Quarto {
	public static int setvalorDiaria;
	String nomeQuarto;
	String descricaoQuarto;
	double valorDiaria;
	double tamanho;
	int numeroQuarto;
	int qtdQuartos[];

	public Quarto() {
	}

	public Quarto(String nomeQuarto, String descricaoQuarto, double valorDiaria, double tamanho, int numeroQuarto) {
		this.nomeQuarto = nomeQuarto;
		this.descricaoQuarto = descricaoQuarto;
		this.numeroQuarto = numeroQuarto;
		this.valorDiaria = valorDiaria;
		this.tamanho = tamanho;
	}

	public String getNomeQuarto() {
		return nomeQuarto;
	}

	public void setNomeQuarto(String nomeQuarto) {
		this.nomeQuarto = nomeQuarto;
	}

	public String getDescricaoQuarto() {
		return descricaoQuarto;
	}

	public void setDescricaoQuarto(String descricaoQuarto) {
		this.descricaoQuarto = descricaoQuarto;
	}

	public double getValorDiaria() {
		return valorDiaria;
	}

	public void setValorDiaria(double valorDiaria) {
		this.valorDiaria = valorDiaria;
	}

	public double getTamanho() {
		return tamanho;
	}

	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}

	public int getNumeroQuarto() {
		return numeroQuarto;
	}

	public void setNumeroQuarto(int numeroQuarto) {
		this.numeroQuarto = numeroQuarto;
	}

	public void qtdQuartos(int i) {
		// TODO Auto-generated method stub

	}

	@Override
	public String toString() {
		return "Suíte escolhida: " + nomeQuarto + "\nDescrição: " + descricaoQuarto + "\nValor da Diária R$ "
				+ valorDiaria + "\nTamanho: " + tamanho + "m";
	}



}
