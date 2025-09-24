import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Введите первое число: ");
        long fitstnumber = new Scanner(System.in).nextLong();
        System.out.print("Введите второе число: ");
        long secondnumber = new Scanner(System.in).nextLong();

        long sum = fitstnumber + secondnumber;
        System.out.println("Сумма чисел: " + sum);

        long a = fitstnumber;
        long b = secondnumber;

        System.out.println("Разность чисел: " + (a - b)); ///Можно поставить  Math.abs чтобы не появлялось отриццательного числа

        long a1 = fitstnumber;
        long a2 = secondnumber;
        System.out.println("Произведение чисел : " + (a1 * a2));

        long a4 = fitstnumber;
        long a5 = secondnumber;
        System.out.println("Частное чисел :" + ((double) a4 / a5));


    }
}