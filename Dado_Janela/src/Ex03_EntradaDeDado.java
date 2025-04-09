import java.util.Scanner;

public class Ex03_EntradaDeDado {
    public static void main(String[] args) {
        double pi = 3.14, raio = 0, area = 0;

        Scanner scan; // declaração do objeto dessa classe scan

        //tentativa, no catch ele vai capturar o erro

        try {
            scan = new Scanner(System.in); //instanciação do objeto scan
            System.out.print("Digite o raio do círculo: ");
            raio = scan.nextDouble();

            area = (( raio * raio) * pi);
            System.out.println("A área desse círculo é " + area);

        } catch(Exception e){
            System.out.println("Formato de número incorreto");

        }
    }
}

