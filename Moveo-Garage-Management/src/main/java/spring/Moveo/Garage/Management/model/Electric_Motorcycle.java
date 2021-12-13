package spring.Moveo.Garage.Management.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import static spring.Moveo.Garage.Management.model.Energy_Source.BATTERY;

public class Electric_Motorcycle extends Vehicle{
    public Electric_Motorcycle(@JsonProperty("modelName") String modelName, @JsonProperty("license_Number") int license_Number, @JsonProperty("available_Energy_Percentage") int available_Energy_Percentage, @JsonProperty("tire_Pressure") int tire_Pressure, @JsonProperty("max_Tire_Pressure") int max_Tire_Pressure){
        super(modelName, license_Number, available_Energy_Percentage, tire_Pressure, max_Tire_Pressure, 2, BATTERY);
    }
    public int getAvailable_Energy_Percentage() {
        return super.getAvailable_Energy_Percentage();
    }

    public int getLicense_Number() {
        return super.getLicense_Number();
    }

    public int getMax_Tire_Pressure() {
        return super.getMax_Tire_Pressure();
    }

    public int getTire_Pressure() {
        return super.getTire_Pressure();
    }

    public String getModelName() {
        return super.getModelName();
    }
    public void inflate_tire(){
        super.inflate_tire();
    }
    public void add_Energy(int percentage) {
        super.add_Energy(percentage);
    }
}
