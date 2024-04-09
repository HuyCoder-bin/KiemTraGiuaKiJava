package VehicleManagement;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.List;

public class FileHandlerWriter {
	public static void writeVehiclesToFile(List<ICar> vehicles) {
		try 
		{
			PrintWriter bw = new PrintWriter(new FileWriter("DataVehicles.txt"));
			for(ICar vehicle : vehicles) {
				if (vehicle instanceof Motorcycle) {
					Motorcycle motorcycle = (Motorcycle) vehicle;
					bw.write("Motorcycle"+";");
					bw.write(motorcycle.getID()+";");
					bw.write(motorcycle.getBrand()+";");
					bw.write(motorcycle.getPublishYear()+";");
					bw.write(motorcycle.getPrice()+";");
					bw.write(motorcycle.getColor()+";");
					bw.write(motorcycle.getCapacity()+"\n");
				} else if (vehicle instanceof Car) {
					Car car = (Car) vehicle;
					bw.write("Car"+";");
					bw.write(car.getID()+";");
					bw.write(car.getBrand()+";");
					bw.write(car.getPublishYear()+";");
					bw.write(car.getPrice()+";");
					bw.write(car.getColor()+";");
					bw.write(car.getColor()+";");
					bw.write(car.getEngineType()+"\n");
					
				} else if (vehicle instanceof Truck) {
					Truck truck = (Truck) vehicle;
					bw.write("Truck"+";");
					bw.write(truck.getID()+";");
					bw.write(truck.getBrand()+";");
					bw.write(truck.getPublishYear()+";");
					bw.write(truck.getPrice()+";");
					bw.write(truck.getColor()+";");
					bw.write(truck.getLoadWeight()+"\n");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
