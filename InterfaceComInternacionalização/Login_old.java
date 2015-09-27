//Escrito em 21/04/15 - Guilherme F. Souza
import java.awt.*;
import javax.swing.*;

public class Login_old extends JFrame{
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
	
	public Login_old(){
		super("Login");
		frase = new JLabel("Digite seus dados abaixo:");
		frase.setHorizontalAlignment(0);
		JPanel Centro = new JPanel(new GridLayout(4,1,20,20) );
		JPanel Baixo = new JPanel(new FlowLayout());
		ImgAg = new ImageIcon("Interface/agencia.png");
		ImgConta = new ImageIcon("Interface/login.png");
		ImgSenha = new ImageIcon("Interface/Senha.png");
		labelConta = new JLabel(ImgConta);
		labelSenha = new JLabel(ImgSenha);
		labelAgencia = new JLabel(ImgAg);
		labelBanco = new JLabel("Banco");
		conta = new JTextField("Login");
		agencia = new JTextField("Agência");
		senha = new JPasswordField("Senha");
		banco = new JTextField("Banco");
		ok = new JButton("OK");
		cancelar = new JButton("Cancelar");
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
		this.setLayout(new BorderLayout(1,1));
		this.getContentPane().add(frase, BorderLayout.NORTH);
		this.getContentPane().add(Centro, BorderLayout.CENTER);
		this.getContentPane().add(Baixo, BorderLayout.SOUTH);
		}
}
