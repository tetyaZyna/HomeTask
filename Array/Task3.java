import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int [] values1 = {1, 3, 5, 7, 9, 11, 13};
        int [] values2 = {2, 4, 6, 8, 10, 12};
        int j = values1.length + values2.length;
        int [] valuesMerge = new int[j];
        for (int i = 0, k = 0; i < values1.length; i++){
            valuesMerge[k] = values1[i];
            if (i < values2.length){
                k += 2;
            } else {
                k++;
            }
        }
        for (int i = 0, k = 1; i < values2.length; i++){
            valuesMerge[k] = values2[i];
            if (i < values1.length-1){
                k += 2;
            } else {
                k++;
            }
        }
        System.out.println("First array: " + Arrays.toString(values1));
        System.out.println("Second array: " + Arrays.toString(values2));
        System.out.println("Merge: " + Arrays.toString(valuesMerge));

    }
}
