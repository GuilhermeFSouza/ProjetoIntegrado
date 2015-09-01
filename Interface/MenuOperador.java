import javax.swing.*;

import java.awt.*;

public class MenuOperador extends JFrame{
	private JPanel Base;
	private JPanel Topo;
	private JPanel Conteudo;
	//private JPanel TopoDir;
	private JPanel TopoEsq;
	private JPanel Baixo;
	private JButton opcNotas;
	private JButton opcEstat;
	private JLabel frase;
	private JButton Cancelar;
	
	MenuOperador(){
		super("Menu Opções");
		frase = new JLabel("<NOME DO FUNCIONÁRIO>");
		opcNotas = new JButton("Extrair Relatorio de Notas");
		opcEstat = new JButton("Extrair Relatório de Estatísticas");
		Cancelar = new JButton("Cancelar");
		Base = new JPanel();
		Topo = new JPanel();
		Conteudo = new JPanel();
		TopoEsq = new JPanel();
		Baixo = new JPanel();
		TopoEsq.setLayout(new FlowLayout(FlowLayout.LEFT));
			TopoEsq.add(frase);
		Topo.setLayout(new BorderLayout());
			Topo.add(BorderLayout.WEST, TopoEsq);
		Conteudo.setLayout(new GridLayout(1,2,20,20));
			Conteudo.add(opcNotas);
			Conteudo.add(opcEstat);
		Baixo.setLayout(new FlowLayout(FlowLayout.RIGHT));
			Baixo.add(Cancelar);
		Base.setLayout(new BorderLayout());
			Base.add(BorderLayout.NORTH, Topo);
			Base.add(BorderLayout.CENTER, Conteudo);
			Base.add(BorderLayout.SOUTH, Baixo);
		this.setLayout(new GridLayout(3,1,20,20));
		this.getContentPane().add(Base);
	}
	public static void main(String[] args) {
		MenuOperador us = new MenuOperador();
		//saque.pack();
		us.setSize(800,600);
		us.setVisible(true);
	}
}
