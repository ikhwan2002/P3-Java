import java.util.HashMap;

public class P3W_HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> days = new HashMap<>();

        days.put(1, "Minggu");
        days.put(2, "Senin");
        days.put(3, "Selasa");
        days.put(4, "Rabu");
        days.put(5, "Kamis");
        days.put(6, "Jum'at");
        days.put(7, "Sabtu");

        System.out.println("Isi objek days: " + days);
        System.out.println("Hari kedua: : " + days.get(2));

        days.put(1, "Ahad");

        days.replace(4, "Rabo");

        System.out.println("Isi objek days: " + days);

        days.remove(1);

        System.out.println("Isi objek days: " + days);

        days.clear();
        System.out.println("Isi objek days: " + days);
    }
}

