import java.util.HashMap;
import java.util.Map;

public class P3X2_BukuHashMap {
    public static void main(String[] args) {
        HashMap<String, P3X1_Buku> books = new HashMap<>();

        P3X1_Buku bukuJava = new P3X1_Buku("Tutorial Java", "Petani Kode");
        P3X1_Buku bukuKotlin = new P3X1_Buku("Pemrograman Kotlin", "Petani Kode");
        P3X1_Buku bukuAndroid = new P3X1_Buku("Pemrograman Android", "Petani Kode");

        books.put("java", bukuJava);
        books.put("kotlin", bukuKotlin);
        books.put("android", bukuAndroid);

        System.out.println("\nDaftar key : ");
        for (String i : books.keySet()){
            System.out.println(i);
        }
        for (P3X1_Buku aBook : books.values()){
            System.out.println("Title ; " + aBook.getTitle() + ", Author : " + aBook.getAuthor());
        }
        for (Map.Entry b : books.entrySet()){
            P3X1_Buku buku = (P3X1_Buku) b.getValue();
            System.out.println(b.getKey() + ": " + buku.getTitle());
        }
    }
}
