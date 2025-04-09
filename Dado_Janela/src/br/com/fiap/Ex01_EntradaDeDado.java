package br.com.fiap;
import java.util.Scanner;

public class Ex01_EntradaDeDado {
    public static void main(String[] args) {

        float nota1 = 0, nota2 = 0, nota3 = 0, nota4 = 0, media = 0;
        Scanner scan; // declaração do objeto dessa classe scan

        //tentativa, no catch ele vai capturar o erro

        try {
            scan = new Scanner(System.in); //instanciação do objeto scan
            System.out.print("Digite a nota da prova 1: ");
            nota1 = scan.nextFloat();
            System.out.print("Digite a nota da prova 2: ");
            nota2 = scan.nextFloat();
            System.out.print("Digite a nota da prova 3: ");
            nota3 = scan.nextFloat();
            System.out.print("Digite a nota da prova 4: ");
            nota4 = scan.nextFloat();

            media = ((nota1 + nota2 + nota3 + nota4) / 4);
            System.out.println("Média das 4 provas: " + media);

        } catch(Exception e){
            System.out.println("Formato de número incorreto");

        }
    }
}