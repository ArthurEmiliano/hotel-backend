package hotel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.sql.rowset.spi.TransactionalWriter;

import java.time.temporal.ChronoUnit;
import java.time.LocalDate;

public class Reserva {
	String nomeCliente;
	double valorTotal;
	String resumoReserva;
	int idCliente;
	String checkIn;
	String checkOut;
	int dias;
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	public String getResumoReserva() {
		return resumoReserva;
	}
	public void setResumoReserva(String resumoReserva) {
		this.resumoReserva = resumoReserva;
	}
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public String getCheckIn() {
		return checkIn;
	}
	public void setCheckIn(String checkOut) {
		this.checkIn = checkOut;
	}
	public String getCheckOut() {
		return checkOut;
	}
	public void setCheckOut(String checkOut) {
		this.checkOut = checkOut;
	}
	
	
	
	public void transfDataIn() throws ParseException {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		Date date = formatter.parse(checkIn);
	}
	public void transfDataOut() throws ParseException {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		Date date = formatter.parse(checkOut);
	}
	
//	public int  calculoDias() {
//		dias = ChronoUnit.DAYS.between(transfDataIn(), transfDataOut());
//		return dias;
//	}
}
