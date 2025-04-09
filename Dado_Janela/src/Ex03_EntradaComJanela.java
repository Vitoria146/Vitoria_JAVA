import javax.swing.*;

public class Ex03_EntradaComJanela {
    public static void main(String[] args) {
        double raio, pi = 3.14, area;
        String auxiliar;

        try {
            auxiliar = JOptionPane.showInputDialog("Digite o raio do círculo");
            raio = Double.parseDouble(auxiliar);
            area = Math.PI * Math.pow( raio,2);
            //Math.sqrt (x) -> para raiz quadrada

            JOptionPane.showMessageDialog(null, "A área do círculo é " + area);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Formato de número incorreto");
        }

    }
}
