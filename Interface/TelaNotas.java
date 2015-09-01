import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;



public class TelaNotas extends JFrame {
	private JPanel painelPrincipal;
	private JPanel painelTopo;
	private JPanel painelSearch;
	private JTable tabela;
	private JPanel painelBotoes;
	private JScrollPane barraRolagem;
	private JButton btImprimir;
	private JButton btVoltar;
	private JLabel lblNomeCliente;
	private DefaultTableModel modelo = new DefaultTableModel();

	public TelaNotas() {
		super(" Relatorio de Notas ");
		painelSearch = new JPanel();
		painelPrincipal = new JPanel();
		painelTopo = new JPanel();
		criaJTable();
		criaJanela();
	}

	public void criaJanela() {
		painelPrincipal.setLayout(new BorderLayout());
		painelTopo.setLayout(new FlowLayout(FlowLayout.LEFT));

		lblNomeCliente = new JLabel("<Nome do Cliente>");

		painelTopo.add(lblNomeCliente);
		painelTopo.add(BorderLayout.CENTER,painelSearch);
		//painelSearch.setAlignmentX(LEFT_ALIGNMENT);
		barraRolagem = new JScrollPane(tabela);
		painelBotoes= new JPanel();
		painelBotoes.setLayout(new FlowLayout(FlowLayout.RIGHT));
			btImprimir = new JButton("Imprimir");
			btVoltar = new JButton("Voltar");
			painelBotoes.add(btImprimir);
			painelBotoes.add(btVoltar);

		painelPrincipal.add(BorderLayout.NORTH,painelTopo);
		painelPrincipal.add(BorderLayout.SOUTH,painelBotoes);
		painelPrincipal.add(BorderLayout.CENTER,barraRolagem);
		getContentPane().add(painelPrincipal);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 320);
		setVisible(true);
	}

	private void criaJTable() {
		tabela = new JTable(modelo);
		modelo.addColumn(" Nota ");
		modelo.addColumn(" Quantidade ");
		tabela.getColumnModel().getColumn(0).setPreferredWidth(120);
		tabela.getColumnModel().getColumn(1).setPreferredWidth(120);
	}

	public static void main(String[] args) {
		TelaNotas lc = new TelaNotas();
		lc.setVisible(true);
		lc.pack();
	}
}
