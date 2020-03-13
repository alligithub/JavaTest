public class Fibonachi {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int c;
        System.out.println(a);
        System.out.println(b);
        for (int i = 1; i <= 9; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.println(c);
        }
    }
}
