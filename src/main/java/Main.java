import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите расстояние Вашей поездки в км.: ");
        int distance = input.nextInt();
        System.out.println("Расстояние Вашей поездки: " + distance + " км.");
        int costKilometer = 20;
        int costBoarding = 60;
        int amount = distance * costKilometer + costBoarding;
        int divider = 100;
        int discountRate = 5;
        int sale = amount * discountRate / divider;
        int priceBorder = 1000;
        if (amount <= priceBorder) {
            System.out.println("Стоимость Вашей поездки: " + amount + " руб.");
        } else {
            int discountLimit = 100;
            if (sale < discountLimit) {
                int amount2 = amount - sale;
                System.out.println("Стоимость Вашей поездки: " + amount2 + " руб.");
                System.out.println("Скидка составила: " + sale + " руб.");
            } else {
                int amount3 = amount - discountLimit;
                System.out.println("Стоимость Вашей поездки: " + amount3 + " руб.");
                System.out.println("Скидка составила: 100 руб.");
            }
        }
    }
}

