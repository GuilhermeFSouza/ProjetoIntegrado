
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

	public TelaExtrairEstatistica() {
		super("Estatistica");
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
			lblData = new JLabel(" Data : dd/mm/yyyy ");
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
			btImprimir = new JButton("Imprimir");
			lblTotal = new JLabel("Total Final: xxx,xx");
			btVoltar = new JButton("Voltar");
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
				MenuOperador mo = new MenuOperador();
				dispose();
			}
		});
		
	}

	private void criaJTable() {
		tabela = new JTable(modelo);
		modelo.addColumn(" Operações ");
		modelo.addColumn(" Quantidade ");
		modelo.addColumn(" Porcentagem ");
		tabela.getColumnModel().getColumn(0).setPreferredWidth(80);
		tabela.getColumnModel().getColumn(1).setPreferredWidth(120);
		tabela.getColumnModel().getColumn(1).setPreferredWidth(80);
	}

	public static void main(String[] args) {
		TelaExtrairEstatistica lc = new TelaExtrairEstatistica();
		lc.setVisible(true);
		lc.setSize(800,600);
		//lc.pack();
	}
}
