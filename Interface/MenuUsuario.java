import javax.swing.*;

import java.awt.*;

public class MenuUsuario extends JFrame{
	private JPanel Base;
	private JPanel Topo;
	private JPanel Conteudo;
	//private JPanel TopoDir;
	private JPanel TopoEsq;
	private JPanel Baixo;
	private JButton opcSaque;
	private JButton opcSaldo;
	private JButton opcExtrato;
	private JButton opcTransf;
	private JButton opcDebito;
	private JLabel frase;
	private JButton Cancelar;
	
	MenuUsuario(){
		super("Menu Opções");
		frase = new JLabel("<NOME DO USUÁRIO>");
		opcSaque = new JButton("Saque");
		opcSaldo = new JButton("Saldo");
		opcExtrato = new JButton("Extrato");
		opcTransf = new JButton("Transferência");
		opcDebito = new JButton("Cadastrar Débito Automático");
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
		Conteudo.setLayout(new GridLayout(2,3,20,20));
			Conteudo.add(opcSaque);
			Conteudo.add(opcSaldo);
			Conteudo.add(opcExtrato);
			Conteudo.add(opcTransf);
			Conteudo.add(opcDebito);
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
		MenuUsuario us = new MenuUsuario();
		//saque.pack();
		us.setSize(800,600);
		us.setVisible(true);
	}
}
