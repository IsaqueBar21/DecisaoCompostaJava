package teste;

import javax.swing.JOptionPane;

import exercicios.Doador;

public class testaDoador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//variaveis
		String nome, genero;
		int idade;
		float peso;

		//entradas
		nome = JOptionPane.showInputDialog("Qual o nome do Doador?");
		idade = Integer.parseInt(JOptionPane.showInputDialog("Qual a idade do Doador?"));
		peso = Float.parseFloat(JOptionPane.showInputDialog("Qual o peso do Doador?"));
		genero = JOptionPane.showInputDialog("Qual o sexo do Doador? (Masculino / Feminino)");
		
		//objeto
		Doador doador = new Doador(nome, peso, idade, genero);
		
		//processamento e saida
		JOptionPane.showMessageDialog(null, doador.mostrarQuantidadeSangue());
		JOptionPane.showMessageDialog(null, doador.mostrarDados());		
	}
}
