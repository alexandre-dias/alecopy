package alecopy;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Main {
	public static void main(String[] args) {

		JLabel aviso = new JLabel();
		JFrame janela = new JFrame("alecopy");
		JTextField texto1, texto2, texto3;
		JButton botao1, botao2, botao3, btnLimpar;

		texto1 = new JTextField();
		texto1.setBounds(10, 10, 330, 40);
		botao1 = new JButton("Copiar");
		botao1.setBounds(380, 10, 80, 40);

		texto2 = new JTextField();
		texto2.setBounds(10, 80, 330, 40);
		botao2 = new JButton("Copiar");
		botao2.setBounds(380, 80, 80, 40);

		texto3 = new JTextField();
		texto3.setBounds(10, 150, 330, 40);
		botao3 = new JButton("Copiar");
		botao3.setBounds(380, 150, 80, 40);
		
		btnLimpar = new JButton("Limpar tudo");
		btnLimpar.setBounds(10, 250, 150, 50);

		janela.add(texto1);
		janela.add(texto2);
		janela.add(texto3);
		janela.add(botao1);
		janela.add(botao2);
		janela.add(botao3);
		janela.add(btnLimpar);

		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setTitle("alecopy");
		janela.setSize(485, 350);
		janela.setLocationRelativeTo(null);
		janela.setLayout(null);
		janela.setVisible(true);

		botao1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Clipboard board = Toolkit.getDefaultToolkit().getSystemClipboard();
				ClipboardOwner selecao = new StringSelection(texto1.getText());
				board.setContents((Transferable) selecao, selecao);
				
				aviso.setText("");
				aviso.setText("Texto 1 copiado");
				aviso.setBounds(10, 160, 100, 100);
				janela.add(aviso);
				janela.repaint();
			}
		});
		
		botao2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Clipboard board = Toolkit.getDefaultToolkit().getSystemClipboard();
				ClipboardOwner selecao = new StringSelection(texto2.getText());
				board.setContents((Transferable) selecao, selecao);
				
				aviso.setText("");
				aviso.setText("Texto 2 copiado");
				aviso.setBounds(10, 160, 100, 100);
				janela.add(aviso);
				janela.repaint();
			}
		});
			
		botao3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Clipboard board = Toolkit.getDefaultToolkit().getSystemClipboard();
				ClipboardOwner selecao = new StringSelection(texto3.getText());
				board.setContents((Transferable) selecao, selecao);
				
				aviso.setText("");
				aviso.setText("Texto 3 copiado");
				aviso.setBounds(10, 160, 100, 100);
				janela.add(aviso);
				janela.repaint();
			}
		});
		
		btnLimpar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				aviso.setText("");
				texto1.setText("");
				texto2.setText("");
				texto3.setText("");
				
			}
		});

	}
}