package VehicleManagement;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;



public class FileHandlerReader {
	public static List<ICar> readVehiclesFromFile() {
        List<ICar> vehicles = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("DataVehicles.txt")))
        {
        	
        	String line;
            while ((line = br.readLine()) != null) {
                String[] tokens = line.split(";");
                if (tokens.length > 0) {
                    String type = tokens[0];
                    if ("Motorcycle".equals(type) && tokens.length == 6) {
                        vehicles.add(new Motorcycle(Integer.parseInt(tokens[1]), tokens[2], Integer.parseInt(tokens[3]), Double.parseDouble(tokens[4]), tokens[5], Integer.parseInt(tokens[6])));
                    } else if ("Truck".equals(type) && tokens.length == 6) {
                    	vehicles.add(new Truck(Integer.parseInt(tokens[1]), tokens[2], Integer.parseInt(tokens[3]), Double.parseDouble(tokens[4]), tokens[5], Double.parseDouble(tokens[6])));
                    	
                    } else if ("Car".equals(type) && tokens.length == 7) {
                    	vehicles.add(new Car(Integer.parseInt(tokens[1]), tokens[2], Integer.parseInt(tokens[3]), Double.parseDouble(tokens[4]), tokens[5], Integer.parseInt(tokens[6]), tokens[7]));
                    } else {
                        System.out.println("Invalid line format: " + line);
                    }
                }
            }
		} catch (Exception e) {
			System.err.println("File empty!");
		}  
        return vehicles;
	}
}
