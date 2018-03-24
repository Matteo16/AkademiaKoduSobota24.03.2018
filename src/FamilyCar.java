public class FamilyCar extends Car {
    private int seatsNumber;

    public FamilyCar(String brand, String model,
                     String color, int power, int engineCapasity, int seatsNumber, double fuelConsumption,
                     String registrationNumber) {
        super(brand, model, color, power, engineCapasity, fuelConsumption, registrationNumber);
        this.seatsNumber = seatsNumber;

    }

    public FamilyCar(CarDataWrapper carDataWrapper, int seatsNumber) {
        super(carDataWrapper);
        this.seatsNumber = seatsNumber;
    }
        public int getSeatsNumber () {
            return this.seatsNumber;
        }


        @Override
        public String toString () {
            return "FamilyCar{" + super.toString() +
                    "seatsNumber=" + seatsNumber +
                    '}';
        }
    }

