public class Task1 {
    public static void main(String[] args) {
        int [] values = {1, 0, 2, 5, 6, 4, 10, 3};
        int max = values[0], min = values[0];
        int maxIndex = 0, minIndex = 0;
        int i = 0, j = 0, Sum = 0;
        while (i < values.length) {
            if (values[i] > max) {
                max = values[i];
                maxIndex = i;
            }
            i++;
        }
        while (j < values.length){
            if (values[j] < min) {
                min = values[j];
                minIndex = j;
            }
            j++;
        }
        for (i = minIndex; i < maxIndex; i++){
           Sum += values[i];
        }
        System.out.println("min index: " + minIndex);
        System.out.println("max index: " + maxIndex);
        System.out.println("sum: " + Sum);
    }
}
