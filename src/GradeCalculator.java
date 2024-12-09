import java.util.Scanner;
public class GradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество баллов (0-100): ");

        int score = scanner.nextInt();
        if (score >= 90 && score <= 100) {

            System.out.println("Оценка: A");
        } else if (score >= 80) {
            System.out.println("Оценка: B");
        } else if (score >= 70) {
            System.out.println("Оценка C");
        } else if (score >= 60) {
            System.out.println("Оценка: D");
        } else if (score < 60 && score >= 0) System.out.println("Оценка: F");
        else {
            System.out.println("Ошибка: введите значение от 0 до 100.");
        }
        scanner.close();
    }
}