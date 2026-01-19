package NabilMarcos;

public abstract class Barco {
	protected String nombre;
    protected Motor motor;
    protected double capacidadCombustible;

    public Barco(String nombre, Motor motor, double capacidadCombustible) {
        this.nombre = nombre;
        this.motor = motor;
        this.capacidadCombustible = capacidadCombustible;
    }

    public String getNombre() {
        return nombre;
    }

    public Motor getMotor() {
        return motor;
    }

    public double getCapacidadCombustible() {
        return capacidadCombustible;
    }

    public abstract double calcularAutonomia();

    @Override
    public String toString() {
        return "Barco [nombre=" + nombre + ", motor=" + motor +
               ", capacidadCombustible=" + capacidadCombustible + "]";
    }
}

