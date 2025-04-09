package br.com.fiap;

import javax.swing.*;

public class Ex01_EntradaComJanela {
    public static void main(String[] args) {

        float nota1, nota2, nota3, nota4, media;
        String auxiliar;

        try {
            auxiliar = JOptionPane.showInputDialog("Digite a nota da prova 1: ");
            nota1 = Integer.parseInt(auxiliar);
            auxiliar = JOptionPane.showInputDialog("Digite a nota da prova 2: ");
            nota2 = Integer.parseInt(auxiliar);
            auxiliar = JOptionPane.showInputDialog("Digite a nota da prova 3: ");
            nota3 = Integer.parseInt(auxiliar);
            auxiliar = JOptionPane.showInputDialog("Digite a nota da prova 4: ");
            nota4 = Integer.parseInt(auxiliar);
            media = ((nota1 + nota2 + nota3 + nota4)/4);
            JOptionPane.showMessageDialog(null, "Média das 4 provas: " + media);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Formato de número incorreto");
        }

    }
}
