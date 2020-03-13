public class DisplayCertainNumbers {
    //Вывод на экран кейса под определенным номером, некоторые кейсы сгрупированы
    public static void main(String[] args) {
        int num = 5;
        int output = 0;
        switch(num){
            case 1:
                output = 3;
                break;
            case 2:
            case 3:
            case 4:
                output = 6;
                break;
            case 5:
                output = 12;
                break;
            default:
                output = 24;
        }
        System.out.println(output);
        //Вывод Z будет равно второму или третьему в зависимости от условия
        int x=3;
        int y=2;
        int z = x<y? (x+y) : (x-y);
        System.out.println(z);

    }
}
