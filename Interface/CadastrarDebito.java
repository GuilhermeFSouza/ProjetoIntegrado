import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class CadastrarDebito extends JFrame{
	private JLabel frase;
	private JLabel lblCodOperadora;
	private JLabel lblCodConsumidor;
	private JLabel lblDataDebito;
	private JTextField FieldCodOperadora;
	private JTextField FieldCodConsumidor;
	private JTextField FieldDataDebito;
	private JButton btCadastrar;
	private JButton btVoltar;
	private JPanel Botoes;
	private JPanel Campos;
	private JPanel Principal;
	private JPanel Direita;
	private JPanel Esquerda;
	private JPanel Centro;
	
	CadastrarDebito(){
		super("Cadastrar Débito Automático");
		frase = new JLabel("<NOME DO CLIENTE> - Cadastrar Débito Automático");
		frase.setHorizontalAlignment(0);
			Botoes = new JPanel();
				Botoes.setLayout(new FlowLayout(FlowLayout.RIGHT));
				btCadastrar = new JButton("Cadastrar");
				btVoltar = new JButton("Voltar");
				Botoes.add(btCadastrar);
				Botoes.add(btVoltar);
			lblCodConsumidor = new JLabel("Cód. Consumidor");
			lblCodOperadora = new JLabel("Cód. da Operadora");
			lblDataDebito = new JLabel("Data de Débito");
			FieldCodConsumidor = new JTextField("Cons");
			FieldCodOperadora = new JTextField(20);
			FieldDataDebito = new JTextField("Deb");
			/*Esquerda = new JPanel();
				Esquerda.setLayout(new GridLayout(3,1,10,10));
				Esquerda.add(lblCodOperadora);
				Esquerda.add(lblDataDebito);
				Esquerda.add(lblCodConsumidor);
			Direita = new JPanel();
				Direita.setLayout(new GridLayout(3,1,10,10));
				Direita.add(FieldCodConsumidor);
				Direita.add(FieldCodOperadora);
				Direita.add(FieldDataDebito);
				*/
			Centro = new JPanel();
				Centro.setLayout(new GridLayout(3,2,10,200));
				
				Centro.add(lblCodOperadora);
				Centro.add(FieldCodOperadora);
				
				Centro.add(lblCodConsumidor);
				Centro.add(FieldCodConsumidor);
				
				Centro.add(lblDataDebito, BorderLayout.AFTER_LAST_LINE);
				Centro.add(FieldDataDebito, BorderLayout.EAST);
				
				//Centro.setBounds(30, 30, 400, 400);
			Campos = new JPanel();
				Campos.setLayout(new BorderLayout());
				//Campos.add(BorderLayout.WEST,Esquerda);
				//Campos.add(BorderLayout.EAST, Direita);
		Principal = new JPanel();
			Principal.setLayout(new BorderLayout());
			Principal.add(BorderLayout.NORTH, frase);
			Principal.add(BorderLayout.CENTER, Centro);
			Principal.add(BorderLayout.SOUTH, Botoes);
				getContentPane().add(Principal);
				setDefaultCloseOperation(EXIT_ON_CLOSE);
				setSize(800, 600);
				setVisible(true);
	}

public static void main(String[] args) {
	CadastrarDebito cd = new CadastrarDebito();
	cd.setVisible(true);
	//cd.pack();
}
}

