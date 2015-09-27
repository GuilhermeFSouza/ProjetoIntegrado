//Escrito em 21/04/15 - Guilherme F. Souza
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;
import java.util.ResourceBundle;

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
	public Locale locale;
	public ResourceBundle BundleLocale;
	
	public Login(Locale localeparam, ResourceBundle bundleparam){
		super(bundleparam.getString("tela.login.titulo1"));
		setLocation(localeparam, bundleparam);
		Fundo = new Color(42,45,60);
		ImgBanco = new ImageIcon("Interface/Banco");
		frase = new JLabel(BundleLocale.getString("tela.login.titulo2"), ImgBanco,SwingConstants.CENTER);
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
		labelConta = new JLabel(BundleLocale.getString("tela.login.label3"), ImgConta, SwingConstants.CENTER);
		//labelConta.setForeground(Color.white);
		labelSenha = new JLabel(BundleLocale.getString("tela.login.label4"), ImgSenha, SwingConstants.CENTER);
		labelSenha.setHorizontalTextPosition(SwingConstants.RIGHT);
		labelAgencia = new JLabel(BundleLocale.getString("tela.login.label2"), ImgAg, SwingConstants.CENTER);
		labelBanco = new JLabel(BundleLocale.getString("tela.login.label1"), SwingConstants.CENTER);
		conta = new JTextField("Login");
		agencia = new JTextField("Agência");
		senha = new JPasswordField("Senha");
		banco = new JTextField("Banco");
		ok = new JButton("OK");
		cancelar = new JButton(BundleLocale.getString("tela.button.cancelar"));
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
		
		
		ok.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GerarCodigo gc = new GerarCodigo(locale, BundleLocale);
			}
		});
	setVisible(true);
	setSize(800,600);
}

	public void setLocation(Locale locale, ResourceBundle bundle){
		this.locale = locale;
		this.BundleLocale = bundle;
	}
	/*
public static void main(String[] args){
	Login lg = new Login();
	lg.setVisible(true);
	lg.setSize(800,600);
	}*/
}
