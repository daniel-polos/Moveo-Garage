package spring.Moveo.Garage.Management.dao;

import org.springframework.stereotype.Repository;
import spring.Moveo.Garage.Management.model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository("fakeDao")
public class fakeVehicleDataAccessService implements Vehicledao{
    private static List<Vehicle> DB = new ArrayList<>();
    @Override
    public int insertVehicle(UUID uuid, Vehicle vehicle, int type) {
        switch (type) {
            case 1:
                DB.add(new Regular_motorcycle(vehicle.getModelName(), vehicle.getLicense_Number(), vehicle.getAvailable_Energy_Percentage(), vehicle.getTire_Pressure(), vehicle.getMax_Tire_Pressure()));
                break;
            case 2:
                DB.add(new Electric_Motorcycle(vehicle.getModelName(), vehicle.getLicense_Number(), vehicle.getAvailable_Energy_Percentage(), vehicle.getTire_Pressure(), vehicle.getMax_Tire_Pressure()));
                break;
            case 3:
                DB.add(new Regular_Car(vehicle.getModelName(), vehicle.getLicense_Number(), vehicle.getAvailable_Energy_Percentage(), vehicle.getTire_Pressure(), vehicle.getMax_Tire_Pressure()));
                break;
            case 4:
                DB.add(new Electric_Car(vehicle.getModelName(), vehicle.getLicense_Number(), vehicle.getAvailable_Energy_Percentage(), vehicle.getTire_Pressure(), vehicle.getMax_Tire_Pressure()));
                break;
            default:
                DB.add(new Truck(vehicle.getModelName(), vehicle.getLicense_Number(), vehicle.getAvailable_Energy_Percentage(), vehicle.getTire_Pressure(), vehicle.getMax_Tire_Pressure()));
        }
        //not used but for modularity
        return 1;
    }
    public  List<Vehicle> selectAllVehicles(){
        return DB;
    }

    @Override
    public Vehicle retrieive_Vehicle(int licence_Number) {

        for (Vehicle vehicle : DB){
            if (vehicle.getLicense_Number() == licence_Number)
                return vehicle;
        }
        return null;
    }

    @Override
    public void inflate_Vehicle(int license_Number) {
        retrieive_Vehicle(license_Number).inflate_tire();
    }

    @Override
    public void add_Energy(int licence_Number, int percentage) {
        retrieive_Vehicle(licence_Number).add_Energy(percentage);
    }

}
