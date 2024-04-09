package VehicleManagement;

//E:\\23IT.EB046_Phan Nguyen Phuc Huy
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

	static void menu() {
		System.out.println("*************Vehicle Management************");
		System.out.println("* 1. Add vehicle.                         *\n"
				+ "* 2. Delete vehicle.                      *\n" + "* 3. Edit vehicle.                        *\n"
						+  "* 4. Show info of all vehicles.           *\n"
				+ "* 5. Exit.                                *\n" + "*******************************************\n");
		System.out.print("Choose option: ");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opt = 0;
		int opt_type = 0;
		List<ICar> vehicles = new ArrayList<>();

		do {
			vehicles = FileHandlerReader.readVehiclesFromFile();
			System.out.println("\n");
			menu();
			opt = Integer.parseInt(sc.nextLine());
			switch (opt) {
			case 1: {
				System.out.println("[1]ADD VEHICLE.");
//				protected int ID;
//			    protected String brand;
//			    protected int publishYear;
//			    protected double price;
//			    protected String color;
				System.out.print("Enter ID: ");
				int iD = Integer.parseInt(sc.nextLine());
				System.out.print("Enter brand: ");
				String brand = sc.nextLine();
				System.out.print("Enter publish Year: ");
				int publishYear = Integer.parseInt(sc.nextLine());
				System.out.print("Enter price: ");
				Double price = Double.parseDouble(sc.nextLine());
				System.out.print("Enter color: ");
				String color = sc.nextLine();
				System.out.print("Please choose type of vehicle: " + "\n1. Car\n" + "2. Truck\n" + "3. Motorcycle\n");
				System.out.println("Choose option: ");
				opt_type = Integer.parseInt(sc.nextLine());
				switch (opt_type) {
				case 1: {
//					Car(int ID, String brand, int publishYear, double price, String color, int slots, String engineType)
					System.out.print("Enter slots: ");
					int slots = Integer.parseInt(sc.nextLine());
					System.out.print("Enter engine type: ");
					String engineType = sc.nextLine();
					vehicles.add(new Car(iD, brand, publishYear, price, color, slots, engineType));
				}break;
				case 2: {
					System.out.print("Enter load Weight: ");
					double loadWeight = Double.parseDouble(sc.nextLine());
					vehicles.add(new Truck(iD, brand, publishYear, price, color, loadWeight));
				} break;
				case 3: {
					System.out.println("Enter capacity: ");
					int capacity = Integer.parseInt(sc.nextLine());
					vehicles.add(new Motorcycle(iD, brand, publishYear, price, color, capacity));
				}break;
				}

			}break;
			case 2: {
				System.out.println("[2]DELETE VEHICLE.");
				
			}break;
			case 3: {
				System.out.println("[3]EDIT VEHICLE.");

			}break;

			case 4:{
				for (ICar vehicle : vehicles) {
					vehicle.showInfo();
				}
			}break;
		case 5:{
			FileHandlerWriter.writeVehiclesToFile(vehicles);
			System.exit(0);
		}
		}
		} while (opt > 0 && opt < 5);
	}
}
