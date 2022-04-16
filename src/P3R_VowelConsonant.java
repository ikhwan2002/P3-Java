public class P3R_VowelConsonant {
    public static void main(String[] args) {
        String s = "A programmer gets stuck in the shower because the instructions on the shampoo were: Lather,Wash and Repeat.";
        System.out.println(s);
        s = s.toLowerCase();

        int vowelCount = 0;
        int consonantCount = 0;

        String vowels = "aeiouy";
        String consonants = "bcdfghjklmnpqrstvwxz";

        char c[] = s.toCharArray();

        for (int i = 0; i < c.length; i++){
            if (vowels.contains(String.valueOf(c[i]))){
                vowelCount++;
            }else if (consonants.contains(String.valueOf(c[i])));
            consonantCount++;
        }

        System.out.printf("Vowels : %d\n", vowelCount);
        System.out.printf("Consonants : %d\n", consonantCount);
        System.out.printf("Other charachters : %d\n", (c.length - (vowelCount + consonantCount)));
    }
}
