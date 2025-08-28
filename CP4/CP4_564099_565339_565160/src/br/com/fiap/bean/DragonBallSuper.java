/*
Natalia Souza rm: 564099
Felipe Ishii rm: 565339
Vitória Rodrigues rm: 565160
 */

package br.com.fiap.bean;

import java.io.*;
/**Classe para objetos do tipo Dragon Ball Super
 * @author Felipe Ishii, Natalia Souza, Vitória Rodrigues
 * @version 1.0
 */

public class DragonBallSuper implements IDBSuper{

    private String nome;
    private int ki;
    private int tecnicas;

    private int velocidade;
    private int transformacao;

    public DragonBallSuper() {}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getKi() {
        return ki;
    }

    public void setKi(int ki) {
        this.ki = ki;
    }

    public int getTecnicas() {
        return tecnicas;
    }

    public void setTecnicas(int tecnicas) {
        this.tecnicas = tecnicas;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getTransformacao() {
        return transformacao;
    }

    public void setTransformacao(int transformacao) {
        this.transformacao = transformacao;
    }

    /**Metodo ler que permite o usuário buscar o arquivo do nome do personagem
     * @author Felipe Ishii, Natalia Souza, Vitória Rodrigues
     * @param path - Caminho aonde será realizado a busca do arquivo
     * @return DragonBallSuper - Objeto com os atributos do personagem informado
     * @throws IOException - Caso não exista o personagem será retornado o IOException
     */

    public DragonBallSuper ler(String path) throws IOException{
        BufferedReader br = new BufferedReader(
                new FileReader(path + "/" + nome + ".txt"));
        nome = br.readLine();
        ki = Integer.parseInt(br.readLine());
        tecnicas = Integer.parseInt(br.readLine());
        velocidade = Integer.parseInt(br.readLine());
        transformacao = Integer.parseInt(br.readLine());
        br.close();
        return this;
    }

    /**Metodo gravar que permite o usuário salvar um arquivo .txt de um personagem
     * @author Felipe Ishii, Natalia Souza, Vitória Rodrigues
     * @param path - Caminho aonde será salvo a arquivo
     * @return String - Retorna uma mensagem de sucesso ou falha
     */

    public String gravar(String path) {
        try {
            File dir = new File(path);
            if (!dir.exists()){
                dir.mkdir();
            }
            PrintWriter pw = new PrintWriter(path + "/" + nome + ".txt");
            pw.println(nome);
            pw.println(ki);
            pw.println(tecnicas);
            pw.println(velocidade);
            pw.println(transformacao);
            pw.flush();
            pw.close();
            return "Arquivo salvo com sucesso";
        } catch (IOException e){
            return "Falha ao gravar arquivo: " + e.getMessage();
        }

    }


}