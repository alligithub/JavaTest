public class FindCharacterInSentence {

    //Поиск буквы Ы в предложении

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
}
