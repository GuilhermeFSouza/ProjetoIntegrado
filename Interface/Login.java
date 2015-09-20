//Escrito em 21/04/15 - Guilherme F. Souza
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Login extends JFrame implements ActionListener{
	private JLabel frase;
	private JLabel labelConta;
	private JLabel labelSenha;
	private JLabel labelAgencia;
	private JLabel labelBanco;
	private JButton ok;
	private JButton cancelar;
	private JTextField conta;
	private JPasswordField senha;
	private JTextField agencia;
	private JTextField banco;
	private ImageIcon ImgConta;
	private ImageIcon ImgSenha;
	private ImageIcon ImgAg;
	private ImageIcon ImgBanco;
	private Color Fundo;
	
	public Login(){
		super("Login");
		Fundo = new Color(42,45,60);
		ImgBanco = new ImageIcon("Interface/Banco");
		frase = new JLabel("Digite seus dados abaixo:", ImgBanco,SwingConstants.CENTER);
	//	frase.setForeground(Color.WHITE);
		frase.setHorizontalTextPosition(SwingConstants.CENTER);
		frase.setIconTextGap(10);
		frase.setVerticalTextPosition(SwingConstants.BOTTOM);
		JPanel Topo = new JPanel(new FlowLayout(FlowLayout.CENTER));
		JPanel Centro = new JPanel(new GridLayout(4,1,20,10) );
		JPanel Baixo = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		ImgAg = new ImageIcon("Interface/agencia.png");
		ImgConta = new ImageIcon("Interface/login.png");
		ImgSenha = new ImageIcon("Interface/Senha.png");
		labelConta = new JLabel("Conta", ImgConta, SwingConstants.CENTER);
		//labelConta.setForeground(Color.white);
		labelSenha = new JLabel("Senha", ImgSenha, SwingConstants.CENTER);
		labelSenha.setHorizontalTextPosition(SwingConstants.RIGHT);
		labelAgencia = new JLabel("Agencia", ImgAg, SwingConstants.CENTER);
		labelBanco = new JLabel("Banco", SwingConstants.CENTER);
		conta = new JTextField("Login");
		agencia = new JTextField("Agência");
		senha = new JPasswordField("Senha");
		banco = new JTextField("Banco");
		ok = new JButton("OK");
		cancelar = new JButton("Cancelar");
		Topo.add(frase);
		Centro.add(labelBanco);
		Centro.add(banco);
		Centro.add(labelAgencia);
		Centro.add(agencia);
		Centro.add(labelConta);
		Centro.add(conta);
		Centro.add(labelSenha);
		Centro.add(senha);
		Baixo.add(ok);
		Baixo.add(cancelar);
		this.setLayout(new BorderLayout(50,50));
		this.getContentPane().add(Topo, BorderLayout.NORTH);
		this.getContentPane().add(Centro, BorderLayout.CENTER);
		this.getContentPane().add(Baixo, BorderLayout.SOUTH);
		//Background Color #487B65
	//	this.getContentPane().setBackground(Fundo);
	//	Centro.setBackground(Fundo);
	//	Topo.setBackground(Fundo);
	//	Baixo.setBackground(Fundo);
		ok.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GerarCodigo gc = new GerarCodigo();
			}
		});
	setVisible(true);
	setSize(800,600);
}


public static void main(String[] args){
	Login lg = new Login();
	lg.setVisible(true);
	lg.setSize(800,600);
	}
}
