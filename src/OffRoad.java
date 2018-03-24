public class OffRoad extends Car{
    private boolean reductor;
    private boolean x4drive;
    private boolean spareWheel;

    public OffRoad(String brand, String model, String color, int power, int engineCapasity, double fuelConsumption,
                   String registrationNumber, boolean reductor, boolean x4drive, boolean spareWheel) {
        super(brand, model, color, power, engineCapasity, fuelConsumption, registrationNumber);
        this.reductor = reductor;
        this.x4drive = x4drive;
        this.spareWheel = spareWheel;
    }

    public boolean isReductor() {
        return reductor;
    }

    public boolean isX4drive() {
        return x4drive;
    }

    public boolean isSpareWheel() {
        return spareWheel;
    }

    @Override
    public String toString() {
        return "OffRoad{" + super.toString() +
                "reductor=" + reductor +
                ", x4drive=" + x4drive +
                ", spareWheel=" + spareWheel +
                '}';
    }
}

