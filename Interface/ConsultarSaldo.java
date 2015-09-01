import javax.swing.*;

import java.awt.*;

public class ConsultarSaldo extends JFrame{
	private JLabel frase;
	private JLabel lblData;
	private JLabel lblSaldoAtual;
	private JLabel lblLimite;
	private JButton Imprimir;
	private JButton Terminar;
	private JButton Voltar;
	private JPanel Conteudo;
	private JPanel Botoes;
	private JPanel Principal;
	private JMenu menu;
	private JMenuItem imprimir;
	private JMenuItem sair;
	private JMenuBar bar;
	
		ConsultarSaldo(){
			super("Consultar Saldo");
			frase = new JLabel("<NOME DO CLIENTE> - Consultar Saldo");
			frase.setHorizontalAlignment(0);
			lblLimite = new JLabel("LImite de Crédito Disponível: $yyy.yyy,yy");
			lblData = new JLabel("Saldo Consultado em dd/mm/aaaa ");
			lblSaldoAtual = new JLabel("Saldo Disponível: $ xxx.xxx,xx");
			Imprimir = new JButton("Imprimir");
			Terminar = new JButton("Terminar");
			Voltar = new JButton("Voltar");
			Conteudo = new JPanel();
			Botoes = new JPanel();
			Principal = new JPanel();
			menu = new JMenu("Opções");
			imprimir = new JMenuItem("Imprimir");
			sair = new JMenuItem("Sair");
			
			Conteudo.setLayout(new GridLayout(3,1,10,10));
			Conteudo.add(lblData);
			Conteudo.add(lblSaldoAtual);
			Conteudo.add(lblLimite);
			lblData.setHorizontalAlignment(0);
			lblSaldoAtual.setHorizontalAlignment(0);
			lblData.setVerticalAlignment(0);
			lblSaldoAtual.setVerticalAlignment(0);
			lblLimite.setHorizontalAlignment(0);
			lblLimite.setVerticalTextPosition(JLabel.TOP);
			Botoes.setLayout(new FlowLayout(FlowLayout.RIGHT));
			Botoes.add(Imprimir);
			Botoes.add(Terminar);
			Botoes.add(Voltar);
			
			bar = new JMenuBar();
				setJMenuBar(bar);
				bar.add(menu);
				menu.add(imprimir);	
				menu.add(sair);
			
			Principal.setLayout(new BorderLayout());
			Principal.add(BorderLayout.NORTH, frase);
			Principal.add(BorderLayout.CENTER, Conteudo);
			Principal.add(BorderLayout.SOUTH, Botoes);
			
			getContentPane().add(Principal);
			//getContentPane().add(menu);
			//setDefaultCloseOperation(EXIT_ON_CLOSE);
			setSize(800, 600);
			setVisible(true);
		}
		
		public static void main(String[] args) {
			ConsultarSaldo cs = new ConsultarSaldo();
			cs.setVisible(true);
			//cs.pack();
		}
}

