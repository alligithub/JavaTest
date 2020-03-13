import java.util.Scanner;  //Пакет
public class DisplaySpecifiedNumber {
    //Ввод и возврат введенного числа
      public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите номер: ");
        int num = in.nextInt(); //Метод ввода целочисленных значений
        System.out.printf("Ваш номер: %d \n", num);
        //in.close();
    }

}
