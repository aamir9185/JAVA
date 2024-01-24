public class reverse {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };

        System.out.println("Array elements in reverse order:");

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println("Element at index " + i + ": " + array[i]);
        }
    }
}
