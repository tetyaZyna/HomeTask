import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner moneyIn = new Scanner(System.in);
        System.out.print("Ведіть кількість гривень: ");
        int money = moneyIn.nextInt();
        if (money == 1) {
            System.out.println(money + " гривня");
        } else if (money > 1 && money < 5) {
            System.out.println(money + " гривні");
        } else if (money == 0 || money >= 5) {
            System.out.println(money + " гривень");
        } else {
            System.out.println("Помилка введеня");
        }
    }
}
