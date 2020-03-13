public class MethodWithParameters {
    //Умножение на 2 чисел из массива
    public static void main(String[] args) {
        int[] array = new int[] { 1, 2, 3, 4, 5 };
        for (int i=0; i<array.length;i++){
            array[i] = array[i] * 2;
            System.out.println(array[i]);
        }
    }
}
