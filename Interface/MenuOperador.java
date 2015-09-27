import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;
import java.util.ResourceBundle;

public class MenuOperador extends JFrame{
	private JPanel Base;
	private JPanel Topo;
	private JPanel Conteudo;
	//private JPanel TopoDir;
	private JPanel TopoEsq;
	private JPanel Baixo;
	private JButton opcNotas;
	private JButton opcEstat;
	private JLabel frase;
	private JButton Cancelar;
	private ImageIcon ImgUsr;
	public Locale locale;
	public ResourceBundle BundleLocale;
	
	MenuOperador(Locale localeParam, ResourceBundle bundleParam){
		super(bundleParam.getString("tela.menuOpcoesGerenciais.titulo"));
		setLocation(localeParam, bundleParam);
		ImgUsr = new ImageIcon("Interface/login.png");
		frase = new JLabel("<NOME DO FUNCIONÁRIO>", ImgUsr, SwingConstants.CENTER);
		frase.setHorizontalAlignment(SwingConstants.LEFT);
		opcNotas = new JButton(BundleLocale.getString("tela.menuOpcoesGerenciais.button1"));
		opcEstat = new JButton(BundleLocale.getString("tela.menuOpcoesGerenciais.button2"));
		Cancelar = new JButton(BundleLocale.getString("tela.button.cancelar"));
		Base = new JPanel();
		Topo = new JPanel();
		Conteudo = new JPanel();
		TopoEsq = new JPanel();
		Baixo = new JPanel();
		Conteudo.setLayout(new FlowLayout(FlowLayout.CENTER));
			Conteudo.add(opcNotas);
			Conteudo.add(opcEstat);
		Baixo.setLayout(new FlowLayout(FlowLayout.RIGHT));
			Baixo.add(Cancelar);
		this.setLayout(new BorderLayout());
			this.add(BorderLayout.NORTH, frase);
			this.add(BorderLayout.CENTER, Conteudo);
			this.add(BorderLayout.SOUTH, Baixo);
		//this.setLayout(new BorderLayout());
		//this.getContentPane().add();
			setSize(800,600);
			setVisible(true);
		
		opcNotas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaNotas TN = new TelaNotas(locale, BundleLocale);
				dispose();
			}
		});
		
		opcEstat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			 TelaExtrairEstatistica ee = new TelaExtrairEstatistica(locale, BundleLocale);
			 dispose();
			}
		});
			
	}
	
	public void setLocation(Locale locale, ResourceBundle bundle){
		this.locale = locale;
		this.BundleLocale = bundle;
	}
	public static void main(String[] args) {
		MenuOperador us = new MenuOperador();
		//saque.pack();
		us.setSize(800,600);
		us.setVisible(true);
	}
}
