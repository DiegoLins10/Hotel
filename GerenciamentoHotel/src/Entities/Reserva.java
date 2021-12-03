package Entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Reserva {

	private Hospede hospede;
	private String checkIn;
	private String checkOut;
	private double valor;
	
	
	public Reserva( Hospede hospede, String checkIn, String checkOut, double valor) {
		this.hospede = hospede;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		this.valor = valor;
	}

	public String getCheckIn() {
		return checkIn;
	}

	public void setCheckIn(String checkIn) {
		this.checkIn = checkIn;
	}

	public String getCheckOut() {
		return checkOut;
	}

	public void setCheckOut(String checkOut) {
		this.checkOut = checkOut;
	}

	

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Reserva ["+ " Hospede=" + hospede.getNome() + ", Cpf="+ hospede.getCpf() + ", checkIn=" + checkIn + ", checkOut="
				+ checkOut + ", valor=" + valor + "]";
	}
	
	

	
	
	
	
	
}
