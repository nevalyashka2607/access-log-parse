import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Введите первое число: ");
        long firstNumber = new Scanner(System.in).nextLong();
        System.out.print("Введите второе число: ");
        long secondNumber = new Scanner(System.in).nextLong();
        long sum = firstNumber + secondNumber;
        System.out.println("Сумма чисел: " + sum);
        System.out.println("Разность чисел: " + (firstNumber - secondNumber)); ///Можно поставить  Math.abs чтобы не появлялось отриццательного числа
        System.out.println("Произведение чисел : " + (firstNumber * secondNumber));
        System.out.println("Частное чисел :" + ((double) firstNumber / secondNumber));


    }
}