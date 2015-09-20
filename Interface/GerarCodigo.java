//Escrito em 21/04/15 - Guilherme F. Souza
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GerarCodigo extends JFrame implements ActionListener{
	private JLabel frase;
	private JLabel frase2;
	private JButton b1;
	private JButton b2;
	private JButton b3;
	private JButton b4;
	private JButton b5;
	private JButton ok;
	private JButton cancelar;
	public GerarCodigo(){
		super("Gerar Codigo");
		frase = new JLabel("Este é seu primeiro acesso, gere seu código");
		frase.setHorizontalAlignment(0);
		frase2 = new JLabel("Gere seu código selecionando os botoes abaixo:");
		frase2.setVerticalAlignment(FlowLayout.LEADING);
		frase2.setHorizontalAlignment(SwingConstants.CENTER);
		JPanel Esquerdo = new JPanel(new GridLayout(3,1));
		JPanel Centro = new JPanel(new FlowLayout(FlowLayout.CENTER, 40, 40));
		Centro.setAlignmentX(SwingConstants.CENTER);
		Centro.setAlignmentY(SwingConstants.CENTER);
		JPanel CentroGrid = new JPanel(new GridLayout(2,1,10,10));
		CentroGrid.setAlignmentX(SwingConstants.CENTER);
		CentroGrid.setAlignmentY(SwingConstants.CENTER);
		JPanel Botoes = new JPanel(new GridLayout(1, 5,10,10));
		JPanel Direito = new JPanel(new GridLayout(3,1));
		JPanel Baixo = new JPanel(new FlowLayout());
		b1 = new JButton("0 ou 1");
		b2 = new JButton("2 ou 3");
		b3 = new JButton("4 ou 5");
		b4 = new JButton("6 ou 7");
		b5 = new JButton("8 ou 9");
		ok = new JButton("OK");
		cancelar = new JButton("Cancelar");
		Centro.add(CentroGrid);
		Botoes.add(b1);
		Botoes.add(b2);
		Botoes.add(b3);
		Botoes.add(b4);
		Botoes.add(b5);
		//Botoes.setAlignmentY(BOTTOM_ALIGNMENT);
		CentroGrid.add(frase2);
		CentroGrid.add(Botoes);
		Centro.add(CentroGrid);
		/*Esquerdo.add(b1);
		Esquerdo.add(b2);
		Esquerdo.add(b3);
		Direito.add(b4);
		Direito.add(b5); */
		Baixo.add(ok);
		Baixo.add(cancelar);
		this.setLayout(new BorderLayout(10,10));
		this.getContentPane().add(frase, BorderLayout.NORTH);
		//this.getContentPane().add(frase2, BorderLayout.CENTER);
		this.getContentPane().add(Esquerdo, BorderLayout.WEST);
		this.getContentPane().add(Direito, BorderLayout.EAST);
		this.getContentPane().add(Baixo, BorderLayout.SOUTH);
		this.getContentPane().add(Centro, BorderLayout.CENTER);
		this.setVisible(true);
		this.setSize(800, 600);
		
		ok.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				MenuUsuario MU = new MenuUsuario();
			}
		});
	}
}
