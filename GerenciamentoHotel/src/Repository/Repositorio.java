package Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JOptionPane;

import Entities.Hospede;
import Entities.Reserva;

public class Repositorio {

	private ArrayList<Hospede> hospedes = new ArrayList<>();
	private ArrayList<Reserva> reservas = new ArrayList<>();
	private int quartos = 0;
	public Repositorio() {
		
	}
	
	public void AddHospede(Hospede hosp)
    {
        hospedes.add(hosp); // adicionando objeto a lista
    }

    public void RemoveHospede(Reserva hosp)
    {
        reservas.remove(hosp); // removendo objeto da lista
    }
    
    public void AddReserva(Reserva reserva)
    {
    	if(this.reservas.size() >= 10) {
    		JOptionPane.showMessageDialog(null, "Estamos lotados, desculpe");
    	}
    	else {
        reservas.add(reserva); // adicionando objeto a lista
        this.quartos++;
    	}
    }
        

    public void RemoveReserva(Reserva reserva)
    {
        reservas.remove(reserva); // removendo objeto da lista
        this.quartos--;
    }

	
	public String GetAllHospedes() {
		String a = "";
		for(Hospede hos : hospedes) {
			a = a + hos.toString() + "\n";
		}
		return a;
	}
	
	public String GetAllReservas() {
		String a = "";
		for(Reserva res : reservas) {
			a = a + res.toString() + "\n";
		}
		return a;
	}
	
	public int GetAllQuartosOcupados() {

		return quartos;
	}
	
	public double valorTotalReservas() {
		double total = 0.0;
		for(Reserva res : reservas) {
			total+= res.getValor();
		}
		
		return total;
	}
    
    
}
