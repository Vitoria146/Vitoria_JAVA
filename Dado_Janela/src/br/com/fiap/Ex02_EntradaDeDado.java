package br.com.fiap;

import java.util.Scanner;

public class Ex02_EntradaDeDado {
    public static void main(String[] args) {
        int anonasc = 0, anoatual = 2025, idade = 0;
        Scanner scan; // declaração do objeto dessa classe scan

        //tentativa, no catch ele vai capturar o erro

        try {
            scan = new Scanner(System.in); //instanciação do objeto scan
            System.out.print("Digite o ano do seu nascimento: ");
            anonasc = scan.nextInt();

            idade = (anoatual - anonasc);
            System.out.println("Sua idade é ou será: " + idade);

        } catch(Exception e){
            System.out.println("Formato de número incorreto");

        }
    }
}
