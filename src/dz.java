import java.util.Scanner;

public class dz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//2.13
        System.out.print("Введите трехзначное число: ");
        int number = scanner.nextInt();

        if (number < 100 || number > 999) {
            System.out.println("Введено не трехзначное число.");
            return;
        }

        int reversedNumber = 0;
        reversedNumber += number % 10;
        number /= 10;
        reversedNumber += (number % 10) * 10;
        number /= 10;
        reversedNumber += number * 100;

        System.out.println("Число, полученное справа налево: " + reversedNumber);

    }
}
