import java.util.Arrays;
//Arrays.sort() is fastest method for sorting a array in java
public class Sorting {
    public static void main(String[] args) {
        int[] arr = { 10, 1, 3, 4, 2, 5 };
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
