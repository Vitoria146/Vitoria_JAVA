package br.com.fiap;

import javax.swing.*;

public class EntradaComJanela {
    public static void main(String[] args) {

    int num1, num2, resultado;
    String auxiliar;

    try {
        auxiliar = JOptionPane.showInputDialog("Digite um número inteiro: ");
        num1 = Integer.parseInt(auxiliar);
        auxiliar = JOptionPane.showInputDialog("Digite um número inteiro: ");
        num2 = Integer.parseInt(auxiliar);
        resultado = num1 + num2;
        JOptionPane.showMessageDialog(null,"Valor 1: " + num1 + "\nValor 2: " + num2 + "\nSoma dos valores: " + resultado);

    } catch (Exception e) {
        JOptionPane.showMessageDialog(null,"Formato de número incorreto");
    }

    }
}
