public class Truck extends Car{

    private int maxCarWeight;
    private double height;
    private int axleNumber;
    private boolean truckTrailer;

    public Truck(String brand, String model, String color, int power, int engineCapasity, double fuelConsumption,
                 String registrationNumber, int maxCarWeight, double height, int axleNumber, boolean truckTrailer) {
        super(brand, model, color, power, engineCapasity, fuelConsumption, registrationNumber);
        this.maxCarWeight = maxCarWeight;
        this.height = height;
        this.axleNumber = axleNumber;
        this.truckTrailer = truckTrailer;
    }

    public int getMaxCarWeight() {
        return maxCarWeight;
    }

    public double getHeight() {
        return height;
    }

    public int getAxleNumber() {
        return axleNumber;
    }

    public boolean isTruckTrailer() {
        return truckTrailer;
    }

    public void setAxleNumber(int axleNumber) {
        this.axleNumber = axleNumber;
    }

    @Override
    public String toString() {
        return "Truck{" + super.toString() +
                "maxCarWeight=" + maxCarWeight +
                ", height=" + height +
                ", axleNumber=" + axleNumber +
                ", truckTrailer=" + truckTrailer +
                '}';
    }
}
