import java.util.Scanner;

public class DZ410 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//4.10

        System.out.print("Введите радиус круга:");
        double radius = scanner.nextDouble();

        System.out.print("Введите сторону квадрата:");
        double side = scanner.nextDouble();

        double circleArea = Math.PI * Math.pow(radius,2);//радиус
        double squareArea =  Math.pow(side,2);//квадрат

        if (circleArea > squareArea){
            System.out.println("радиус круга больше,чем сторона квадрата");
          }if (squareArea > circleArea){
            System.out.println("сторона квадрата больше,чем раддиус круга");
          } else if (squareArea == circleArea) {
            System.out.println("они равны");

        }
      }
    }


