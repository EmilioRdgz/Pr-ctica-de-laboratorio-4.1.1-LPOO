// Clase que representa un camión
public class Camion extends VehiculoBase {
    private float capacidadCarga;

    public Camion(String marca, String modelo, int año, float capacidadCarga) {
        super(marca, modelo, año);
        this.capacidadCarga = capacidadCarga;
    }

    
    public void mover() { // Implementación específica del método mover
        System.out.println("El camión " + marca + " se mueve con carga pesada.");
    }
}
