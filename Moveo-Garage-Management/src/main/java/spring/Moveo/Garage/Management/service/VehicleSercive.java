package spring.Moveo.Garage.Management.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import spring.Moveo.Garage.Management.dao.Vehicledao;
import spring.Moveo.Garage.Management.model.Vehicle;

import java.util.List;

@Service
public class VehicleSercive {
    private final Vehicledao vehicledao;
@Autowired
    public VehicleSercive(@Qualifier("fakeDao") Vehicledao vehicledao) {
        this.vehicledao = vehicledao;
    }

    public void addVehicle(Vehicle vehicle, int type){
        vehicledao.insertVehicle(vehicle, type);
    }

    public List<Vehicle> getAllVehicles(){
        return vehicledao.selectAllVehicles();
    }
    public Vehicle retrieve_Vehicle(int licence_Number){
        return vehicledao.retrieive_Vehicle(licence_Number);
    }

    public void inflate_Vehicle(int license_Number){
        vehicledao.inflate_Vehicle(license_Number);
    }

    public void add_Ennergy(int license_Number, int percentage){
        vehicledao.add_Energy(license_Number, percentage);
    }
}
