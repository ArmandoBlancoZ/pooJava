
import javax.swing.JOptionPane;

public class tecnicas {

    String color;
    String marca;
    String modelo;
    int odometro;

    public static void main(String[] args) {
        tecnicas carro1 = new tecnicas();
        carro1.color = "Gris";
        carro1.marca = "Audi";
        carro1.modelo = "A3";
        carro1.odometro = 100;

        System.out.println("El color es: " + carro1.color);
        System.out.println("El marca es: " + carro1.marca);
        System.out.println("El marca es: " + carro1.modelo);
        System.out.println("El marca es: " + carro1.odometro);

        System.out.println("----------------------------------------------");
        tecnicas taxi = new tecnicas();
        taxi.color = JOptionPane.showInputDialog("Digite el color del taxi");
        taxi.marca = JOptionPane.showInputDialog("Digite la marca del taxi");
        taxi.modelo = JOptionPane.showInputDialog("Digite el modelo del taxi");
        taxi.odometro = Integer.parseInt(JOptionPane.showInputDialog("Digite el odometro del taxi"));
        JOptionPane.showMessageDialog(null, "El color del taxi es " + taxi.color);
        JOptionPane.showMessageDialog(null, "La marca del taxi es " + taxi.marca);
        JOptionPane.showMessageDialog(null, "El modelo del taxi es " + taxi.modelo);
        JOptionPane.showMessageDialog(null, "El odometro del taxi es " + taxi.odometro);

        tecnicas bus = new tecnicas();
        bus.color = JOptionPane.showInputDialog("digite el color del bus: ");
        bus.marca = JOptionPane.showInputDialog("digite el marca del bus: ");
        bus.modelo = JOptionPane.showInputDialog("digite el modelo del bus: ");
        bus.odometro = Integer.parseInt(JOptionPane.showInputDialog("digite el odometro del bus: "));
JOptionPane.showMessageDialog(null, "El color del taxi es " + bus.color);
        JOptionPane.showMessageDialog(null, "La marca del bus es " + bus.marca);
        JOptionPane.showMessageDialog(null, "El modelo del bus es " + bus.modelo);
        JOptionPane.showMessageDialog(null, "El odometro del bus es " + bus.odometro);
    }
}
