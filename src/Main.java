import java.util.Scanner;

public class Main {
    public static void main(String[] args) { // Добавь параметры здесь!
        System.out.println("Vvedite text i nazhmite <Enter>");

        String text = new Scanner(System.in).nextLine();
        System.out.println("Dlina teksta: " + text.length());
    }
}