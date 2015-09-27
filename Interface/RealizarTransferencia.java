import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;
import java.util.ResourceBundle;

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
	public Locale locale;
	public ResourceBundle BundleLocale;
	
	RealizarTransferencia(Locale localeParam, ResourceBundle bundleParam){
		super(bundleParam.getString("tela.realizarTransferencia.titulo"));
		setLocation(localeParam, bundleParam);
		ImgUsr = new ImageIcon("Interface/login.png");
		frase = new JLabel("<NOME DO CLIENTE> - "+BundleLocale.getString("tela.realizarTransferencia.titulo"), ImgUsr, SwingConstants.CENTER);
		frase.setHorizontalAlignment(SwingConstants.LEFT);
		Imprimir = new JButton(BundleLocale.getString("tela.button.imprimir"));
		Terminar = new JButton(BundleLocale.getString("tela.button.terminar"));
		Voltar = new JButton(BundleLocale.getString("tela.button.voltar"));
		lblBanco = new JLabel(BundleLocale.getString("tela.realizarTransferencia.label1"));
		lblAgencia = new JLabel(BundleLocale.getString("tela.realizarTransferencia.label2"));
		lblConta = new JLabel(BundleLocale.getString("tela.realizarTransferencia.label3"));
		lblValor = new JLabel(BundleLocale.getString("tela.realizarTransferencia.label4"));
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
				MenuUsuario MU = new MenuUsuario(locale, BundleLocale);
				dispose();
			}
		});
		
		getContentPane().add(Principal);
		setSize(800, 600);
		setVisible(true);
	}
	
	public void setLocation(Locale locale, ResourceBundle bundle){
		this.locale = locale;
		this.BundleLocale = bundle;
	}
	
	public static void main(String[] args) {
		RealizarTransferencia lc = new RealizarTransferencia();
		lc.setVisible(true);
		lc.setSize(800,600);
		//lc.pack();
	}
}
