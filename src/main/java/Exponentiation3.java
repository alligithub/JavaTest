public class Exponentiation3 {
    //Возведение в степень тройки
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

}
