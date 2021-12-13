package spring.Moveo.Garage.Management.dao;
import spring.Moveo.Garage.Management.model.Vehicle;
import java.util.List;
import java.util.UUID;


public interface Vehicledao {

    int insertVehicle(UUID uuid, Vehicle vehicle, int type);
    default int insertVehicle(Vehicle vehicle, int type){
        UUID uuid =UUID.randomUUID();
        return insertVehicle(uuid, vehicle, type);
    }
    List<Vehicle> selectAllVehicles();

    Vehicle retrieive_Vehicle(int licence_Number);
    void inflate_Vehicle(int license_Number);
    void add_Energy(int licence_Number, int percentage);
}
