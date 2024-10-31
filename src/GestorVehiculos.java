import java.util.ArrayList;
import java.util.List;

public class GestorVehiculos {
    private List<Vehiculo> vehiculos; // Lista de vehículos

    public GestorVehiculos() {
        vehiculos = new ArrayList<>();
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo); // Agregar un vehículo a la lista
    }

    public void mostrarMovimiento() {
        for (Vehiculo vehiculo : vehiculos) {
            vehiculo.mover(); // Polimorfismo: llama al método mover de cada vehículo
        }
    }

    public static void main(String[] args) {
        GestorVehiculos gestor = new GestorVehiculos();
        
        // Creación de diferentes vehículos
        gestor.agregarVehiculo(new Coche("Toyota", "Corolla", 2020, 4));
        gestor.agregarVehiculo(new Camion("Volvo", "FH16", 2019, 15000));
        gestor.agregarVehiculo(new Motocicleta("Yamaha", "YZF-R1", 2021, "Deportivo"));

        // Mostrar movimiento de los vehículos
        gestor.mostrarMovimiento();
    }
}
