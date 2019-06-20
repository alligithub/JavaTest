//Вывести числа от 1 до 5
/*public class TaskProg {
	public static void main(String[] args) {
		for(int i = 1; i <=5 ; i++) {
			System.out.println(i);
		}
	}
}*/

//Вывести числа от 1 до 5 через while
/*public class TaskProg {
	public static void main(String[] args) {
		int x = 1;
		while (x>=1 && x<=5) {
			System.out.println(x);
			x++;
		}
	}
}*/

//Вывести Hello world
/*public class TaskProg {
	public static void main (String[] args) {
		System.out.println("Hello, world");
	}
}*/

//Выводит на экран от 7 до 98
/*public class TaskProg {
	public static void main (String[] args) {
		int a = 7;
		while (a <= 98) {
			System.out.println(a + " LoL ");
			a+=7;
		}
	}
}*/

//Фибоначи
/*public class TaskProg {
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
}*/

//Возведение в степень тройки
/*public class TaskProg {
	public static void main(String[] args) {
		int a = 3; // Возводимое в степень число
		int b = 1; // Результат возведения в степень
		int c = 1; // Начальный показатель степени
		while(c <= 10) { // условие входа в цикл
			b = b * a;
			System.out.println(a + " power to " + c + " = " + b);
			c++;
		}
	}
}*/
//Поиск буквы Ы в предложении
/*public class TaskProg {
    public static void main(String[] args) {
        String searchMe = "Мама мЫла раму";
        //количество символов в строке
        int max = searchMe.length();
        char symb = 'ы';
        boolean find = false;

        for (int i = 0; i < max; i++) {
        // если символ на позиции i в строке равен искомому символу
        if (searchMe.charAt(i) == symb) {
        //переключаемся в режим "найдено" и выходим из цикла
        find = true;
        break;
        }
        }
        //выводим соответствующее сообщение: найден или не найден символ
        if (find)
        System.out.println("Символ '" + symb + "' найден в строке");
        else
        System.out.println("Символ '" + symb + "' не найден в строке");
    }
}*/

//Пирамида чисел
/*public class TaskProg {
    public static void main(String[] args) {
        int x = 9;
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= x - i; j++)
                System.out.print("   ");
            for (int k = i; k >= 1; k--)
                System.out.print((k >= 10) ?+ k : "  " + k);
            for (int k = 2; k <=i; k++)
                System.out.print((k >= 10) ?+ k : "  " + k);
            System.out.println();
        }
    }
}*/

//четное или не четное число
/*public class TaskProg {
    public static void main(String args[]) {
        int n = 53;
        System.out.print("Число " + n + " ");
        if( n % 2 == 0) {
            System.out.println("четное");
        } else {
            System.out.println("нечетное");
        }
    }
}*/

//Удаляет буквы от 4 до 7
/*public class TaskProg {
    public static void main(String args[]) {
        StringBuffer sb = new StringBuffer("123456789");
        sb.delete(3,7);
        System.out.println(sb);
    }
}*/

//Ввод числа от 1 до 3
/*public class TaskProg {
    public static void main(String[] args) {
        int a = 2;
        if ( a <= 3) { System.out.println("Введенное число = " + a); }
        else { System.out.println("Введите число от 1 до 3"); }
    }
}*/

//Ввод и возврат введенного числа
/*import java.util.Scanner;   //Пакет
public class TaskProg {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите номер: ");
        int num = in.nextInt(); //Метод ввода целочисленных значений
        System.out.printf("Ваш номер: %d \n", num);
        //in.close();
    }
}*/

//Вывод на экран кейса под определенным номером, некоторые кейсы сгрупированы
/*public class TaskProg {
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
}*/

public class TaskProg {
    public static void main(String[] args) {
        int n = 10;
        for(int i=0, j = n - 1; i < j; i++, j--){

            System.out.println(i * j);
        }
    }
}