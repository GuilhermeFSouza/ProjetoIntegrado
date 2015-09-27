import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExtrairEstatistica extends JFrame implements ActionListener{
	JLabel frase;
	JButton Imprimir;
	JButton Voltar;
	JButton Terminar;
	JPanel Botoes;
	JPanel Principal;
	JPanel Conteudo;
	private ImageIcon ImgUsr;
	
	ExtrairEstatistica(){
		super("Extrair Estatistica");
		ImgUsr = new ImageIcon("Interface/login.png");
		frase = new JLabel("<IDENTIFICAÇÃO DO USUARIO> - Extrair Estatística do Terminal", ImgUsr, SwingConstants.CENTER);
		frase.setHorizontalAlignment(SwingConstants.LEFT);
		Imprimir = new JButton("Imprimir");
		Terminar = new JButton("Terminar");
		Voltar = new JButton("Voltar");
		Botoes = new JPanel();
		Principal = new JPanel();
		Conteudo = new JPanel();
		
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
		
		Voltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuOperador mo = new MenuOperador();
				dispose();
			}
		});
	}
}
