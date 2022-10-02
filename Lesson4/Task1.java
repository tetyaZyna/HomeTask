import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner countIn = new Scanner(System.in);
        System.out.print("Введіть ціле число: ");
        int count = countIn.nextInt(), a = 1, S = a;
        System.out.print(a + " ");
        for (int i = 1; i < count; i++) {
            a = a + 2;
            S = S + a;
            System.out.print(a  + " ");
        }
        System.out.println();
        System.out.println("Сума: " + S);
    }
}
