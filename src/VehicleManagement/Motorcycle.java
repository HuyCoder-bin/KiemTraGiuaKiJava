package VehicleManagement;

public class Motorcycle extends Vehicle {
    private int capacity;

    public Motorcycle(int ID, String brand, int publishYear, double price, String color, int capacity) {
        super(ID, brand, publishYear, price, color);
        this.capacity = capacity;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Capacity: " + capacity);
    }

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
    
}
