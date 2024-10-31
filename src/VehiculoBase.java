// Clase abstracta que implementa parte de la lógica de los vehículos
public abstract class VehiculoBase implements Vehiculo {
    protected String marca;
    protected String modelo;
    protected int año;

    public VehiculoBase(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    
    public abstract void mover(); // Método abstracto a ser implementado por las subclases
}
