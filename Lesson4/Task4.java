public class Task4 {
    public static void main(String[] args) {
        int count = 21, Sum = 1;
        int [] Fibonacci = new int[count];
        Fibonacci[1] = 1;
        System.out.println("The first 20 Fibonacci numbers are:");
        System.out.print(Fibonacci[1] + " ");
        for (int i = 2; i < count; i++) {
            Fibonacci[i] = Fibonacci[i - 1] + Fibonacci[i - 2];
            Sum += Fibonacci[i];
            System.out.print(Fibonacci[i] + " ");
        }
        double Sd = Sum, Cd = count-1;
        double Average = Sd/Cd;
        System.out.println();
        System.out.println("The average is " + Average);
    }
}
