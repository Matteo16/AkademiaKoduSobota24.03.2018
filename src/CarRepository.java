import java.util.ArrayList;

public class CarRepository {
    static ArrayList<Car> carsList = new ArrayList<>();

    public static void showCars() {
        for (Car car : CarRepository.carsList){
            System.out.println(car.toString());
        }
    }

    public static void addCarToList(Car car){

    }
}
