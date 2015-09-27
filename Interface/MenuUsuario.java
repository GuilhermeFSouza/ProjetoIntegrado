import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;
import java.util.ResourceBundle;

public class MenuUsuario extends JFrame implements ActionListener{
	private JPanel Base;
	private JPanel Topo;
	private JPanel Conteudo;
	private JPanel BaixoDir;
	private JPanel TopoEsq;
	private JPanel Baixo;
	private JButton opcSaque;
	private JButton opcSaldo;
	private JButton opcExtrato;
	private JButton opcTransf;
	private JButton opcDebito;
	private JLabel frase;
	private JButton Cancelar;
	private ImageIcon ImgUsr;
	private ImageIcon ImgSaque;
	private ImageIcon ImgSaldo;
	private ImageIcon ImgExtrato;
	private ImageIcon ImgTransf;
	private ImageIcon ImgDebito;
	public Locale locale;
	public ResourceBundle BundleLocale;
	MenuUsuario(Locale localeParam, ResourceBundle bundleParam){
		super(bundleParam.getString("tela.menuOpcoes.titulo"));
		setLocation(localeParam, bundleParam);
		ImgUsr = new ImageIcon("Interface/login.png");
		ImgSaque = new ImageIcon("Interface/saque");
		ImgSaldo = new ImageIcon("Interface/saldo");
		ImgExtrato = new ImageIcon("Interface/extrato");
		ImgTransf = new ImageIcon("Interface/transferencia");
		ImgDebito = new ImageIcon("Interface/debitoAut");
		frase = new JLabel("<NOME DO CLIENTE>", ImgUsr, SwingConstants.CENTER);
		opcSaque = new JButton(BundleLocale.getString("tela.menuOpcoes.button1"));
			opcSaque.setIcon(ImgSaque);
		opcSaldo = new JButton(BundleLocale.getString("tela.menuOpcoes.button2"));
			opcSaldo.setIcon(ImgSaldo);
		opcExtrato = new JButton(BundleLocale.getString("tela.menuOpcoes.button5"));
			opcExtrato.setIcon(ImgExtrato);
		opcTransf = new JButton(BundleLocale.getString("tela.menuOpcoes.button3"));
			opcTransf.setIcon(ImgTransf);
		opcDebito = new JButton(BundleLocale.getString("tela.menuOpcoes.button4"));
			opcDebito.setIcon(ImgDebito);
			
		Cancelar = new JButton(BundleLocale.getString("tela.button.cancelar"));
		Base = new JPanel();
		Topo = new JPanel();
		Conteudo = new JPanel();
		TopoEsq = new JPanel();
		Baixo = new JPanel(new BorderLayout());
		BaixoDir = new JPanel(new FlowLayout(SwingConstants.LEFT));
		TopoEsq.setLayout(new FlowLayout(FlowLayout.LEFT));
			TopoEsq.add(frase);
		Topo.setLayout(new BorderLayout());
			Topo.add(BorderLayout.WEST, TopoEsq);
		Conteudo.setLayout(new FlowLayout(FlowLayout.CENTER));
			Conteudo.add(opcSaque);
			Conteudo.add(opcSaldo);
			Conteudo.add(opcExtrato);
			Conteudo.add(opcTransf);
			Conteudo.add(opcDebito);
		BaixoDir.add(Cancelar);
		Baixo.add(BaixoDir, BorderLayout.SOUTH);
		Base.setLayout(new BorderLayout());
			Base.add(BorderLayout.NORTH, Topo);
			Base.add(BorderLayout.CENTER, Conteudo);
			Base.add(BorderLayout.SOUTH, Baixo);
			
		this.setLayout(new GridLayout(3,1,20,20));
		this.getContentPane().add(Topo, BorderLayout.NORTH);
		this.getContentPane().add(Conteudo, BorderLayout.CENTER);
		this.getContentPane().add(Baixo, BorderLayout.SOUTH);
		this.setVisible(true);
		this.setSize(800, 600);
		
	opcSaque.addActionListener(new ActionListener() {
		
		public void actionPerformed(ActionEvent e) {
			RealizarSaque sq = new RealizarSaque(locale, BundleLocale);
			dispose();
		}
	});
	opcSaldo.addActionListener(new ActionListener() {
		
		public void actionPerformed(ActionEvent e) {
			ConsultarSaldo cs = new ConsultarSaldo(locale, BundleLocale);
			dispose();
		}
	});
	opcExtrato.addActionListener(new ActionListener() {

		public void actionPerformed(ActionEvent e) {
			TelaExtrato TE = new TelaExtrato(locale, BundleLocale);
			dispose();
		}
	});
	
	opcTransf.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			RealizarTransferencia RT = new RealizarTransferencia(locale, BundleLocale);
			dispose();
		}
	});
	
	opcDebito.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			CadastrarDebito CD = new CadastrarDebito(locale, BundleLocale);
			dispose();
		}
	});
	
	}
	
	public void setLocation(Locale locale, ResourceBundle bundle){
		this.locale = locale;
		this.BundleLocale = bundle;
	}
	
	public static void main(String[] args) {
		MenuUsuario us = new MenuUsuario();
		//saque.pack();
		us.setSize(800,600);
		us.setVisible(true);
	}
}
