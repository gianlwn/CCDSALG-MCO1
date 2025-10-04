import java.util.Scanner;

public class DriverQuickSort {
    public static void main(String[] args) {
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
        QuickSort.quickSort(suffixesArr, indicesArr, 0, size - 1);
        long endSortTime = System.nanoTime();

        System.out.println("\nSorted suffixes: \n");
        for (int i = 0; i < size; i++)
            System.out.printf("%" + width + "d: %-15s%n", indicesArr[i], suffixesArr[i]);

        System.out.println("\nSuffix array: \n");
        for (int i = 0; i < size; i++)
            if (i == size - 1)
                System.out.print(indicesArr[i]);
            else
                System.out.print(indicesArr[i] + ", ");

        System.out.printf("Time it took to sort: %.3f milliseconds\n", (endSortTime - startSortTime) / 1e6);
            
        sc.close();
    }
}
