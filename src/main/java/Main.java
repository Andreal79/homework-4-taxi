import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите расстояние Вашей поездки в км.: ");
        int distance = input.nextInt();
        System.out.println("Расстояние Вашей поездки: " + distance + " км.");
        int costKilometer = 20;
        int costBoarding = 60;
        int price = distance * costKilometer + costBoarding;
        int divider = 100;
        int discountRate = 5;
        int discount = price * discountRate / divider;
        int priceBorder = 1000;
        if (price <= priceBorder) {
            System.out.println("Стоимость Вашей поездки: " + price + " руб.");
        } else {
            int discountLimit = 100;
            if (discount < discountLimit) {
                int discountPrice = price - discount;
                System.out.println("Стоимость Вашей поездки: " + discountPrice + " руб.");
                System.out.println("Скидка составила: " + discount + " руб.");
            } else {
                int maxDiscountPrice = price - discountLimit;
                System.out.println("Стоимость Вашей поездки: " + maxDiscountPrice + " руб.");
                System.out.println("Скидка составила: 100 руб.");
            }
        }
    }
}

