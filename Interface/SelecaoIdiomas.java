//Escrito em 21/04/15 - Guilherme F. Souza
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
//import java.awt.event.ActionListener;
//import java.awt.event.ActionEvent; 

public class SelecaoIdiomas extends JFrame implements ActionListener{
	private JLabel portugues;
	private JLabel ingles;
	private JLabel espanhol;
	private JButton pt;
	private JButton en;
	private JButton sp;
	private ImageIcon ImgPort;
	private ImageIcon ImgEngl;
	private ImageIcon ImgSpan;
	private JLabel frase;
	
	public SelecaoIdiomas(){
		super("Seleção de Idiomas");
		frase = new JLabel("Escolha seu idioma: (Choose your language)");
			frase.setHorizontalAlignment(SwingConstants.CENTER);
			frase.setVerticalAlignment(SwingConstants.CENTER);
		JPanel CentroGridLayout = new JPanel(new FlowLayout(FlowLayout.CENTER, 50,100));
	//	this.setLayout(new BorderLayout(20,20));
	//	this.getContentPane().add(new GridLayout(2,3,4,4));
		ImgPort = new ImageIcon("Interface/Button_br.gif");
		pt = new JButton("",ImgPort);
		CentroGridLayout.add(pt);
		
		ImgEngl = new ImageIcon("Interface/Button_en.jpg");
		en = new JButton("",ImgEngl);
		CentroGridLayout.add(en);
		
		ImgSpan = new ImageIcon("Interface/Button_sp.png");
		sp = new JButton("",ImgSpan);
		CentroGridLayout.add(sp);
		
		this.setLayout(new BorderLayout(50,50));
		this.getContentPane().add(CentroGridLayout, BorderLayout.CENTER);
		this.getContentPane().add(frase, BorderLayout.NORTH);
		/*
		portugues = new JLabel("Português");
		add(portugues);
		ingles = new JLabel("English");
		add(ingles);
		espanhol = new JLabel("Spanish");
		add(espanhol);*/
		
		pt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login ln = new Login();
				dispose();
			}
		});
		
		en.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login ln = new Login();
				dispose();
			}
		});
		
		sp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login ln = new Login();
				dispose();
			}
		});
	}


public static void main(String[] args){
	SelecaoIdiomas SI = new SelecaoIdiomas();
	SI.setVisible(true);
	SI.setSize(800,600);
	}
}
