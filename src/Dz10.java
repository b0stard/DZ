import java.util.Scanner;

public class Dz10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);///4.97
        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();

        System.out.print("Введите третье число: ");
        int num3 = scanner.nextInt();


        int big = num1;//большое
        if (num2 > big) {
            big = num2;
        } else if (num3 < big) {
            big = num3;
        }
        int little = num1;//меньшее
        if (num2 < little) {
            little = num2;
        } else if (num3 < little) {
            little = num3;
            int middle = num1 + num2 + num3 - big - little;//cреднее

            System.out.println("Наибольшее число: " + big);
            System.out.println("Наименьшее число: " + little);
            System.out.println("Среднее число: " + middle);
        }
    }
}
