import java.util.Arrays;

public class Main2 {
    //другий варіант швидкого сортування
    public static void main(String[] args) {
        int[] x = { 8, 0, 4, 7, 3, 7, 10, 12, -3 };
        System.out.println("no sorted array");
        System.out.println(Arrays.toString(x));
        int low = 0;
        int high = x.length - 1;
        quickSort2(x, low, high);
        System.out.println("sorted array");
        System.out.println(Arrays.toString(x));
    }
    public static void quickSort2(int[] arr, int first, int last) {
        if (arr.length == 0)
            return;
        if (first >= last)
            return;
        int middle = first + (last - first) / 2;
        int opora = arr[middle];
        int i = first, j = last;
        while (i <= j) {
            while (arr[i] < opora) {
                i++;
            }
            while (arr[j] > opora) {
                j--;
            }
            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        if (first < j)
            quickSort2(arr, first, j);
        if (last > i)
            quickSort2(arr, i, last);
    }
}
