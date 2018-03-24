public class Bus extends Car{

    private int seatsNumber, standingPlaces;
    private double lenght, height;

    public Bus(String brand, String model, String color, int power, int engineCapasity, double fuelConsumption,
               String registrationNumber,
               int seatsNumber, int standingPlaces,
               double lenght, double height) {
        super(brand, model, color, power, engineCapasity, fuelConsumption, registrationNumber);
        this.seatsNumber = seatsNumber;
        this.standingPlaces = standingPlaces;
        this.height = height;
        this.lenght = lenght;
    }

    public Bus(CarDataWrapper carDataWrapper, int seatsNumber, int standingPlaces, double height, double lenght){
        super(carDataWrapper);
        createMainBusParameters(seatsNumber, standingPlaces, height, lenght);
    }
    private void createMainBusParameters(int seatsNumber, int standingPlaces, double height, double lenght){
        this.seatsNumber = seatsNumber;
        this.standingPlaces = standingPlaces;
        this.height = height;
        this.lenght = lenght;
    }

    public int getSeatsNumber() {
        return seatsNumber;
    }

    public int getStandingPlaces() {
        return standingPlaces;
    }

    public double getLenght() {
        return lenght;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Bus{" + super.toString() +
                "seatsNumber=" + seatsNumber +
                ", standingPlaces=" + standingPlaces +
                ", lenght=" + lenght +
                ", height=" + height +
                '}';
    }
}

