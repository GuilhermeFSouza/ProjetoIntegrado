import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RealizarSaque extends JFrame implements ActionListener{
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
	JPanel OpcBase;
	JPanel Opc;
	JPanel Opc2;
	ImageIcon ImgUsr;
	Dimension tam;
	RealizarSaque(){
		super("Realizar Saque");
		tam = new Dimension(100, 100);
		ImgUsr = new ImageIcon("Interface/login.png");
		frase = new JLabel("<NOME DO CLIENTE> - Realizar Saque" , ImgUsr, SwingConstants.CENTER);
		frase.setHorizontalAlignment(SwingConstants.LEFT);
		Imprimir = new JButton("Imprimir");
		Terminar = new JButton("Terminar");
		Voltar = new JButton("Voltar");
		Botoes = new JPanel();
		Principal = new JPanel();
		Conteudo = new JPanel(new BorderLayout());
		v10 = new JButton("R$ 10,00");
			v10.setPreferredSize(tam);
		v20 = new JButton("R$ 20,00");
			v20.setPreferredSize(tam);
		v50 = new JButton("R$ 50,00");
			v50.setPreferredSize(tam);
		v100 = new JButton("R$ 100,00");
			v100.setPreferredSize(tam);
		v200 = new JButton("R$ 200,00");
			v200.setPreferredSize(tam);
		v500 = new JButton("R$ 500,00");
			v500.setPreferredSize(tam);
		lblvalor = new JLabel("Valor: ");
		Tfvalor = new JTextField(20);
		
		Opc = new JPanel();
			Opc.setLayout(new FlowLayout());
			Opc.add(v10);
			Opc.add(v20);
			Opc.add(v50);
			Opc.add(v100);
			Opc.add(v200);
			Opc.add(v500);
		Opc2 = new JPanel(new FlowLayout());
			Opc2.add(lblvalor);
			Opc2.add(Tfvalor);
		Opc2.setAlignmentY(Opc.getAlignmentY());
	//	Conteudo.setLayout(new BorderLayout());
		OpcBase = new JPanel(new FlowLayout());
			OpcBase.add(Opc, SwingConstants.CENTER);
			OpcBase.add(Opc2);
		Conteudo.add(OpcBase, BorderLayout.CENTER);
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
		setSize(800, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Voltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuUsuario MU = new MenuUsuario();
				dispose();
			}
		});
	}
}
