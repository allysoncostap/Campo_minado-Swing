package br.com.allysoncostap.cm.visao;

import javax.swing.JFrame;

import br.com.allysoncostap.cm.modelo.Tabuleiro;

@SuppressWarnings("serial")
public class TelaPrincipal extends JFrame {
public TelaPrincipal() {
	Tabuleiro tabuleiro = new Tabuleiro(3,3,1);

	
	add (new PainelTabuleiro(tabuleiro));
	 
	setTitle("Campo Minado Cuzao kkkk");
	setSize(690, 438);
	setLocationRelativeTo(null);
	setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	setVisible(true);
}
	
	
	
	public static void main(String[] args) {
	new TelaPrincipal();
}

}
