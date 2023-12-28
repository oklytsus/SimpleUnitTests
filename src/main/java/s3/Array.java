package s3;

public class Array {
    public static int[] createArray() {
        return new int[]{1, 2, 3, 4, 5};
    }

    public static void main(String[] args) {
        int[] array = createArray();


        System.out.print("Array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

