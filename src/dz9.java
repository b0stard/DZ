import java.util.Scanner;

public class dz9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите коэффициент a (a != 0): ");
        double a = scanner.nextDouble();

        System.out.print("Введите коэффициент b: ");//4.97
        double b = scanner.nextDouble();

        System.out.print("Введите коэффициент c: ");
        double c = scanner.nextDouble();

        if (a == 0) {
            System.out.println("это не уравнение");
            return;
        }
        double discriminant = Math.pow(b, 2) - 4 * a * c;


        if (discriminant >= 0) {

            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);


            System.out.println("Уравнение имеет корни:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else {
            System.out.println("Уравнение не имеет  корней.");
        }
    }
}
