//Escrito em 21/04/15 - Guilherme F. Souza
import java.awt.*;

import javax.swing.*;

public class GerarCodigo extends JFrame{
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
		frase2 = new JLabel("Gere seu código selecionando os botoes ao lado.");
		frase2.setHorizontalAlignment(0);
		JPanel Esquerdo = new JPanel(new GridLayout(3,1));
		JPanel Direito = new JPanel(new GridLayout(3,1));
		JPanel Baixo = new JPanel(new FlowLayout());
		b1 = new JButton("0 ou 1");
		b2 = new JButton("2 ou 3");
		b3 = new JButton("4 ou 5");
		b4 = new JButton("6 ou 7");
		b5 = new JButton("8 ou 9");
		ok = new JButton("OK");
		cancelar = new JButton("Cancelar");
		Esquerdo.add(b1);
		Esquerdo.add(b2);
		Esquerdo.add(b3);
		Direito.add(b4);
		Direito.add(b5);
		Baixo.add(ok);
		Baixo.add(cancelar);
		this.setLayout(new BorderLayout(10,10));
		this.getContentPane().add(frase, BorderLayout.NORTH);
		this.getContentPane().add(frase2, BorderLayout.CENTER);
		this.getContentPane().add(Esquerdo, BorderLayout.WEST);
		this.getContentPane().add(Direito, BorderLayout.EAST);
		this.getContentPane().add(Baixo, BorderLayout.SOUTH);
	}
}
