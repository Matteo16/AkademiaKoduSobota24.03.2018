import java.util.Scanner;

public class Menu {

    public static int mainScreen(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Add car");
        System.out.println("2. List cars");
        System.out.println("3. Exit");

        return scanner.nextInt();
    }

    public static int carTypeScreen(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Family car");
        System.out.println("2. Bus");
        System.out.println("3. Truck");
        System.out.println("4. Offroad");
        System.out.println("5. Back");

        return scanner.nextInt();
    }
}
