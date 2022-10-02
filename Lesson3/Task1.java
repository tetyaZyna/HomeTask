import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner numIn = new Scanner(System.in);
        System.out.print("Введіть ціле число: ");
        int num = numIn.nextInt();
        if (num % 10 == 3) {
            System.out.println("Остання цифра числа - 3");
        } else if (num % 10 != 3) {
            System.out.println("Остання цифра числа не 3");
        } else {
            System.out.println("Невірно ведені данні");
        }
    }
}