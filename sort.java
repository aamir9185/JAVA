import java.util.Arrays;

interface Number {
    void readValues(int[] numbers);
    void sortAscending();
    void sortDescending();
}

class Sorting implements Number {
    private int[] numbers;

    public void readValues(int[] numbers) {
        this.numbers = numbers;
    }

    public void sortAscending() {
        Arrays.sort(numbers);
        System.out.println("Numbers sorted in ascending order: " + Arrays.toString(numbers));
    }

    public void sortDescending() {
        Arrays.sort(numbers);
        int n = numbers.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[n - i - 1];
            numbers[n - i - 1] = temp;
        }
        System.out.println("Numbers sorted in descending order: " + Arrays.toString(numbers));
    }
}

public class sort {
    public static void main(String[] args) {
        Sorting sorting = new Sorting();

        int[] values = {9, 2, 5, 1, 7}; // Example array of values

        sorting.readValues(values);
        sorting.sortAscending();
        sorting.sortDescending();
    }
}
