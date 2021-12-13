# Moveo-Garage
****Instruction manual***

Run the program after clone/download.
Use a client plattforn such as POSTMAN.

Add a Vehicle to the data-base:
  **POST**
  1. to add a regular motorcycle--> localhost:8080/api/v1/vehicle/1
  2. To add an electric motorcycle-->localhost:8080/api/v1/vehicle/2
  3. To add a regular car--> localhost:8080/api/v1/vehicle/3
  4. To add an electric car--> localhost:8080/api/v1/vehicle/4
  5. To add a truck--> localhost:8080/api/v1/vehicle/5
  in the body section choose **raw** and json (in the menu to the right)
  the body will be a json with the followin structure:
      {
      "modelName": "string",
      "license_Number": number,
      "available_Energy_Percentage": number,
      "tire_Pressure": number,
      "max_Tire_Pressure": number
      }
      
      example:
      {
        "modelName": "ford",
        "license_Number": 14,
        "available_Energy_Percentage": 90,
        "tire_Pressure": 40,
        "max_Tire_Pressure": 50
      }
      
  **GET**
  1. To get a list of all the vehicles you simply choose GET with 8080/api/v1/vehicle
  2. to get just one car you choolse GET with localhost8080/api/v1/vehicle/licensenumber while license number is the license number of that car.

  **put**
  1. Inflate a tire to its max pressure choose PUT with localhost:8080/api/v1/vehicle/licensenumber while license number is the license number of that vehicle.
  2. Add energy--> choose PUT with localhost:8080/api/v1/vehicle/licensenumber/energy while energy is the percent you want to add to the energy of the vehicle.
 
 
 **notes**
 1. If you choose pressure to be more than max pressure when you POST, the pressure will be equal to max pressue.
 2. If you add energy and it sums up to be more than 100% with the exist energy, than it will be sum up to be 100 instead.
      
      
