import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;
import java.util.ResourceBundle;

public class ConsultarSaldo extends JFrame implements ActionListener{
	private JLabel frase;
	private JLabel lblData;
	private JLabel lblSaldoAtual;
	private JLabel lblLimite;
	private JButton Imprimir;
	private JButton Terminar;
	private JButton Voltar;
	private JPanel ConteudoFrame;
	private JPanel Conteudo;
	private JPanel Botoes;
	private JPanel Principal;
	private JMenu menu;
	private JMenuItem imprimir;
	private JMenuItem sair;
	private JMenuBar bar;
	private ImageIcon ImgUsr;
	private ImageIcon ImgSaldo;
	private ImageIcon ImgLimite;
	public Locale locale;
	public ResourceBundle BundleLocale;
		ConsultarSaldo(Locale localeParam, ResourceBundle bundleParam){
			super(bundleParam.getString("tela.consultarSaldo.titulo"));
			setLocation(localeParam, bundleParam);
			ImgUsr = new ImageIcon("Interface/login.png");
			ImgSaldo = new ImageIcon("Interface/saldoAtual");
			ImgLimite = new ImageIcon("Interface/Limite");
			frase = new JLabel("<NOME DO CLIENTE> - "+ BundleLocale.getString("tela.consultarSaldo.titulo"), ImgUsr, SwingConstants.LEFT);
			lblLimite = new JLabel(BundleLocale.getString("tela.consultarSaldo.label3"), ImgLimite, SwingConstants.CENTER);
				lblLimite.setVerticalAlignment(SwingConstants.TOP);
				lblLimite.setVerticalTextPosition(SwingConstants.BOTTOM);
				lblLimite.setHorizontalTextPosition(SwingConstants.CENTER);
			lblData = new JLabel(BundleLocale.getString("tela.consultarSaldo.label1"), SwingConstants.CENTER);
				lblData.setVerticalAlignment(SwingConstants.BOTTOM);
			lblSaldoAtual = new JLabel(BundleLocale.getString("tela.consultarSaldo.label2"), ImgSaldo,SwingConstants.CENTER);
				lblSaldoAtual.setVerticalTextPosition(SwingConstants.BOTTOM);
				lblSaldoAtual.setHorizontalTextPosition(SwingConstants.CENTER);
			Imprimir = new JButton(BundleLocale.getString("tela.button.imprimir"));
			Terminar = new JButton(BundleLocale.getString("tela.button.terminar"));
			Voltar = new JButton(BundleLocale.getString("tela.button.voltar"));
			Conteudo = new JPanel(new GridLayout(3,1,10,10));
			Botoes = new JPanel();
			Principal = new JPanel();
			menu = new JMenu("Opções");
			imprimir = new JMenuItem("Imprimir");
			sair = new JMenuItem("Sair");
			ConteudoFrame = new JPanel(new BorderLayout());
		//	Conteudo.setLayout(new FlowLayout());
			//Conteudo.setBorder(BorderFactory.createTitledBorder("Informações atuais"));
			Conteudo.setMaximumSize(new Dimension(500,500));
			Conteudo.add(lblData);
			Conteudo.add(lblSaldoAtual);
			Conteudo.add(lblLimite);
			ConteudoFrame.add(Conteudo, BorderLayout.CENTER);
			//lblData.setHorizontalAlignment(SwingConstants.BOTTOM);
			//lblSaldoAtual.setHorizontalAlignment(0);
			//lblData.setVerticalAlignment(0);
			//lblSaldoAtual.setVerticalAlignment(0);
			//lblLimite.setHorizontalAlignment(0);
			//lblLimite.setVerticalTextPosition(JLabel.TOP);
			Botoes.setLayout(new FlowLayout(FlowLayout.RIGHT));
			Botoes.add(Imprimir);
			Botoes.add(Terminar);
			Botoes.add(Voltar);
			
			bar = new JMenuBar();
				setJMenuBar(bar);
				bar.add(menu);
				menu.add(imprimir);	
				menu.add(sair);
			
			Principal.setLayout(new BorderLayout());
			Principal.add(BorderLayout.NORTH, frase);
			Principal.add(BorderLayout.CENTER, ConteudoFrame);
			Principal.add(BorderLayout.SOUTH, Botoes);
			
			getContentPane().add(Principal);
			//getContentPane().add(menu);
			//setDefaultCloseOperation(EXIT_ON_CLOSE);
			setSize(800, 600);
			setVisible(true);
			
			Voltar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					MenuUsuario MU = new MenuUsuario(locale, BundleLocale);
					dispose();
				}
			});
			
		}
		
		public void setLocation(Locale locale, ResourceBundle bundle){
			this.locale = locale;
			this.BundleLocale = bundle;
		}
		
		public static void main(String[] args) {
			ConsultarSaldo cs = new ConsultarSaldo();
			cs.setVisible(true);
			cs.setDefaultCloseOperation(EXIT_ON_CLOSE);
			//cs.pack();
		}
}

