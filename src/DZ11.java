import java.util.Scanner;

public class DZ11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите сторону a: ");
        double a = scanner.nextDouble();

        System.out.print("Введите сторону b: ");
        double b = scanner.nextDouble();

        System.out.print("Введите сторону c: ");
        double c = scanner.nextDouble();

        if (a <= 0 || b <= 0 || c <= 0){
            System.out.println("Неправельные стороны треуг");
            return;
        }if (a +b > c && b + c > a && a + c > b){
            System.out.println("существ треуг");
        }else {
            System.out.println("треуг не существует");
        }
    }
}
