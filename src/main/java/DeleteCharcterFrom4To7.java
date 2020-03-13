public class DeleteCharcterFrom4To7 {
    //Удаляет буквы от 4 до 7
    public static void main(String args[]) {
        StringBuffer sb = new StringBuffer("123456789");
        sb.delete(3,7);
        System.out.println(sb);
    }
}
