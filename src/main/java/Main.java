import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите расстояние Вашей поездки в км.: ");
        int distance = input.nextInt();
        System.out.println("Расстояние Вашей поездки: " + distance + " км.");
        int amount = distance * 20 + 60;
        int i = 100;
        int sale = amount * 5 / i;
        if (amount <= 1000) {
            System.out.println("Стоимость Вашей поездки: " + amount + " руб.");
        } else if (sale < i) {
            int amount2 = amount - sale;
            System.out.println("Стоимость Вашей поездки: " + amount2 + " руб.");
            System.out.println("Скидка составила: " + sale + " руб.");
        } else {
            int amount3 = amount - i;
            System.out.println("Стоимость Вашей поездки: " + amount3 + " руб.");
            System.out.println("Скидка составила: 100 руб.");
        }
    }
}

