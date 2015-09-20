import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RealizarTransferencia extends JFrame implements ActionListener{
	JLabel frase;
	JButton Imprimir;
	JButton Voltar;
	JButton Terminar;
	JLabel lblBanco;
	JLabel lblAgencia;
	JLabel lblConta;
	JLabel lblValor;
	JTextField tfBanco;
	JTextField tflAgencia;
	JTextField tflConta;
	JTextField tflValor;
	JPanel Botoes;
	JPanel Principal;
	JPanel Conteudo;
	JPanel Opc;
	ImageIcon ImgUsr;
	
	RealizarTransferencia(){
		super("Realizar Transferencia");
		ImgUsr = new ImageIcon("Interface/login.png");
		frase = new JLabel("<NOME DO CLIENTE> - Realizar Transferencia", ImgUsr, SwingConstants.CENTER);
		frase.setHorizontalAlignment(SwingConstants.LEFT);
		Imprimir = new JButton("Imprimir");
		Terminar = new JButton("Terminar");
		Voltar = new JButton("Voltar");
		lblBanco = new JLabel("Banco: ");
		lblAgencia = new JLabel("Agencia: ");
		lblConta = new JLabel("Conta: ");
		lblValor = new JLabel("Valor: ");
		tfBanco = new JTextField(10);
		tflAgencia = new JTextField(10);
		tflConta = new JTextField(10);
		tflValor = new JTextField(10);
		Botoes = new JPanel();
		Principal = new JPanel();
		Conteudo = new JPanel();
		
		Opc = new JPanel(new GridLayout(4,1,10,10));
			//Opc.setLayout(new GridLayout(4,2,20,20));
			JPanel Aux1 = new JPanel(new FlowLayout());
				Aux1.add(lblBanco);
				Aux1.add(tfBanco);
			JPanel Aux2 = new JPanel(new FlowLayout());
				Aux2.add(lblAgencia);
				Aux2.add(tflAgencia);
			JPanel Aux3 = new JPanel(new FlowLayout());
				Aux3.add(lblConta);
				Aux3.add(tflConta);
			JPanel Aux4 = new JPanel(new FlowLayout());
				Aux4.add(lblValor);
				Aux4.add(tflValor);
			Opc.add(Aux1);
			Opc.add(Aux2);
			Opc.add(Aux3);
			Opc.add(Aux4);
		Conteudo.setLayout(new FlowLayout());	
		Conteudo.add(Opc);
		Opc.setAlignmentX(SwingConstants.CENTER);
		Opc.setAlignmentY(SwingConstants.BOTTOM);
		Botoes.setLayout(new FlowLayout(FlowLayout.RIGHT));
		Botoes.add(Imprimir);
		Botoes.add(Terminar);
		Botoes.add(Voltar);
		
		Principal.setLayout(new BorderLayout());
		Principal.add(BorderLayout.NORTH, frase);
		Principal.add(BorderLayout.CENTER, Conteudo);
		Principal.add(BorderLayout.SOUTH, Botoes);
	//	Principal.add(BorderLayout.EAST, j1);
	//	Principal.add(BorderLayout.WEST, j2);
		
		Voltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuUsuario MU = new MenuUsuario();
				dispose();
			}
		});
		
		getContentPane().add(Principal);
		setSize(800, 600);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		RealizarTransferencia lc = new RealizarTransferencia();
		lc.setVisible(true);
		lc.setSize(800,600);
		//lc.pack();
	}
}
