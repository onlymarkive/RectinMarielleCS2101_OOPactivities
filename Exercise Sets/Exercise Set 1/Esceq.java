public class Escep {
    public static void main(String[] args) {
        int multiple = 7;

        for (int i = 1; i <= 5; i++) {
            if (i % 2 != 0) {
                System.out.println(multiple);
            } 
            else {
                System.out.println("\t" + multiple);
            }

            multiple += 7;
        }
    }
}
