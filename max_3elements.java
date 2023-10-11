import java.util.*;

public class max_3elements {
    // find max 3 elements in an array

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int[] max = new int[3];
        int i, j, temp;
        for (i = 0; i < 3; i++) {
            max[i] = arr[i];
        }
        for (i = 0; i < 3; i++) {
            for (j = i + 1; j < 5; j++) {
                if (max[i] < arr[j]) {
                    temp = max[i];
                    max[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (i = 0; i < 3; i++) {
            System.out.println(max[i]);
        }
    }
}