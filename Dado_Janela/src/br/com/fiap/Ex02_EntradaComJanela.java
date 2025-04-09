package br.com.fiap;

import javax.swing.*;

public class Ex02_EntradaComJanela {
    public static void main(String[] args) {
        int anonasc, anoatual = 2025, idade;
        String auxiliar;

        try {
            auxiliar = JOptionPane.showInputDialog("Digite seu ano de nascimento");
            anonasc = Integer.parseInt(auxiliar);
            idade = anoatual - anonasc;

            JOptionPane.showMessageDialog(null, "Sua idade é ou será: " + idade);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Formato de número incorreto");
        }


    }

    }

