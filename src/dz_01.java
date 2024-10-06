import java.util.Scanner;

public class dz_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //2.19
        System.out.print("Введите четырехзначное число: ");
        int number_01 = scanner.nextInt();

        if (number_01 < 1000 || number_01 > 9999) {
            System.out.println("Введено не четырехзначное число.");
            return;
        }
        int sum = 0;//a
        int temp = number_01;
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        int product = 1;//б
        temp = number_01;
        while (temp > 0) {
            product *= temp % 10;
            temp /= 10;
        }
        System.out.println("Сумма цифр: " + sum);
        System.out.println("Произведение цифр: " + product);
    }
}