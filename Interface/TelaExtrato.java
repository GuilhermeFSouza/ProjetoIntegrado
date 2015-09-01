import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
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
import javax.swing.table.DefaultTableModel;

public class TelaExtrato extends JFrame {
	//Hierarquia dos JPanel´s
	private JPanel painelPrincipal;
		private JPanel painelTopo;
			private JPanel frasejp;
			private JPanel painelRadio; private JPanel painelSearch;
		private JTable tabela;
		private JPanel painelBotoes;
	//private JPanel radioGroup;
	private JScrollPane barraRolagem;
	private JButton btPesquisar;
	private JButton btVoltar;
	private JButton btImprimir;
	private JRadioButton opcData;
	private JRadioButton opcCincoDias;
	private JRadioButton opcDezDias;
	private JTextField txtPesquisar;
	private JLabel lblData;
	private DefaultTableModel modelo = new DefaultTableModel();
	private ButtonGroup group;	
	private JLabel frase;
	
	public TelaExtrato() {
		super("Extrato");
		frase = new JLabel("<NOME DO CLIENTE> - Consultar Extrato");
		painelRadio = new JPanel();
		painelSearch = new JPanel();
		painelPrincipal = new JPanel();
		painelTopo = new JPanel();
		frasejp = new JPanel();
		criaJTable();
		criaJanela();
	}

	public void criaJanela() {
		painelPrincipal.setLayout(new BorderLayout());
		painelTopo.setLayout(new FlowLayout(FlowLayout.LEFT));
		frasejp.setLayout(new FlowLayout());
			frasejp.add(frase);
		
		painelSearch.setLayout(new GridLayout(3,1,2,2));
			lblData = new JLabel("Data:");
			painelSearch.add(lblData);
			txtPesquisar = new JTextField("");
			painelSearch.add(txtPesquisar);
			btPesquisar = new JButton("Pesquisar");
			painelSearch.add(btPesquisar);
		
		painelRadio.setLayout(new GridLayout(3, 1));
			painelRadio.setVisible(true);
			opcData = new JRadioButton("Data",true);
			opcCincoDias = new JRadioButton("5 Dias",false);
			opcDezDias = new JRadioButton("10 Dias",false);
			painelRadio.add(opcData);
			painelRadio.add(opcCincoDias);
			painelRadio.add(opcDezDias);
			ButtonGroup group = new ButtonGroup();
			group.add(opcData);
			group.add(opcCincoDias);
			group.add(opcDezDias);
			//painelRadio.setAlignmentX(CENTER_ALIGNMENT);
		painelTopo.add(BorderLayout.NORTH, frasejp);
		painelTopo.add(BorderLayout.WEST,painelRadio);
		painelTopo.add(BorderLayout.CENTER,painelSearch);
		//painelSearch.setAlignmentX(LEFT_ALIGNMENT);
		barraRolagem = new JScrollPane(tabela);
		painelBotoes= new JPanel();
		painelBotoes.setLayout(new FlowLayout(FlowLayout.RIGHT));
			btVoltar = new JButton("Voltar");
			btImprimir = new JButton("Imprimir");
			painelBotoes.add(btVoltar);
			painelBotoes.add(btImprimir);
		
		painelPrincipal.add(BorderLayout.NORTH,painelTopo);
		painelPrincipal.add(BorderLayout.SOUTH,painelBotoes);
		painelPrincipal.add(BorderLayout.CENTER,barraRolagem);
		getContentPane().add(painelPrincipal);
		//setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 320);
		setVisible(true);
		btPesquisar.addActionListener(new BtPesquisarListener());
	}

	private void criaJTable() {
		tabela = new JTable(modelo);
		modelo.addColumn("Id");
		modelo.addColumn("Data de Lancamento");
		modelo.addColumn("D/C");
		modelo.addColumn("Doc");
		modelo.addColumn("Valor");
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

	public static void main(String[] args) {
		TelaExtrato lc = new TelaExtrato();
		lc.setVisible(true);
		//lc.pack();
		lc.setSize(800,600);
	}
}
