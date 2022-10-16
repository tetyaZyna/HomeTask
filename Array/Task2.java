import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int [] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int j = values.length - 1;
        int [] valuesNew = new int[values.length];
        for (int i = 0; i < values.length; i++) {
            if (i == 0){
                valuesNew[i] = values[j];
            }
            else {
                valuesNew[i] = values[i-1];
            }
        }
        System.out.println("Current: " + Arrays.toString(values));
        System.out.println("New: " + Arrays.toString(valuesNew));
    }
}
