import java.util.Arrays;

public class TestClass {

    public static void main(String[] args) {


// Создаем два массива
        int[] a1 = new int[10];
        int[] a2 = new int[10];
// заполняем их девятками
        Arrays.fill(a1, 9);
        Arrays.fill(a2, 9);
        System.out.println("Сравним: " + Arrays.equals(a1, a2));




    }
}
