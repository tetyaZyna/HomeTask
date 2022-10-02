import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner numIn = new Scanner(System.in);
        System.out.print("Введіть число: ");
        int n = 0, num = numIn.nextInt();
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                n = n + 1;
            }
        }
        if (n == 2) {
            System.out.println(num + " - просте");
        } else {
            System.out.println(num + " - складене");
        }
    }
}
