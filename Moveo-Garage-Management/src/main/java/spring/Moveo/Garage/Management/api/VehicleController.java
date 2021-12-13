package spring.Moveo.Garage.Management.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import spring.Moveo.Garage.Management.model.Vehicle;
import spring.Moveo.Garage.Management.service.VehicleSercive;

import java.util.List;

@RequestMapping("api/v1/vehicle")
@RestController
public class VehicleController {
    private final VehicleSercive vehicleSercive;
    @Autowired
    public VehicleController(VehicleSercive vehicleSercive) {
        this.vehicleSercive = vehicleSercive;
    }

    @PostMapping (path = "{type}")
    public void addVehicle(@PathVariable("type")int type ,@RequestBody Vehicle vehicle) {
        vehicleSercive.addVehicle(vehicle, type);
    }
    @GetMapping
    public List<Vehicle> getAllVehicles(){
        return vehicleSercive.getAllVehicles();
    }
    @GetMapping(path = "{licence_Number}")
    public Vehicle get_Vehicle(@PathVariable("licence_Number") int license_Number) {
        return vehicleSercive.retrieve_Vehicle(license_Number);
    }
    @PutMapping(path = "{license_Number}")
    public void inflate_Vehicle(@PathVariable("license_Number") int license_Number){
        vehicleSercive.inflate_Vehicle(license_Number);
    }

    @PutMapping(path = "{license_Number}/{percentage}")
    public void add_Energy(@PathVariable("license_Number") int license_Number, @PathVariable("percentage") int percentage){
        vehicleSercive.add_Ennergy(license_Number, percentage);
    }
}
