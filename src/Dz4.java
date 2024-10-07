import java.util.Scanner;

public class Dz4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//4.9

        System.out.print("Введите скорость км/ч:");
        double speedKh = scanner.nextDouble();

        System.out.print("Введите скорость м/c:");
        double speedMh = scanner.nextDouble();

        double speedKtoM = speedKh * 1000 / 3600;

        if (speedKh > speedMh){
            System.out.println("скорость в км/ч больше");
        } if (speedKh < speedMh) {
            System.out.println("скорость в м/c больше");
         }else if (speedKh == speedMh){
            System.out.println("скорости равны");
        }
        }
    }

