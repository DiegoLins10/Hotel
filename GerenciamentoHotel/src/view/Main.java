package view;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JOptionPane;

import Entities.Hospede;
import Entities.Pessoa;
import Entities.Reserva;
import Repository.Repositorio;

public class Main {

	public static void main(String[] args) throws ParseException {

		
		String menu = "Menu de Opções\n1 - Fazer reserva\n" + "2 - Consultar informações das reservas\n3 - Consultar hospedes\n4- Quantidade de quartos ocupados\n5- Valor total das reservas\n" + "99 - Sair";
		int op = 0;
		String nome, cpf;
		long matricula;
		Date checkIn, checkout;
		Repositorio repo = new Repositorio();
		double valor;
		while(op != 99) {
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));
			switch(op) {
			case 1:
				nome = JOptionPane.showInputDialog("Qual seu nome?");
				cpf = JOptionPane.showInputDialog("Qual seu CPF?");
				Pessoa pessoa = new Pessoa(nome, cpf);
				matricula = Integer.parseInt(JOptionPane.showInputDialog("Digite sua matricula"));
				Hospede hosp = new Hospede(pessoa, matricula);
				SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
				checkIn = formato.parse(JOptionPane.showInputDialog("Digite a data de checkIn nesse formato dia/mes/ano"));
				checkout = formato.parse(JOptionPane.showInputDialog("Digite a data de checkout nesse formato dia/mes/ano"));
				repo.AddHospede(hosp);
				String checkInForm = formato.format(checkIn);
				String checkOutForm = formato.format(checkout);
				valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor da reserva"));
				Reserva reserva = new Reserva(hosp, checkInForm, checkOutForm, valor);
				repo.AddReserva(reserva);
				JOptionPane.showMessageDialog(null, "reserva feita com sucesso.");
				break;
			case 2:
				JOptionPane.showMessageDialog(null, repo.GetAllReservas());
				break;
			case 3:
				JOptionPane.showMessageDialog(null, repo.GetAllHospedes());
				break;
			case 4:
				JOptionPane.showMessageDialog(null,"Quantidade de quartos ocupados: " + repo.GetAllQuartosOcupados());
				break;
			case 5:
				JOptionPane.showMessageDialog(null,"valor total das reservas: " + String.format("%.2f", repo.valorTotalReservas()));
				break;	
			}	
		}
		

	}

}
