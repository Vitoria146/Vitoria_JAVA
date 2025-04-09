package br.com.fiap;

public class UsaRadio {
    public static void main(String[] args) {
        //Radio radio1; //declaração do objeto
        //radio1 = new Radio(); // instanciação do objeto
        Radio radio1 = new Radio();
        radio1.estacao = 89.1f;
        radio1.volume = 5;
        radio1.trocarEstacao(92.5f);
        radio1.aumentarVolume();
        radio1.aumentarVolume();
        System.out.println("Volume atual: " + radio1.volume + "\n Estação atual: " + radio1.estacao);
    }
}
