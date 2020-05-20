import java.util.ArrayList;
import java.util.List;

public class ArrListVariations {

    public static void main(String[] args) {

        List<Integer> massive = new ArrayList<>();
        massive.add(2);
        massive.add(5);
        massive.add(10);
        massive.add(3);

        sumMassive(massive);
        averageSumMassive(massive);


    }

    private static void sumMassive(List<Integer> massive) {


        Integer sum = 0;
        for (Integer i = 0; i < massive.size(); i++) {
            sum += massive.get(i);
            System.out.println("Massive item value  = " + massive.get(i));
        }

        System.out.println("Massive total count = " + sum);
    }

    private static void averageSumMassive(List<Integer> massive) {


    }
}

