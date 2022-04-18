public class P3S_CaesarChiper {
    public static void main(String[] args) {
        String s = "blackholesarewheregoddividedbyzero";
        System.out.printf("Original message: %s\n", s);
        String message = "";
        int shift = 1;
        char arrayStr[] = s.toCharArray();

        for (char c : arrayStr){
            int i = (int) c;
            i += shift;
            if (i > (int) 'z'){
                i -= 26;
            }
            char newChar = (char) i;
            message += newChar;
        }
        System.out.printf("Encrypted message: %s\n", message);
    }
}
