import javax.swing.*;

import java.awt.*;

public class ExtrairEstatistica extends JFrame{
	JLabel frase;
	JButton Imprimir;
	JButton Voltar;
	JButton Terminar;
	JPanel Botoes;
	JPanel Principal;
	JPanel Conteudo;
	
	ExtrairEstatistica(){
		super("Extrair Estatistica");
		frase = new JLabel("<IDENTIFICAÇÃO DO USUARIO> - Extrair Estatística do Terminal");
		frase.setHorizontalAlignment(0);
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
	}
}
