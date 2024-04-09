package VehicleManagement;

public class Car extends Vehicle {
    private int slots;
    private String engineType;

    public Car(int ID, String brand, int publishYear, double price, String color, int slots, String engineType) {
        super(ID, brand, publishYear, price, color);
        this.slots = slots;
        this.engineType = engineType;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Slots: " + slots);
        System.out.println("Engine Type: " + engineType);
    }

	public int getSlots() {
		return slots;
	}

	public void setSlots(int slots) {
		this.slots = slots;
	}

	public String getEngineType() {
		return engineType;
	}

	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}
    
}
