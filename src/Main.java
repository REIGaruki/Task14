import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] intArray = new int[]{0,1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(alterArray(intArray)));
    }

    private static int increaseOdd(int a) {
        if (a % 2 == 0) {
            return a+1;
        } else {
            return a;
        }
    }

    private static int[] writeFromMinToMax(int[] arr, int min, int max) {
        if (arr.length < min) {
            return writeFromMinToMax(arr, 1, arr.length);
        } else if (arr.length < max) {
            return writeFromMinToMax(arr, min, arr.length);
        } else {
            int[] newArr = new int[max - min + 1];
            for (int i = min - 1; i < max; i++) {
                newArr[i + 1 - min] = arr[i];
            }
            return newArr;
        }
    }

    private static int[] alterArray(int[] arr) {
        for (int i=0; i<arr.length; i++) {
            arr[i] = increaseOdd(arr[i]);
        }
        return writeFromMinToMax(arr, 3, 7);
    }
}
