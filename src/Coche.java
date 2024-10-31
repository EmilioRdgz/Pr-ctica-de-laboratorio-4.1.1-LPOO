// Clase que representa un coche
public class Coche extends VehiculoBase {
    private int numeroDePuertas;

    public Coche(String marca, String modelo, int año, int numeroDePuertas) {
        super(marca, modelo, año);
        this.numeroDePuertas = numeroDePuertas;
    }

    
    public void mover() { // Implementación específica del método mover
        System.out.println("El coche " + marca + " se mueve de forma silenciosa.");
    }
}
