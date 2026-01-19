package NabilMarcos;
import NabilMarcos.Puerto;
import NabilMarcos.Barco;
import NabilMarcos.Motor;
import NabilMarcos.Yate;
public class Main {
	public static void main(String[] args) {

		Puerto puerto = new Puerto("Marina");

        Motor motor1 = new Motor("Motor1", 500, 8.5);
        Motor motor2 = new Motor("Motor2", 600, 9.2);
        Motor motor3 = new Motor("Motor3", 450, 7.8);

        Yate yate1 = new Yate("Yate1", motor2, 750, 6);
        Yate yate2 = new Yate("Yate2", motor1, 600, 4);

        Catamaran cat1 = new Catamaran("Catamaran1", motor1, 1000, motor3);
        Catamaran cat2 = new Catamaran("Catamaran2", motor2, 900, motor3);

        puerto.entrarBarco(yate1);
        puerto.entrarBarco(yate2);
        puerto.entrarBarco(cat1);
        puerto.entrarBarco(cat2);

        
        for (Barco b : puerto.getBarcos()) {
            System.out.println(b);
        }

    
        Barco mayor = puerto.getBarcos().get(0);
        Barco menor = mayor;

        for (Barco b : puerto.getBarcos()) {
            if (b.calcularAutonomia() > mayor.calcularAutonomia()) {
                mayor = b;
            }
            if (b.calcularAutonomia() < menor.calcularAutonomia()) {
                menor = b;
            }
        }

        System.out.println("Mayor autonomía: " + mayor.getNombre());
        System.out.println("Menor autonomía: " + menor.getNombre());

       
        puerto.salirBarco("Yate1");
        System.out.println("Barcos tras la salida:");
        for (Barco b : puerto.getBarcos()) {
            System.out.println(b);
        }
       

        
	
	}
}
