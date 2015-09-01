import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;

public class TelaExtrato_old extends JFrame {
	private JPanel painelPrincipal;
	private JPanel painelFundo;
	private JPanel painelBotoes;
	private JPanel radioGroup;
	private JTable tabela;
	private JScrollPane barraRolagem;
	private JButton btPesquisar;
	private JRadioButton opcData;
	private JRadioButton opcCincoDias;
	private JRadioButton opcDezDias;
	private JTextArea txtPesquisar;
	private DefaultTableModel modelo = new DefaultTableModel();

	public TelaExtrato_old() {
		super("Extrato old");
		criaJTable();
		criaJanela();
	}

	public void criaJanela() {
		btPesquisar = new JButton("Pesquisar");
		painelBotoes = new JPanel();
		barraRolagem = new JScrollPane(tabela);
		painelFundo = new JPanel();
		txtPesquisar = new JTextArea();
		txtPesquisar.setSize(100, 25);
		painelFundo.setLayout(new BorderLayout());
		painelFundo.add(BorderLayout.CENTER, barraRolagem);
		painelBotoes.add(btPesquisar);
		painelFundo.add(BorderLayout.NORTH,txtPesquisar);
		painelFundo.add(BorderLayout.NORTH, painelBotoes);
		opcData = new JRadioButton("Data",true);
		opcCincoDias = new JRadioButton("5 Dias",false);
		opcDezDias = new JRadioButton("10 Dias",false);
		radioGroup = new JPanel();
		radioGroup.setSize(5, 10);
		radioGroup.setVisible(true);
		radioGroup.add(opcData);
		radioGroup.add(opcCincoDias);
		radioGroup.add(opcDezDias);
		painelPrincipal = new JPanel();
		painelPrincipal.add(BorderLayout.NORTH,radioGroup);
		painelPrincipal.add(BorderLayout.SOUTH,painelFundo);
		getContentPane().add(painelPrincipal);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
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
		TelaExtrato_old lc = new TelaExtrato_old();
		lc.setVisible(true);
	}
}
