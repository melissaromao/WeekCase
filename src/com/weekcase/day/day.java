package com.weekcase.day;
import javax.swing.JOptionPane;

public class day {
	    public static void main(String[] args) {
	        //exibindo caixa de diálogo para o usuário inserir o dia da semana
	        String input = JOptionPane.showInputDialog("Digite o número do dia da semana (1 para Domingo, 2 para Segunda, etc.):");
	        //convertendo a entrada de string para inteiro
	        int x = Integer.parseInt(input);
	        String dia;
	        
	        //verificando o dia da semana com base no número inserido
	        switch (x) {
	            case 1: dia = "Domingo"; 
	                break;
	            case 2: dia = "Segunda"; 
	                break;
	            case 3: dia = "Terça"; 
	                break;
	            case 4: dia = "Quarta"; 
	                break;
	            case 5: dia = "Quinta"; 
	                break;
	            case 6: dia = "Sexta"; 
	                break;
	            case 7: dia = "Sábado";
	                break;
	            default: dia = "Valor Inválido."; 
	                break;
	        }
	        
	        //exibindo o resultado em uma caixa de diálogo
	        JOptionPane.showMessageDialog(null, "Hoje é " + dia);
	    }
	}