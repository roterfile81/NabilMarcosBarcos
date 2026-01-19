package NabilMarcos;
import java.util.ArrayList;

public class Puerto {

	protected String nombre;
    protected ArrayList<Barco> barcos;

    public Puerto(String string) {
		// TODO Auto-generated constructor stub
	}

	public void Puerto(String nombre) {
        this.nombre = nombre;
        barcos = new ArrayList<>();
    }

    public boolean entrarBarco(Barco b) {
        if (barcos.size() < 4) {
            barcos.add(b);
            return true;
        } else {
            System.out.println("Puerto lleno");
            return false;
        }
    }

    public boolean salirBarco(String nombre) {
        for (Barco b : barcos) {
            if (b.getNombre().equalsIgnoreCase(nombre)) {
                barcos.remove(b);
                return true;
            }
        }
        return false;
    }

    public double calcularPrecioViaje(Barco b, int horas, double precioCombustible) {
        if (b.calcularAutonomia() < horas) {
            return -1;
        }
        return horas * b.getMotor().getConsumo() * precioCombustible;
    }

    public ArrayList<Barco> getBarcos() {
        return barcos;
    }
}
