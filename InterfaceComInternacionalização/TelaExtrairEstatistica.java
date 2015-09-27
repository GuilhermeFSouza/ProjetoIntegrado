
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;



public class TelaExtrairEstatistica extends JFrame {
	private JPanel painelPrincipal;
	private JPanel painelTopo;
	private JPanel painelSearch;
	private JTable tabela;
	private JPanel painelBotoes;
	private JScrollPane barraRolagem;
	private JButton btImprimir;
	private JButton btVoltar;
	private JTextField txtData;
	private JLabel lblData;
	private JLabel lblNomeCliente;
	private JLabel lblTotal;
	private DefaultTableModel modelo = new DefaultTableModel();
	private ImageIcon ImgUsr;
	public Locale locale;
	public ResourceBundle BundleLocale;
	
	public TelaExtrairEstatistica(Locale localeParam, ResourceBundle bundleParam){
		super(bundleParam.getString("tela.estatistica.titulo"));
		setLocation(localeParam, bundleParam);
		painelSearch = new JPanel();
		painelPrincipal = new JPanel();
		painelTopo = new JPanel();
		criaJTable();
		criaJanela();
	}

	public void criaJanela() {
		painelPrincipal.setLayout(new BorderLayout());
		painelTopo.setLayout(new FlowLayout(FlowLayout.LEFT));

		painelSearch.setLayout(new GridLayout(3,1,2,2));
			txtData = new JTextField(" ");
			lblData = new JLabel(BundleLocale.getString("tela.estatistica.label1"));
			painelSearch.add(lblData);
			painelSearch.add(txtData);


		ImgUsr = new ImageIcon("Interface/login.png");
		lblNomeCliente = new JLabel("<Nome do Cliente>", ImgUsr, SwingConstants.CENTER);
		painelTopo.add(lblNomeCliente);
		painelTopo.add(BorderLayout.CENTER,painelSearch);
		//painelSearch.setAlignmentX(LEFT_ALIGNMENT);
		barraRolagem = new JScrollPane(tabela);
		painelBotoes= new JPanel();
		painelBotoes.setLayout(new FlowLayout(FlowLayout.RIGHT));
			btImprimir = new JButton(BundleLocale.getString("tela.button.imprimir"));
			lblTotal = new JLabel(BundleLocale.getString("tela.estatistica.label2"));
			btVoltar = new JButton(BundleLocale.getString("tela.button.voltar"));
			painelBotoes.add(lblTotal);
			painelBotoes.add(btImprimir);
			painelBotoes.add(btVoltar);

		painelPrincipal.add(BorderLayout.NORTH,painelTopo);
		painelPrincipal.add(BorderLayout.SOUTH,painelBotoes);
		painelPrincipal.add(BorderLayout.CENTER,barraRolagem);
		getContentPane().add(painelPrincipal);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(800,600);
		setVisible(true);
		
		btVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuOperador mo = new MenuOperador(locale, BundleLocale);
				dispose();
			}
		});
		
	}

	private void criaJTable() {
		tabela = new JTable(modelo);
		modelo.addColumn(BundleLocale.getString("tela.estatistica.table1"));
		modelo.addColumn(BundleLocale.getString("tela.estatistica.table2"));
		modelo.addColumn(BundleLocale.getString("tela.estatistica.table3"));
		tabela.getColumnModel().getColumn(0).setPreferredWidth(80);
		tabela.getColumnModel().getColumn(1).setPreferredWidth(120);
		tabela.getColumnModel().getColumn(1).setPreferredWidth(80);
	}

	public void setLocation(Locale locale, ResourceBundle bundle){
		this.locale = locale;
		this.BundleLocale = bundle;
	}
	
	public static void main(String[] args) {
		TelaExtrairEstatistica lc = new TelaExtrairEstatistica();
		lc.setVisible(true);
		lc.setSize(800,600);
		//lc.pack();
	}
}
