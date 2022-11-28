public class CountByThrees {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 3; i < 301; i+=3) {
            if (count == 9) {
                System.out.println();
                count = 0;
            } else {
                System.out.printf("%3d ", i);
                count ++;
            }
        }
    }
}
