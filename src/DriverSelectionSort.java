import java.util.Scanner;

public class DriverSelectionSort {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputStr = sc.nextLine();
        int size = inputStr.length();

        String[] suffixesArr = new String[size];
        int [] indicesArr = new int[size];

        for (int i = 0; i < size; i++) {
            suffixesArr[i] = inputStr.substring(i, size);
            indicesArr[i] = i;
        }

        int width = String.valueOf(size - 1).length();
        System.out.println("\nAll suffixes: \n");
        for (int i = 0; i < size; i++)
            System.out.printf("%" + width + "d: %-15s%n", indicesArr[i], suffixesArr[i]);

        long startSortTime = System.nanoTime();
        SelectionSort.selectionSort(suffixesArr, indicesArr, size);
        long startEndTime = System.nanoTime();

        System.out.println("\nSorted suffixes: \n");
        for (int i = 0; i < size; i++)
            System.out.printf("%" + width + "d: %-15s%n", indicesArr[i], suffixesArr[i]);

        System.out.println("\nSuffix array: \n");
        for (int i = 0; i < size; i++)
            if (i == size - 1)
                System.out.print(indicesArr[i]);
            else
                System.out.print(indicesArr[i] + ", ");
        long endTime = System.nanoTime();

        System.out.printf("\n\nTotal execution time of the program: %.3f seconds\n", (endTime - startTime) / 1e9);
        System.out.printf("Time it took to sort: %.3f milliseconds\n", (startEndTime - startSortTime) / 1e6);
            
        sc.close();
    }
}
