import java.util.Scanner;

/*
 * Task 5: Arrays & Basic Data Analysis Program
 */

public class ArrayDataAnalysis {

    // Method to calculate sum
    static int calculateSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    // Method to find maximum value
    static int findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max)
                max = num;
        }
        return max;
    }

    // Method to find minimum value
    static int findMin(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min)
                min = num;
        }
        return min;
    }

    // Manual sorting (Bubble Sort)
    static void sortArray(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] numbers = new int[n]; // 1D array

        // Input values
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        // Data analysis
        int sum = calculateSum(numbers);
        double average = (double) sum / n;
        int max = findMax(numbers);
        int min = findMin(numbers);

        // Sorting
        sortArray(numbers);

        // Output
        System.out.println("\n--- Data Analysis Result ---");
        System.out.printf("Sum: %d%n", sum);
        System.out.printf("Average: %.2f%n", average);
        System.out.printf("Maximum: %d%n", max);
        System.out.printf("Minimum: %d%n", min);

        System.out.print("Sorted Array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        // 2D Array demonstration
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };

        System.out.println("\n\n2D Array Elements:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Exception handling demonstration
        try {
            System.out.println("\nAccessing invalid index:");
            System.out.println(numbers[n]); // Invalid index
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: Array index out of bounds.");
        }

        sc.close();
    }
}
