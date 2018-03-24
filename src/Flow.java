import java.util.InputMismatchException;
import java.util.Scanner;

public class Flow {

    public static void start() {

        boolean exitFlag = false;
        do {
            System.out.println();
            System.out.println("------------");
            System.out.println();
            int choice = Menu.mainScreen();

            switch (choice) {
                case 1:
                    typeCarFlow();
                    break;

                case 2:
                    CarRepository.showCars();
                    break;
                case 3:
                    exitFlag = true;
                    break;
            }
        } while (!exitFlag);
        System.exit(0);
    }

    private static void typeCarFlow() {
        int choice = Menu.carTypeScreen();
        CarDataWrapper cdw;

        switch (choice) {
            case 1:
                cdw = readMainParameters();
                Scanner scanner = new Scanner(System.in);
                System.out.println("Seat numbers: ");
                int seats = scanner.nextInt();
                FamilyCar fc = new FamilyCar(cdw, seats);
                break;
            case 2:
                cdw = readMainParameters();
                scanner = new Scanner(System.in);
                System.out.println("Seat number: ");
                int seatsNumber = scanner.nextInt();
                System.out.println("Standing places: ");
                int standingPlaces = scanner.nextInt();
                System.out.println("Height: ");
                double height = scanner.nextInt();
                System.out.println("Lenght: ");
                double lenght = scanner.nextInt();

                Bus b = new Bus(cdw, seatsNumber, standingPlaces, height, lenght);
                break;
        }
    }

    private static CarDataWrapper readMainParameters() {
        Scanner scanner = new Scanner(System.in);

        CarDataWrapper carDataWrapper = new CarDataWrapper();

        System.out.println("Brand: ");
        carDataWrapper.brand = scanner.nextLine();
        System.out.println("Model: ");
        carDataWrapper.model = scanner.nextLine();
        System.out.println("Color: ");
        carDataWrapper.color = scanner.nextLine();


        carDataWrapper.rentPrice = ourScanner("Rent Price");

        System.out.println("Power: ");
        carDataWrapper.power = scanner.nextInt();
        System.out.println("Engine capacity: ");
        carDataWrapper.engineCapasity = scanner.nextInt();
        System.out.println("Fuel cosumption: ");
        carDataWrapper.fuelConsumption = scanner.nextDouble();
        System.out.println("Registration number: ");
        scanner.nextLine();  // pod double dalismy scanner zeby nie przeskakiwal dalej
        carDataWrapper.registrationNumber = scanner.nextLine();
        System.out.println();

        return carDataWrapper;
    }

    public static int ourScanner(String parameterName) {
        int result = 0;
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println(parameterName + ": ");
                result = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println(e.getCause());
                System.out.println("Zepsuło się!!!");
                continue;
            }
            break;

        }
        return result;
    }
}






