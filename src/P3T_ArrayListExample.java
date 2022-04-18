import java.util.ArrayList;

public class P3T_ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);

        for (int i = 0; i < cars.size(); i++){
            System.out.printf("%s ", cars.get(i));
        }
        System.out.println();

        for (String car : cars){
            System.out.printf("%s ", car);
        }
        System.out.println();

        cars.forEach((car)->{
            System.out.printf("%s ", cars);
        });
        System.out.println();
    }
}
