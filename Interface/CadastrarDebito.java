import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class CadastrarDebito extends JFrame implements ActionListener{
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
	private ImageIcon ImgUsr;
	public Locale locale;
	public ResourceBundle BundleLocale;
	
	CadastrarDebito(Locale localeParam, ResourceBundle bundleParam){
		super(bundleParam.getString("tela.debitoAutomatico.titulo"));
		setLocation(localeParam, bundleParam);
		ImgUsr = new ImageIcon("Interface/login.png");
		frase = new JLabel("<NOME DO CLIENTE> - "+BundleLocale.getString("tela.debitoAutomatico.titulo"), ImgUsr, SwingConstants.CENTER);
		frase.setHorizontalAlignment(SwingConstants.LEFT);
			Botoes = new JPanel();
				Botoes.setLayout(new FlowLayout(FlowLayout.RIGHT));
				btCadastrar = new JButton(BundleLocale.getString("tela.debitoAutomatico.button1"));
				btVoltar = new JButton(BundleLocale.getString("tela.button.voltar"));
				Botoes.add(btCadastrar);
				Botoes.add(btVoltar);
			lblCodConsumidor = new JLabel(BundleLocale.getString("tela.debitoAutomatico.label2"));
			lblCodOperadora = new JLabel(BundleLocale.getString("tela.debitoAutomatico.label1"));
			lblDataDebito = new JLabel(BundleLocale.getString("tela.debitoAutomatico.label3"));
			FieldCodConsumidor = new JTextField(15);
			FieldCodOperadora = new JTextField(15);
			FieldDataDebito = new JTextField(15);
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
				JPanel aux1 = new JPanel(new FlowLayout());
					aux1.add(lblCodOperadora);
					aux1.add(FieldCodOperadora);
				JPanel aux2 = new JPanel(new FlowLayout());
					aux2.add(lblCodConsumidor);
					aux2.add(FieldCodConsumidor);
				JPanel aux3 = new JPanel(new FlowLayout());
					aux3.add(lblDataDebito, BorderLayout.AFTER_LAST_LINE);
					aux3.add(FieldDataDebito, BorderLayout.EAST);
				Centro.add(aux1);
				Centro.add(aux2);
				Centro.add(aux3);
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
				
				btVoltar.addActionListener(new ActionListener() {
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
	CadastrarDebito cd = new CadastrarDebito();
	cd.setVisible(true);
	//cd.pack();
}
}

