import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

public class TelaExtrato extends JFrame implements ItemListener{
	//Hierarquia dos JPanel´s
	private JPanel painelPrincipal;
		private JPanel painelTopo;
			private JPanel frasejp;
			private JPanel painelAlinhaPesquisa;
				private JPanel painelRadio; private JPanel painelSearch;
		private JTable tabela;
		private JPanel painelBotoes;
	//private JPanel radioGroup;
	private JScrollPane barraRolagem;
	private JButton btPesquisar;
	private JButton btVoltar;
	private JButton btImprimir;
	private JRadioButton opcData;
	private JRadioButton opcSeteDias;
	private JRadioButton opcQuinzeDias;
	private JTextField txtPesquisar;
	private JLabel lblData;
	private DefaultTableModel modelo = new DefaultTableModel();
	private ButtonGroup group;	
	private JLabel frase;
	private ImageIcon ImgUsr;
			selecionaOpcaoHandler	handler = new selecionaOpcaoHandler();
	public Locale locale;
	public ResourceBundle BundleLocale;
	public TelaExtrato(Locale localeParam, ResourceBundle bundleParam){
		super(bundleParam.getString("tela.consultarExtrato.titulo"));
		setLocation(localeParam, bundleParam);
		ImgUsr = new ImageIcon("Interface/login.png");
		frase = new JLabel("<NOME DO CLIENTE> - "+BundleLocale.getString("tela.consultarExtrato.titulo"), ImgUsr, SwingConstants.LEFT);
		painelRadio = new JPanel();
		painelSearch = new JPanel();
		painelPrincipal = new JPanel();
		painelTopo = new JPanel();
		frasejp = new JPanel();
		criaJTable();
		criaJanela();
	}

	public void criaJanela() {
		painelAlinhaPesquisa = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		painelPrincipal.setLayout(new BorderLayout());
		painelTopo.setLayout(new FlowLayout(FlowLayout.LEFT));
		frasejp.setLayout(new FlowLayout());
			frasejp.add(frase);
		
		painelSearch.setLayout(new GridLayout(3,1,2,2));
			lblData = new JLabel(BundleLocale.getString("tela.consultarExtrato.radio1"));
			painelSearch.add(lblData);
			txtPesquisar = new JTextField("");
			painelSearch.add(txtPesquisar);
			btPesquisar = new JButton(BundleLocale.getString("tela.consultarExtrato.button1"));
			painelSearch.add(btPesquisar);
			painelSearch.setVisible(false);
		
		painelRadio.setLayout(new GridLayout(3, 1));
			painelRadio.setVisible(true);
			opcData = new JRadioButton(BundleLocale.getString("tela.consultarExtrato.radio1"),true);
			opcData.addItemListener(handler);
			opcSeteDias = new JRadioButton(BundleLocale.getString("tela.consultarExtrato.radio2"),false);
			opcQuinzeDias = new JRadioButton(BundleLocale.getString("tela.consultarExtrato.radio3"),false);
			painelRadio.add(opcData);
			painelRadio.add(opcSeteDias);
			painelRadio.add(opcQuinzeDias);
			ButtonGroup group = new ButtonGroup();
			group.add(opcData);
			group.add(opcSeteDias);
			group.add(opcQuinzeDias);
			painelRadio.setAlignmentX(SwingConstants.LEFT);
			//painelRadio.setAlignmentX(CENTER_ALIGNMENT);
			painelAlinhaPesquisa.add(painelRadio);
			painelAlinhaPesquisa.add(painelSearch);
		painelTopo.add(BorderLayout.NORTH, frasejp);
		painelTopo.add(BorderLayout.WEST,painelAlinhaPesquisa);
	//	painelTopo.add(BorderLayout.CENTER,painelSearch);
		//painelSearch.setAlignmentX(LEFT_ALIGNMENT);
		barraRolagem = new JScrollPane(tabela);
		painelBotoes= new JPanel();
		painelBotoes.setLayout(new FlowLayout(FlowLayout.RIGHT));
			btVoltar = new JButton(BundleLocale.getString("tela.buttonVoltar"));
			btImprimir = new JButton(BundleLocale.getString("tela.buttonImprimir"));
			painelBotoes.add(btVoltar);
			painelBotoes.add(btImprimir);
		painelPrincipal.add(BorderLayout.NORTH,painelTopo);
		painelPrincipal.add(BorderLayout.SOUTH,painelBotoes);
		painelPrincipal.add(BorderLayout.CENTER,barraRolagem);
		getContentPane().add(painelPrincipal);
		//setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(800, 600);
		setVisible(true);
		
		btPesquisar.addActionListener(new BtPesquisarListener());
		
		btVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuUsuario MU = new MenuUsuario(locale, BundleLocale);
				dispose();
			}
		});
	}

	private void criaJTable() {
		tabela = new JTable(modelo);
		modelo.addColumn(BundleLocale.getString("tela.consultarExtrato.table1"));
		modelo.addColumn(BundleLocale.getString("tela.consultarExtrato.table2"));
		modelo.addColumn(BundleLocale.getString("tela.consultarExtrato.table3"));
		modelo.addColumn(BundleLocale.getString("tela.consultarExtrato.table4"));
		modelo.addColumn(BundleLocale.getString("tela.consultarExtrato.table5"));
		tabela.getColumnModel().getColumn(0).setPreferredWidth(10);
		tabela.getColumnModel().getColumn(1).setPreferredWidth(120);
		tabela.getColumnModel().getColumn(1).setPreferredWidth(80);
		tabela.getColumnModel().getColumn(1).setPreferredWidth(120);
		tabela.getColumnModel().getColumn(1).setPreferredWidth(80);
		pesquisar(modelo);
	}

	public static void pesquisar(DefaultTableModel modelo) {
		
		
//		ContatoDao dao = new ContatoDao();
		
//		for (Contato c : dao.getContatos()) {
//			modelo.addRow(new Object[] { c.getId(), c.getNome(),
//					c.getTelefone(), c.getEmail() });
//		}
	}



	private class BtPesquisarListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			
		}
	}

	public void setLocation(Locale locale, ResourceBundle bundle){
		this.locale = locale;
		this.BundleLocale = bundle;
	}
	
	public static void main(String[] args) {
		TelaExtrato lc = new TelaExtrato();
		lc.setVisible(true);
		//lc.pack();
		lc.setSize(800,600);
	}

	private class selecionaOpcaoHandler implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent event) {
			if(opcData.isSelected()){
				painelSearch.setVisible(true);
			}else{
				painelSearch.setVisible(false);
			}
		}
		
	}

}

