public class Car {
    private String brand;
    private String model;
    private String color;
    private int rentPrice;
    private int power;
    private int engineCapasity;
    private double fuelConsumption;
    private String registrationNumber;

    public Car(String brand, String model, String color, int power, int engineCapasity, double fuelConsumption,
               String registrationNumber) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.power = power;
        this.engineCapasity = engineCapasity;
        this.fuelConsumption = fuelConsumption;
        this.registrationNumber = registrationNumber;
        CarRepository.carsList.add(this);  // wazne od razu jak skonczysz robic samochod dodaj odrazu samochod do listy
    }

    public Car(CarDataWrapper carDataWrapper){
        this.brand = carDataWrapper.brand;
        this.model = carDataWrapper.model;
        this.color = carDataWrapper.color;
        this.power = carDataWrapper.power;
        this.engineCapasity = carDataWrapper.engineCapasity;
        this.fuelConsumption = carDataWrapper.fuelConsumption;
        this.registrationNumber = carDataWrapper.registrationNumber;
        CarRepository.carsList.add(this);

    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getRentPrice() {
        return rentPrice;
    }

    public int getPower() {
        return power;
    }

    public int getEngineCapasity() {
        return engineCapasity;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRentPrice(int rentPrice) {
        this.rentPrice = rentPrice;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    @Override
    public String toString() {
        return
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", rentPrice=" + rentPrice +
                ", power=" + power +
                ", engineCapasity=" + engineCapasity +
                ", fuelConsumption=" + fuelConsumption +
                ", registrationNumber='" + registrationNumber + '\''
                ;

    }
}


