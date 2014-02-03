package visao.gui;

import javax.swing.JOptionPane;

public class MediatorPrincipal {
	private JanelaPrincipal janela;
	private String[] perguntas;

	public MediatorPrincipal(JanelaPrincipal janela) {
		this.janela = janela;
		
		perguntas = new String[]{ "" };
		
		// TODO PARA GRILO:
		// 1. preencher o vetor perguntas acima, contendo os titulos das perguntas que aparecerao na interface.
		// 2. sugiro criar uma classe Pergunta, que armazene o titulo da pergunta e as 3 respostas
		// 3. pode fazer como um atributo deste mediator a lista de respostas que o usuario fez, interagindo
		//    com o método abaixo que é ativado quando o usuário faz uma seleçao de pergunta.
		// 4. neste método, escrever as respostas usando janela.getJTextArea1().setText(texto), mantendo o texto anterior sempre.
		
		// População da interface
		janela.getJComboBox1().setModel(new javax.swing.DefaultComboBoxModel(perguntas));
		
		// Eventos
		janela.getJMenuItem1().addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				JOptionPane
				.showMessageDialog(
						MediatorPrincipal.this.janela,
						"Trabalho de CCO813 - Sistemas Hipermídia\nUniversidade Federal de Itajubá\n\nIntegrantes:\n- André Silveira - 12616\n- Tiago Garcia - 12643\nCCO 2004",
						"Sobre...", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		
		janela.getJMenuItem2().addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				MediatorPrincipal.this.janela.dispose();
			}
		});
		
		janela.getJComboBox1().addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				// TODO para GRILO:
				// Implementar o que deve acontecer quando um usuário selecionar uma pergunta.
				// Nao esquecer de colocar o combobox em uma selecao default depois, para possibilitar
				// a escolha de uma pergunta diferente. Isso pode ser feito com a linha abaixo,
				// considerando que voce deixará o primeiro lugar do vetor perguntas para isso.
				
				MediatorPrincipal.this.janela.getJComboBox1().setSelectedIndex(0);
			}
		});
	}
	
	
}
