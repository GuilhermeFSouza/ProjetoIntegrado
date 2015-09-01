import javax.swing.*;

import java.awt.*;

public class RealizarSaque extends JFrame{
	JLabel frase;
	JButton Imprimir;
	JButton Voltar;
	JButton Terminar;
	JPanel Botoes;
	JPanel Principal;
	JPanel Conteudo;
	JButton v10; JButton v20; JButton v50; JButton v100; JButton v200; JButton v500;
	JLabel lblvalor;
	JTextField Tfvalor;
	JPanel Opc;
	
	RealizarSaque(){
		super("Realizar Saque");
		frase = new JLabel("<NOME DO CLIENTE> - Realizar Saque");
		frase.setHorizontalAlignment(0);
		Imprimir = new JButton("Imprimir");
		Terminar = new JButton("Terminar");
		Voltar = new JButton("Voltar");
		Botoes = new JPanel();
		Principal = new JPanel();
		Conteudo = new JPanel();
		v10 = new JButton("R$ 10,00");
		v20 = new JButton("R$ 20,00");
		v50 = new JButton("R$ 50,00");
		v100 = new JButton("R$ 100,00");
		v200 = new JButton("R$ 200,00");
		v500 = new JButton("R$ 500,00");
		lblvalor = new JLabel("Valor: ");
		Tfvalor = new JTextField(20);
		
		Opc = new JPanel();
			Opc.setLayout(new GridLayout(3,3,20,20));
			Opc.add(v10);
			Opc.add(v20);
			Opc.add(v50);
			Opc.add(v100);
			Opc.add(v200);
			Opc.add(v500);
			Opc.add(lblvalor);
			Opc.add(Tfvalor);
			
		Conteudo.setLayout(new BorderLayout());	
		Conteudo.add(Opc, BorderLayout.CENTER);

		Botoes.setLayout(new FlowLayout(FlowLayout.RIGHT));
		Botoes.add(Imprimir);
		Botoes.add(Terminar);
		Botoes.add(Voltar);
		
		Principal.setLayout(new BorderLayout());
		Principal.add(BorderLayout.NORTH, frase);
		Principal.add(BorderLayout.CENTER, Conteudo);
		Principal.add(BorderLayout.SOUTH, Botoes);
		
		getContentPane().add(Principal);
		setVisible(true);
	}
}
