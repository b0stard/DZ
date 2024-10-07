import java.util.Scanner;

public class DZ413 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//4.13

        System.out.println("Введите коэффициент a (a != 0): ");
        double a = scanner.nextDouble();

        System.out.println("Введите коэффициент b: ");
        double b = scanner.nextDouble();

        System.out.println("Введите коэффициент c: ");
        double c = scanner.nextDouble();

        if (a==0){
            System.out.println("это не уравнение");
         }
        double discriminant = Math.pow(b, 2) - 4 * a * c;
        if (discriminant >= 0){
            System.out.println("Уравнение имеет вещественные корни");
        }else {
            System.out.println("Уравнение не имеет вещественных корней");
           }
        }
    }

