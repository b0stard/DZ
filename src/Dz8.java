import java.util.Scanner;

public class Dz8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Прошло времени с начала часа:");//4.36
        double time = scanner.nextDouble();

        if (time >= 0 && time < 3){
            System.out.println("зеленый цвет");
        }else if (time >= 4 && time < 6){
            System.out.println("Красный цвет");
        }
    }
}
