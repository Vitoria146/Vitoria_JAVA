package br.com.fiap;

public class UsarTelevisor {
    public static void main(String[] args) {
 Televisor televisor = new Televisor();
 televisor.volume = 20;
 televisor.canal = 4;
 televisor.aumentarVolume();
 televisor.diminuirVolume();
 televisor.aumentarVolume();
 televisor.trocarCanal(8);
        System.out.println("O volume é " + televisor.volume + "\nO canal é: " + televisor.canal);

    }
}
