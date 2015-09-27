import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class TelaSaque extends JFrame {
	private JLabel frase;
	private JLabel nomeCliente;
	private JTextField txtValor;
	private JButton b1;
	private JButton b2;
	private JButton b3;
	private JButton b4;
	private JButton b5;
	private JButton b6;
	private JButton sacar;
	private JButton cancelar;
	private JPanel painelTopo;
	public TelaSaque(){
		super("Saque");
		painelTopo = new JPanel();
		painelTopo.setLayout(new FlowLayout(FlowLayout.CENTER));
		frase = new JLabel("Valor: ");
		frase.setHorizontalAlignment(0);
		nomeCliente = new JLabel("<NOME DO CLIENTE>");
		nomeCliente.setHorizontalAlignment(0);
		txtValor= new JTextField("Digite o valor desejado");
		txtValor.setSize(10,50);
		painelTopo.add(nomeCliente);
		painelTopo.add(frase);
		painelTopo.add(txtValor);
		JPanel Esquerdo = new JPanel(new GridLayout(3,1));
		JPanel Direito = new JPanel(new GridLayout(3,1));
		JPanel Baixo = new JPanel(new FlowLayout());
		b1 = new JButton("R$ 10,00");
		b2 = new JButton("R$ 20,00");
		b3 = new JButton("R$ 50,00");
		b4 = new JButton("R$ 100,00");
		b5 = new JButton("R$ 200,00");
		b6 = new JButton("R$ 500,00");
		sacar = new JButton("Sacar");
		cancelar = new JButton("Cancelar");
		Esquerdo.add(b1);
		Esquerdo.add(b2);
		Esquerdo.add(b3);
		Direito.add(b4);
		Direito.add(b5);
		Direito.add(b6);
		Baixo.add(sacar);
		Baixo.add(cancelar);
		this.setLayout(new BorderLayout(100,50));
		this.getContentPane().add(painelTopo, BorderLayout.NORTH);
		this.getContentPane().add(Esquerdo, BorderLayout.WEST);
		this.getContentPane().add(Direito, BorderLayout.EAST);
		this.getContentPane().add(Baixo, BorderLayout.SOUTH);
	}
	public static void main(String[] args) {
		TelaSaque saque = new TelaSaque();
		//saque.pack();
		saque.setSize(800,600);
		saque.setVisible(true);
	}
}
