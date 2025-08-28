/*
Natalia Souza rm: 564099
Felipe Ishii rm: 565339
Vitória Rodrigues rm: 565160
 */

package br.com.fiap.main;

import br.com.fiap.bean.DragonBallSuper;

import javax.swing.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String nome, aux, path;
        int ki, tecnica, velocidade, transformacao, opcao;
        DragonBallSuper personagem;

        do {
            try {
                aux = JOptionPane.showInputDialog("Escolha:\n1.Cadastrar Carta\n2.Consultar Carta");
                opcao = Integer.parseInt(aux);
                path = JOptionPane.showInputDialog("Digite o caminho da pasta");
                personagem = new DragonBallSuper();
                switch (opcao){
                    case 1:
                        nome = JOptionPane.showInputDialog("Digite o nome do personagem");

                        aux = JOptionPane.showInputDialog("Digite o nível de Ki do personagem");
                        ki = Integer.parseInt(aux);

                        aux = JOptionPane.showInputDialog("Digite o nível de técnica do personagem");
                        tecnica = Integer.parseInt(aux);

                        aux = JOptionPane.showInputDialog("Digite a velocidade do personagem");
                        velocidade = Integer.parseInt(aux);

                        aux = JOptionPane.showInputDialog("Digite a quantidade de transformação do personagem");
                        transformacao = Integer.parseInt(aux);

                        personagem.setNome(nome);
                        personagem.setKi(ki);
                        personagem.setTecnicas(tecnica);
                        personagem.setVelocidade(velocidade);
                        personagem.setTransformacao(transformacao);

                        JOptionPane.showMessageDialog(null, personagem.gravar(path));

                        break;
                    case 2:
                        nome = JOptionPane.showInputDialog("Digite o nome do personagem");
                        personagem.setNome(nome);
                        personagem = personagem.ler(path);
                        if (personagem == null){
                            JOptionPane.showMessageDialog(null, "Personagem informado não cadastrado");
                        } else {
                            JOptionPane.showMessageDialog(null, "Exibindo dados:"
                                    + "\nNome: " + personagem.getNome()
                                    + "\nNível de Ki: " + personagem.getKi()
                                    + "\nNível de Técnica: " + personagem.getTecnicas()
                                    + "\nVelocidade: " + personagem.getVelocidade()
                                    + "\nQuantidade de Transformações: " + personagem.getTransformacao()
                            );
                        }

                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opção inválida");
                }


            } catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Erro de Conversão!\n" + e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
            } catch (IOException e){
                JOptionPane.showMessageDialog(null, "Erro ao acessar arquivo!\n" + e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
            }

        } while (JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);
        JOptionPane.showMessageDialog(null, "Fim do programa");

    }
}