import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      int a = 234; // 2.5
      int b = 7;
        System.out.println(a / b);

        Scanner scanner = new Scanner(System.in);//2.6
        System.out.println("Прошло времени с начала суток");
        int time = scanner.nextInt();

        int hours = time / 3600;//a

        int minutes = (time & 3600) / 60;//б

        int seconds = time / 60 ;//в

        System.out.println("Прошло часов " + hours + " с начала дня");
        System.out.println("Прошло минут " + minutes + " c начала часа");
        System.out.println("Прошло секунд " + seconds + " с начала времени минуты");



    }
}