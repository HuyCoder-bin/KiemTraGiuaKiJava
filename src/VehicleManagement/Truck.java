package VehicleManagement;

public class Truck extends Vehicle {
    private double loadWeight;

    public Truck(int ID, String brand, int publishYear, double price, String color, double loadWeight) {
        super(ID, brand, publishYear, price, color);
        this.loadWeight = loadWeight;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Load Weight: " + loadWeight);
    }

	public double getLoadWeight() {
		return loadWeight;
	}

	public void setLoadWeight(double loadWeight) {
		this.loadWeight = loadWeight;
	}
    
}
