import javax.swing.*;

import java.awt.*;

public class RealizarTransferencia extends JFrame{
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
	
	RealizarTransferencia(){
		super("Realizar Transferencia");
		frase = new JLabel("<NOME DO CLIENTE> - Realizar Transferencia");
		frase.setHorizontalAlignment(0);
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
		
		Opc = new JPanel();
			Opc.setLayout(new GridLayout(4,2,20,20));
			Opc.add(lblBanco);
			Opc.add(tfBanco);
			Opc.add(lblAgencia);
			Opc.add(tflAgencia);
			Opc.add(lblConta);
			Opc.add(tflConta);
			Opc.add(lblValor);
			Opc.add(tflValor);
			
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
	
	public static void main(String[] args) {
		RealizarTransferencia lc = new RealizarTransferencia();
		lc.setVisible(true);
		lc.setSize(800,600);
		//lc.pack();
	}
}
