// Clase que representa una motocicleta
public class Motocicleta extends VehiculoBase {
    private String tipoDeManillar;

    public Motocicleta(String marca, String modelo, int año, String tipoDeManillar) {
        super(marca, modelo, año);
        this.tipoDeManillar = tipoDeManillar;
    }


    public void mover() { // Implementación específica del método mover
        System.out.println("La motocicleta " + marca + " se mueve rápidamente y con agilidad.");
    }
}

