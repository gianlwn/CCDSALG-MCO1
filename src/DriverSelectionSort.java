import java.util.Scanner;

public class DriverSelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputStr = sc.nextLine();
        int size = inputStr.length();

        String[] unsortedSfx = new String[size];
        String[] sortedSfx = new String[size];
        int [] sfxArr = new int[size];

        for (int i = 0; i < size; i++) {
            unsortedSfx[i] = inputStr.substring(i, size);
            sfxArr[i] = i;
        }

        int width = String.valueOf(size - 1).length();
        System.out.println("\nAll suffixes: \n");
        for (int i = 0; i < size; i++)
            System.out.printf("%" + width + "d: %-15s%n", sfxArr[i], unsortedSfx[i]);

        SelectionSort.selectionSort(unsortedSfx, sortedSfx, sfxArr, size);

        System.out.println("\nSorted suffixes: \n");
        for (int i = 0; i < size; i++)
            System.out.printf("%" + width + "d: %-15s%n", sfxArr[i], sortedSfx[i]);

        System.out.println("\nSuffix array: \n");
        for (int i = 0; i < size; i++)
            if (i == size - 1)
                System.out.print(sfxArr[i]);
            else
                System.out.print(sfxArr[i] + ", ");
            
        sc.close();
    }
}
