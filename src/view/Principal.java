package view;

import java.io.IOException;

import javax.swing.JOptionPane;

import controller.IASteam;
import controller.SteamController;

public class Principal {

	public static void main(String[] args) {
		 IASteam sc = new SteamController();
		
		 int opcao = 0;
			
			while (opcao != 9) {
				opcao = Integer.parseInt(JOptionPane.showInputDialog(
	                                                        "1 - Primeiro metodo selecionar \n"+ 
	                                                        "2 - Segundo m?todo gravar\n"+ 
	                                                        "9 - Sair "));
				
	            switch (opcao) {
	                case 1:
	                    int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano:"));
	                    String mes = JOptionPane.showInputDialog("Digite o mes:");
	                    double media = Double.parseDouble(JOptionPane.showInputDialog("Digite a media:"));
	                	String path = "c:\\temp";
	                	String name = "SteamCharts.csv";
	                    try {
	                        sc.readFile(ano, mes, media, path, name);
	                    } catch (IOException e) {
	                        JOptionPane.showMessageDialog(null, "Arquivo nao localizado!");
	                    }
	                break;

	                case 2:
	                	int anos = 2020;
	            		String meses = "january";
	                    String path1 = "D:\\Temp";
	                    String name1 = "NovoArquivo.csv";

	                    try {
	                       sc.createFile(anos, meses, path1, name1);
	                    } catch (IOException e) {
	                        JOptionPane.showMessageDialog(null, "Arquivo nao localizado!");
	                    }
	                break;

	                case 9:
						JOptionPane.showMessageDialog(null, "Finalizando o programa");
					break;
						
					default:
					    JOptionPane.showMessageDialog(null, "Opção inválida");
	            }
	        }
	    }    
}
