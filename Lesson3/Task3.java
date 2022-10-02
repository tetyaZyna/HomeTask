import  java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner coefficientIn = new Scanner(System.in);
        System.out.print("Введіть а: ");
        double a = coefficientIn.nextDouble();
        System.out.print("Введіть b: ");
        double b = coefficientIn.nextDouble();
        System.out.print("Введіть c: ");
        double c = coefficientIn.nextDouble();
        double x;

        if (a == 0){ // bx + c = 0
            System.out.println("Рівняння не є квадратним");
            x = -c/b;
            System.out.println("Корнь х= " + x);
        }
        else if (b == 0 && c == 0){ // ax² = 0
            System.out.println("x = 0");
        } else if (b == 0) { // ax² + c = 0
            x = -c/a;
            if (x < 0){
                System.out.println("Рівняння не має коренів");
            } else {
                x = Math.sqrt(x);
                System.out.println("Корені рівняння: х1 = " + x + " x2 = " + x * -1);
            }
        } else if (c == 0) { // ax² + bx = 0
            x = -b/a;
            System.out.println("Корені рівняння: х1 = 0 x2 = " + x);
        } else { // ax² + bx + c = 0
            double D;
            D = (b*b) - 4*a*c;
            if (D < 0){
                System.out.println("Рівняння не має коренів");
            } else if (D == 0) {
                x = -b/2*a;
                System.out.println("Корнь х= " + x);
            } else {
                double x1, x2;
                x1 = (-b - Math.sqrt(D))/(2*a);
                x2 = (-b + Math.sqrt(D))/(2*a);
                System.out.println("Корені рівняння: х1 = " + x1 + " x2 = " + x2);
            }
        }
    }
}
