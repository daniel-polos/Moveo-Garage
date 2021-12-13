package spring.Moveo.Garage.Management.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Vehicle {
    private final String modelName;
    private final int license_Number;
    private int available_Energy_Percentage;
    private int tire_Pressure;
    private final int max_Tire_Pressure;
    private final int num_Of_Wheels;
    private final Energy_Source energy_source;


    //Vehicle gets the num of wheels from the creation by the types, not from Client.
    public Vehicle(@JsonProperty("modelName") String modelName,@JsonProperty("license_Number") int license_Number,@JsonProperty("available_Energy_Percentage") int available_Energy_Percentage,@JsonProperty("tire_Pressure") int tire_Pressure,@JsonProperty("max_Tire_Pressure") int max_Tire_Pressure,@JsonProperty("num_Of_Wheels") int num_Of_Wheels, Energy_Source energy_source){
        this.modelName = modelName;
        this.license_Number = license_Number;
        this. available_Energy_Percentage = available_Energy_Percentage;
        this.tire_Pressure = tire_Pressure;
        this.max_Tire_Pressure = max_Tire_Pressure;
        this.num_Of_Wheels =num_Of_Wheels;
        this.energy_source = energy_source;
        if (tire_Pressure > max_Tire_Pressure){
            this.tire_Pressure = max_Tire_Pressure;
        }
    }

    public int getAvailable_Energy_Percentage() {
        return available_Energy_Percentage;
    }

    public int getLicense_Number() {
        return license_Number;
    }

    public int getMax_Tire_Pressure() {
        return max_Tire_Pressure;
    }

    public int getTire_Pressure() {
        return tire_Pressure;
    }

    public String getModelName() {
        return modelName;
    }
    //inflate the tire to its max pressure
    public void inflate_tire(){
        this.tire_Pressure = max_Tire_Pressure;
    }
    //reveive a percentage (Integer) as an input. refuel the battery/gas by that percentage
    public void add_Energy(int percentage){
        this.available_Energy_Percentage  = this.available_Energy_Percentage + percentage;
        //can't be more than 100% fueled
        if (this.available_Energy_Percentage > 100)
            this.available_Energy_Percentage = 100;
    }
    public int getNum_Of_Wheels(){
        return this.num_Of_Wheels;
    }
    public Energy_Source getEnergy_source(){return this.energy_source;}
}
